package Test;

import java.util.Scanner;

public class zye29 {
    public static void main(String[] args) {
    /*  Scanner input =new Scanner(System.in);
        int score=0 ;
        int min;
        int max;
         max=min=score;
        double sum=0;
        double avg;
        for(int i=1;i<=3;i++){
            min=0;
            max=0;
            for(int j=1;j<=5;j++){
            System.out.println("请输入第"+i+"班级"+j+"个学生的成绩");
                 score = input.nextInt();
                 sum+=score;
                 if(score>=max){
                     max=score;
                 }else{
                     max=max;
                 }
                if (score<=min||min==0){
                    min=score;
                }else{
                    min=min;
                }
                //
               if(score>max){
                max=score}
                else{
                min=score}
                //

            }
            System.out.println("请输入第"+i+"班的总分为："+sum);
            System.out.println("请输入第"+i+"班的平均分为："+sum/5);
            System.out.println("请输入第"+i+"班的最高分为："+max);
            System.out.println("请输入第"+i+"班的最低分为："+min);
        }*/
       /* int sum=4;
    System.out.print("1-100之间所有质数:  2 3 5 7 ");
        for(int i=1;i<=100;i++){
            if(i>=10&&i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                sum=++sum;
            System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("1-100之间有"+sum+"个质数");*/
       /* for(int i=1;i<=7;i++) {
            System.out.println("请输入一位整数：");
        int num = input.nextInt();

            switch (num) {
                case 1:
                    System.out.println("星期一");
                   continue;
                case 2:
                    System.out.println("星期二");
                    continue;
                case 3:
                    System.out.println("星期三");
                    continue;
                case 4:
                    System.out.println("星期四");
                    return;
                case 5:
                    System.out.println("星期五");
                    return;
                case 6:
                    System.out.println("星期六");
                    return;
                case 7:
                    System.out.println("星期日");
                    return;
                default:
                    System.out.println("请重新输入！");
            }
        }*/
      /* Scanner input = new Scanner(System.in);
        System.out.print("您想要几行数字?");
        int num  = input.nextInt();
        for(int i =1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int m=0;m<2*i-1;m++){
            System.out.print(i);}
            System.out.println("");
        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = input.nextInt();
        int m = 0;
        int[] n =new int[9];
        int []e = new int [90];
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a - i; k++) {
                System.out.print(" \t");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                if (b == 1 || b == 2 * i - 1) {
                    System.out.print(i + "\t");
                } else {
                   for(;m < i - 2;m++){
                        System.out.print(9+"\t");
                      break;
                    }
                        System.out.print(" \t");

                }
                System.out.println();
            }
            /*for (i = (a - 1); i >= 1; i--) {
                for (int k = 1; k <= a - i; k++) {
                    System.out.print(" \t");
                }
                for (int b = 1; b <= 2 * i - 1; b++) {
                    if (b == 1 || b == 2 * i - 1) {
                        System.out.print(i + "\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
                System.out.println();
            }*/
        }
    }
}