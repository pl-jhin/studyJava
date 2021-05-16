import java.text.ParseException;
import java.text.SimpleDateFormat;

public class time {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date begin=dfs.parse("2004-01-02 11:30:24");
        java.util.Date end = dfs.parse("2004-03-26 13:31:40");
        long between=(end.getTime()-begin.getTime())/1000;//除以1000是为了转换成秒
        long day1=between/(24*3600);
        long hour1=between%(24*3600)/3600;
        long minute1=between%3600/60;
        long second1=between%60/60;
        long secondAll = (day1*24*60*60)+(hour1*60*60)+(minute1*60)+second1;
        System.out.println(""+day1+"天"+hour1+"小时"+minute1+"分"+second1+"秒");
        System.out.println("总时间:"+secondAll/60);
    }
}
