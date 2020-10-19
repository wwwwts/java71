package test10_16;
public class SanJiao {
    public static void main(String[] args) {
       int[][] array=new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                if(j==0||j==i){
                    array[i][j]=1;
                }else{
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
