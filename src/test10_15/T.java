package test10_15;

import java.util.Arrays;

public class T {
    public static void main(String[] args) {
        int i = 0;int j,n = 3;
        j = n/2;
        int arr[][] = new int [n][n];
        for(int k = 1;k <= n*n;k++)
        {
            arr[i][j] = k;
            if(k%n == 0)
            {
                i = (i+1)%n;
                //向上一行
            }
            else
            {
                i = (i-1+n)%n;
                j = (j+1)%n;
                // 向右一列
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.printf("%3d",arr[i][j]);
            System.out.println();
        }


    }
}
