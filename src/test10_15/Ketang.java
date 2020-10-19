package test10_15;

import java.util.Arrays;

public class Ketang {
    public static void main(String[] args) {
        int index=-1;
        String [] array={"aaa",null,"ccc","ddd"};
        for (int i = 0; i < array.length; i++) {
            if(array[i]==null){
                index=i;
                break;
            }
        }
        array[index]="bbb";
        System.out.println(Arrays.toString(array));
    }
}
