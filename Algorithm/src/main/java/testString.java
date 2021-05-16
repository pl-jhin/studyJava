public class testString
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (true){
            i++;
            try {
                sb.append("a");
            }catch (OutOfMemoryError e){
                System.out.println(i);
            }
        }
    }
}
