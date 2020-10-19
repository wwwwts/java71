package test10_15;

import java.util.Arrays;
import java.util.Scanner;

public class ShuzAdd {
    public static void main(String[] args) {
        int []array={1,2,3,5,6,7,8,9};
        Scanner input=new Scanner(System.in);
        System.out.println("要新增几个数：");
        int number= input.nextInt();
        int [] nw = Arrays.copyOf(array,array.length+number);
        for (int i = 0; i <number; i++) {
            System.out.println("第"+(i + 1)+"数是：");
            int number1= input.nextInt();
            System.out.println(number1+"添加在第几位：");
            int number2=input.nextInt();
           /* for (int j = array.length + i; j > number2 - 1; j--) {
                nw[j] = nw[j-1];
            }
            nw[number2 - 1] = number1;*/
//            for (int j = 0; j < nw.length; j++) {
//                if(number2==(j+1)){
//                    nw[j]=number1;
//                }
//            }

        }
        System.out.println(Arrays.toString(nw));

        }
}
