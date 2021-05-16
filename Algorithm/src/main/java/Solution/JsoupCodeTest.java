package Solution;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.springframework.util.CollectionUtils;

/**
 * 模拟登录带验证码
 */
public class JsoupCodeTest {
    private String url_safecode = "https://www.ktbnetbank.com/consumer/captcha/verifyImg?random=0.17605570813675087"; // 验证码
    private String url_encode = ""; // 加密字符串
    private String url_Login = "https://www.ktbnetbank.com/consumer/Login.do"; // 登录
    private String username = "night19101999";
    private String password = "yujuan1995";
    String fileName = System.currentTimeMillis() + ".png";
    private String path = JsoupCodeTest.class.getResource("/").getPath().replaceAll("%20", " ") + System.currentTimeMillis() + fileName;
    private Map<String, String> cookie;

    /**
     * 下载验证码
     * 保存Cookie
     *
     * @throws IOException
     */
    public void getSafeCode() throws IOException {
        Response response = Jsoup.connect(url_safecode).ignoreContentType(true) // 获取图片需设置忽略内容类型
                .userAgent("Mozilla").method(Method.GET).timeout(30000).execute();
        cookie = response.cookies();
        byte[] bytes = response.bodyAsBytes();
        Util.saveFile(path, bytes);
        System.out.println("保存验证码到：" + path);
    }

    /**
     * 登录教务系统
     */
    public void initLogin() throws IOException {
        System.out.println("输入验证码：");
        Scanner scan = new Scanner(System.in);
        String code = scan.next();
        try {
            Map<String, String> data = new HashMap<String, String>();
            data.put("cmd", "login");
            data.put("userId", "");
            data.put("password", "");
            //data.put("encoded", getEncoded());
            data.put("imageCode", code);
            Connection connect = Jsoup.connect(url_Login)
                    .header("Accept",
                            "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .userAgent("Mozilla").method(Method.POST).data(data).timeout(3000);
            for (Map.Entry<String, String> entry : cookie.entrySet()) {
                connect.cookie(entry.getKey(), entry.getValue());
            }
            Response response = connect.execute();
            String html = response.body().toString();
            Element body = Jsoup.parse(html);
            Elements scripts = body.select("script");
            for (Element el : scripts) {
                //System.out.println(el);
                List<Node> nodes = el.childNodes();
                if (!CollectionUtils.isEmpty(nodes)) {
                    Node node = el.childNodes().get(0);
                    Attributes attributes = node.attributes();
                    String result = attributes.toString();
                    if (result.contains("sessionKey")) {
                        String[] lists = result.split("sessionKey=");
                        String sessionKey = lists[0];
                        System.out.println("=========================================");
                        System.out.println(sessionKey);
                        Util.deleteFile(path);
                        String pattern = "sessionKey.*";
                        Pattern r = Pattern.compile(pattern);
                        Matcher matcher = r.matcher(sessionKey);
                        if (matcher.find()) {
                            sessionKey = matcher.group(0);
                            r = Pattern.compile("'(.*)'");
                            matcher = r.matcher(sessionKey);
                            if (matcher.find()) {
                                sessionKey = matcher.group();
                                System.out.println("最终结果：" + sessionKey.replaceAll("\'", ""));
                            } else System.out.println("没有匹配");
                        }else System.out.println("没有匹配");
                    }
                }

            }
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws IOException {
        JsoupCodeTest jsoupSafeCode =  new JsoupCodeTest();
        jsoupSafeCode.getSafeCode();
        jsoupSafeCode.initLogin();

    }
}
