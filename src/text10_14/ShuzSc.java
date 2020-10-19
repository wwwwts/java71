package text10_14;

import java.util.Arrays;
import java.util.Scanner;

public class ShuzSc {
    public static void main(String[] args) {
        String []array ={"abb","acc","ass","aaa"};
        System.out.println("你要删除的字符串：");
        Scanner input =new Scanner(System.in);
       String sc=input.next();
        int index=-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(sc)){
                index=i;
                break;
            }
        }
        if(index!=-1) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length-1]=null;
        }
        String []arr1=Arrays.copyOf(array,3);
        System.out.println(Arrays.toString(arr1));
    }
}
