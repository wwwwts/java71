package text10_14;

import java.util.Arrays;

public class Zye {
    public static void main(String[] args) {
        int index=0;
        String[]names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                index=i;
                break;
            }
        }
        names[index]="Abb";
        System.out.println(Arrays.toString(names));
    }
}
