package Hello;

import java.util.Scanner;

public class HelloWorld {
  public static void main(String [] args){
        System.out.println("请输入一段大小写字母：");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String str1 = str.toUpperCase();
        String str2 = str.toLowerCase();
        System.out.println("大写输出"+str1);
        System.out.println("小写输出"+str2);

    }



}
