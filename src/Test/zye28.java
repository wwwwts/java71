package Test;

import java.sql.SQLOutput;
import java.util.Scanner;
public class zye28 {
    public static void main(String[] args) {
     /* System.out.println(" ");
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*"+"\t");
            }

            System.out.println("" + "\t");
        }*/
        /*for (int i = 1; i <= 9; i++) {
            if (i <= 5) {
                for (int k = 1; k <= 5 - i; k++) {
                    System.out.print(" " + "\t");
                }
                for (int j = 1;j <= (2 * i - 1); j++) {
                    if (j==1||j==2*i-1){
                    System.out.print("* " + "\t");}
                    else { System.out.print(" " + "\t");}
                }
                System.out.println();
            } else {
                for (int m = 5; m <= i - 1; m++) {
                    System.out.print(" " + "\t");
                }
                for (int n = 1; n <= (19 - 2 * i); n++) {
                    if(n==1||n==19-2*i){
                    System.out.print("*" + "\t");}
                    else  { System.out.print(" " + "\t");}
                }
                System.out.println();
            }
        }*///空心棱形
   /*     System.out.println("1-100中不能被7整除的数：");
        int sum=0;
        for (int i=1;i<=100;i++){
            if (i%7!=0){
                System.out.print(i+" ");

                if(i%10==0) {
                    System.out.println("");}

                sum=sum+i;
            }

        }
System.out.println("1-100中不能被7整除的数的和为"+sum);*/
        /*for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名");
            String name = input.next();

            System.out.println("请输入密码：");
            String password = input.next();
            if ("admin".equals(name) && "123456".equals(password)) {
                System.out.println("登录成功，欢迎进入二次元系统！");
                break;
            } else if
            (!"admin".equals(name) && !"123456".equals(password))
             (name.equals(username）&&pw==password))//在前面定义好 String name=uesrname ;字符串比要用equals,数字就是用==
                         {
                System.out.println("用户名和密码错误");
            }
            if (3 - i == 0) {
                System.out.println("你无权进入!");
            } else {
                System.out.println("你还有" + (3 - i) + "次机会,请重新输入：");
            }
        }*/
               /* int length=1;//存储菱形的边长的变量
                Scanner sc =new Scanner(System.in);//输入数据的扫描对象
                System.out.println("请输入菱形的边长：");
                length = sc.nextInt();//获取输入的边长数值
                */
        /*打印菱形的上半部分三角dao形 行数为length行
                for (int i=1; i<=length;i++) {//需要打印的行数
                    for(int j=1;j<=length-i;j++) {//打印左边空白的区域，随行递减1
                        System.out.print(" ");
                    }
                    for(int k=1;k<=2*i-1;k++){//打三角形的区域
                        if(k==1||k==2*i-1){//空心的获取 除每行第一个以及最后一个 外其余为空白
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

        打印菱形的下半部分三角形 中间行公用 故行数为length-1
                for (int i = length-1;i>0;i--){
                    for(int j=1;j<=length-i;j++){
                        System.out.print(" ");
                    }
                    for(int k=1;k<=2*i-1;k++){
                        if(k==1||k==2*i-1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }*/
for(int i=1;i<=6;i++){

for(int j=1;j<9;j++){
        if (j % 5 == 0) {
            return;//跳出这个方法；//break 跳出for循环，方法体内的仍然运行，continue//跳出本次for循环，进入下一次循环！
        }
    System.out.print(j+"  ");
    }
    System.out.print(i+"  ");
}
    }

    }
