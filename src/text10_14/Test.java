package text10_14;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num=0;
        boolean index = true;
        while (index) {
            boolean flag = false;
             num = (int) (Math.random() * 7 + 1);
            for (int i = 0; i<sum; i++) {
                if (num == a[i]) {
                    flag = true;
                }
            }
            if (!flag) {
                a[sum++] = num;
            }
            if(sum== a.length){
                index=false;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
