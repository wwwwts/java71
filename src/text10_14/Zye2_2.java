package text10_14;

import java.util.Arrays;

public class Zye2_2 {
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
            names[index] = "TTT";

        } else {
            System.out.println("不能进行删除！");
        }
        System.out.println(Arrays.toString(names));


    }
}




