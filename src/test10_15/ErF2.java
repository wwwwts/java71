package test10_15;
import java.util.Scanner;
public class ErF2 {
    public static void bin(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] < num) {
                low = mid + 1;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                System.out.println(mid);
               break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int[] arr = {4, 12, 34, 45, 46, 50, 56, 76};
        System.out.println("请输入查找的数为：");
        int num1= input.nextInt();
        bin(arr,num1);
//        int index = bin(arr, num1);
        //System.out.println(num1+"的位置是"+( bin(arr,num1)));
    }
}
