package Test;

import java.util.Scanner;

public class Test10_10 {
    /*public static void main(String [] args) {
        System.out.println("请输入任意一个数据：");
       boolean  flag=false;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] array = new int[]{8, 4, 2, 1, 23, 344, 12};
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
               flag=true;
               break;
        }
    }
    if(flag==true){
        System.out.println("有这个数！");}
    else{
        System.out.println("没有这个数！");
    }
    }*/
    //判断数组中是不是存在某一个数
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第" + (i + 1) + "个元素:");
            int a = input.nextInt();
            array[i] = a;
        }
        System.out.println("打印出来的结果为：");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        System.out.println("******************");
        System.out.println("最后的结果为：");
array[0]=array[4];
        for (int i = 4; i >= 0; i--) {
            array[i] = array[i - 1];
            System.out.print(array[i] + "\t");
        }
    }
    }

