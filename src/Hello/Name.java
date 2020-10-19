package Hello;

import java.util.Random;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int num = input.nextInt();
        int geiwei = num % 10;
        int shiwei = num / 10 % 10;
        int baiwei = num / 100 % 10;
        int qianwei = num / 1000 % 10;
        int number = geiwei +shiwei + baiwei + qianwei;
        System.out.println("输出调换后的数：" + number);
        int add = num + number;
        System.out.println("这两个数相加的和：" + add);
    }
}