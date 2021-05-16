public class Main {

    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                num = 13-i-j;
                if (num*i*j==36) System.out.println(i+"--"+j+"--"+num);
            }
        }
    }
}
