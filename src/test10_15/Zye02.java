package test10_15;

public class Zye02 {
    public static void main(String[] args) {
        int[][] arrays={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        for (int i = 0; i < arrays.length; i++) {
            int sum=0;
            System.out.print("第"+(i+1)+"季度: ");
            for (int j = 0; j < arrays[i].length; j++) {
                sum+=arrays[i][j];
                System.out.print(arrays[i][j]+" ");
            }
            System.out.print("第"+(i+1)+"季度的总和: "+sum);
            System.out.println();
        }
    }
}
