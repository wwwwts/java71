package World;

import java.util.Random;
import java.util.Scanner;
//判断一个数的奇偶；
public class World {
    public static void main(String [] args) {
       System.out.println("请输入一个数字：");
       Scanner input = new Scanner (System.in);
       int num = input.nextInt();
       String result = (num%2==0)?"偶数":"基数";
System.out.println("该数是："+result);
    }
}