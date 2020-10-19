package text10_14;

import java.util.Arrays;

public class Shuz {
    public static void main(String[] args) {
        String [] oldFruits={"apple","Peach","Pear","Banana","Grape"};
        String[] newFruits=new String[oldFruits.length+1];
        System.arraycopy(oldFruits,0,newFruits,0,oldFruits.length);
        for (int i = 0; i < newFruits.length; i++) {
            if(newFruits[i]== null) {
                newFruits[i] = "Orange";
                break;
            }
        }
        System.out.println(Arrays.toString(newFruits));
    }
}
