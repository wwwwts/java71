package text10_14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Shuz_xgai {
    public static void main(String[] args) {

        String[] zms = {"a", "b", "null", "d", "e"};
    Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字母：");
        String zm = input.next();
        char s= zm.charAt(0);
        boolean flag = false;
        int j = -1;
        for (int i = 0; i < zms.length; i++) {
            if (zms[i].equals("null")) {
                j = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            zms[j] = zm;

        } else {
            System.out.println("没有空！");
        }
        for (String k : zms
        ) {
            System.out.println(k);
        }
    }
}
