package Test;

import java.util.Scanner;

public class Test2 {
int a;
    public void main(String [] args){
        int m=1;
        System.out.println(a);
      int []b=new int[5];
       Scanner input = new Scanner(System.in);

       for(int n=0;n<b.length;n++){
           System.out.println("请输入第"+(n+1)+"数:");
           b[n]= input.nextInt();
       }
       System.out.println("这个数组的数："+b[0]+b[1]+b[2]+b[3]+b[4]);

       for(int i=0;i<b.length;i++)
        {
            System.out.println("\n这个数组的第"+(i+1)+"数是："+b[i]);
        }
        /*int score;
        int sum=0;
        int avg;
        int i=1;
        boolean isNegative =false;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name =input.next();
        System.out.println("请输入学生的第1门课的成绩：");
        do {
            score= input.nextInt();
            i--;
            if(score<0){
                i++;
                System.out.println("抱歉，请重新输入"+i+"成绩");
            }else if(score>=0){
                i++;
                System.out.println("请输入"+(i++)+"成绩：");
            }
            sum+=score;
        }while(i<=5);
*//*if(isNegative==true){
    System.out.println("抱歉，分数录入错误，请重新录入:");
}
else{*//*
    avg=sum/5;
    System.out.println(name+"的平均分是："+avg);*/


  }
    }

