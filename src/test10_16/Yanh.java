package test10_16;
import java.util.Scanner;
public class Yanh {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入数组的行和列：");
        int a= input.nextInt();
        int b= input.nextInt();
        int[][] array=new int[a][b];
        System.out.println("请输入数组的元素：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=input.nextInt();
            }
        }
        System.out.println("依次打印输入的二维数组：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("依次输出行列颠倒的二维数组：");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
        }
