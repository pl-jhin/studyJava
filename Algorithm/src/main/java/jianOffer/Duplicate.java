package jianOffer;

public class Duplicate {
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if (length <= 0 || numbers == null) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            int index = numbers[i];
            if (index >= length) {
                index -= length;
            }
            if (numbers[index] >= length) {
                //duplication[0] = index;
                return true;
            }
            numbers[index] += length;

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,0,2,5,3};
        System.out.println(duplicate(arr,7,null));
    }
}
