import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int  min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
            for (int j = 0 ; j<arr.length;j++){
                System.out.print(arr[j]+ ' ');
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(time);
    }
    

}

