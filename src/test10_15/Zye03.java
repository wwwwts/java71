package test10_15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zye03 {
    public static void main(String[] args) {
        System.out.print("Java"+" "+"JSP"+" "+"CoreJava"+" "+"MySQL"+" "+"HTML5");
        int[][] arrays = new int[3][5];
        Scanner input=new Scanner(System.in);
        int[] sum=new int[3];
        double score=0;
        for (int i = 0; i < arrays.length; i++) {
            System.out.println();
            int sum1=0;
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = (int) (Math.random() * 100);
                sum1+=arrays[i][j];
                System.out.print(arrays[i][j]+"    ");
                sum[i]=sum1;
            }
        }
        System.out.println();
        System.out.print("三个学生的成绩总和：");
        System.out.println(Arrays.toString(sum));
        System.out.println("查询1.Java  2.JSP  3.CoreJava  4.MySQL  5.HTML所有学员的平均分：");
        System.out.print("请选择：");
        int number=input.nextInt();
        switch(number){
            case 1:
                for (int j = 0; j < arrays.length; j++) {
                    score+=arrays[j][0];
                }
                System.out.println(score/ arrays.length);
                break;
            case 2:
                for (int j = 0; j < arrays.length; j++) {
                    score+=arrays[j][1];
                }
                System.out.println(score/arrays.length);
                break;
            case 3:
                for (int j = 0; j < arrays.length; j++) {
                    score+=arrays[j][2];
                }
                System.out.println(score/arrays.length);
                break;
            case 4:
                for (int j = 0; j < arrays.length; j++) {
                    score+=arrays[j][3];
                }
                System.out.println(score/arrays.length);
                break;
            case 5:
                for (int j = 0; j < arrays.length; j++) {
                    score+=arrays[j][4];
                }
                System.out.println(score/arrays.length);
                break;
        }
    }
}