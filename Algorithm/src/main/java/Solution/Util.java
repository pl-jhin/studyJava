package Solution;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Util {
    /**
     * 将字节流转换成文件
     *
     * @param filename
     * @param data
     * @throws Exception
     */
    public static void saveFile(String filename, byte[] data) {

        if (data != null) {
            String filepath = filename;
            File file = new File(filepath);
            if (file.exists()) {
                file.delete();
            }
            try {
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(data, 0, data.length);
                fos.flush();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 删除文件
     * @param filename
     */
    public static void deleteFile(String filename) {
        if (filename != null) {
            String filepath = filename;
            File file = new File(filepath);
            if (file.exists()) {
                file.delete();
            }
        }
    }

}
