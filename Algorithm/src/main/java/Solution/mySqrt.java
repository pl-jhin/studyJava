package Solution;

public class mySqrt {
    public static int mySqrt(int x) {
        System.out.println(x/2);
        if (x == 0 )return 0;
        for (int i = 1 ;i<=x/2;i++){

            int j = i+1;
            if (x-(i*i)==0) {
                return i;
            }
            else if (x-(j*j)==0) {
                return j;
            }
            else if ((x-(i*i)>0)&&((j*j)-x>0)){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
