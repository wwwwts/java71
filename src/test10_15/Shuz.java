package test10_15;

import java.util.Scanner;

public class Shuz {
    public static void main(String[] args) {
        int[][] array=new int [2][3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=input.nextInt();
            }
        }
    }
}
