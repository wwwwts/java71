package text10_14;

import java.util.Arrays;

public class Zye2_3 {
    public static void main(String[] args) {
        int index = 0;
        boolean flat = false;
        String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", "Robin", "Anne"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("sam")) {
                index = i;
                flat = true;
                break;
            }
        }
        if (flat) {
            System.out.println("sam元素在数组中的位置是第："+(index+1)+"位");

        } else {
            System.out.println("不在数组中！");
        }
        System.out.println(Arrays.toString(names));


    }
}



