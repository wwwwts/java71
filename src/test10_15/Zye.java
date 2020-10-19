package test10_15;

public class Zye {
    public static void main(String[] args) {
        int[][] array = {{67, 68, 69}, {77, 78, 79}, {88, 89, 90}, {90, 91, 91}, {94, 95, 96}};
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            int avg = 0;
            int index = 0;
            for (int j = 0; j < array[i].length; j++) {
                int max = array[0][0];
                int min = array[0][0];
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j + 1];
                }
                sum = sum + array[i][j];
                avg = sum / array[i].length;
                if (j == array[i].length - 1) {
                    System.out.print("第" + (i + 1) + "学生成绩总和：" + sum+" ");
                    System.out.print("第" + (i + 1) + "学生平均分：" + avg+" ");
                    System.out.print("第" + (i + 1) + "学生最高分：" + max+" ");
                    System.out.println("第" + (i + 1) + "学生最低分：" + min);
                }
            }
        }
    }
}
