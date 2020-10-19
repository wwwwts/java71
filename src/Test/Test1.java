package Test;
import com.sun.deploy.security.SelectableSecurityManager;
import sun.awt.geom.AreaOp;
import java.util.Random;
import java.util.Scanner;
public class Test1 {
    /* public static void main(String[] args){
         int i=0;
         int []a = new int[5];
       int []f=new int[9];
         Scanner input = new Scanner(System.in);
         System.out.println("请输入一个数字：");
         a[i] = input.nextInt();
         Random random =new Random();
         int shuiji = random.nextInt(100);
         System.out.println("随机数"+shuiji);
            for (;i<a.length&&a[i]!=shuiji;i++){
                System.out.print("重新输入：");
                a[i+1] = input.nextInt();
            }
         System.out.println("恭喜中奖了！");
         }*///输入的数和随机数相等时,为中奖
    public static void main(String[] args) {
     /*  System.out.println("产生随机数：");
       Random shuiji = new Random();
       int a = shuiji.nextInt(100);
       System.out.println("这个数"+a);
       if(0<=a&&a<=50){
           if(0<=a&&a<=25){
               if(0<=a&&a<=12) {
               }else if(0<=a&&a<=25){}
               System.out.println("数在0到25之间：");
           }else if(25<a&&a<=50){
               System.out.println("数在26到50之间：");
           }
       }else if(a>50&&a<=100)
           System.out.println("数在56到100之间：");
   }*///100以内找数
      /* {
           int a = 0;
           int i = 0;

           while (a <= 100&&a%2==0) {

               i = i + a;
               a = a + 1;

           }
           System.out.println("100以内的偶数相加：" + i);

       }*///100以内的偶数相加
     /* System.out.println("请输入性别：");
      Scanner input = new Scanner(System.in);
      String sex = input.next();
      while( "男".equals(sex)||"女".equals(sex)){
          System.out.println("重新输入：");
         String sewx = input.next();
      }*/
       /*System.out.println("请输入一个整数：") ;
   Scanner input  = new Scanner(System.in);
   int num=input.nextInt();
   int a,b;
   for ( b=0,a=num; b<num; a--,b++){
       //for 循环里面刚开始要是已经定义了就不需要定义了；前面为赋值，之间为判断，后面是跳出循环的操作！
       System.out.println(b+"+"+a+"="+ (b+a));
   }
*/
      /* System.out.println("输出九九乘法表：");
       int a;
       int b;
       for(a=1,b=1;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=2,b=2;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=3,b=3;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=4,b=4;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=5,b=5;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=6,b=6;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=7,b=7;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=8,b=8;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }
       System.out.println("");
       for(a=9,b=9;a<=9&&b<=9;b++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");

       }*/
       /*System.out.println("输出九九乘法表：");
       int a;
       int b;
       for(a=1,b=1;a<=1&&b<=1;b++){
           System.out.println(a+"*"+b+"="+(a*b));
       }
       for(a=1,b=2;a<=2&&b<=2;a++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");
       }
       System.out.println("");
       for(a=1,b=3;a<=3;a++){
           System.out.print(a+"*"+b+"="+(a*b)+"\t");
       }*/
      /*  System.out.println("输出九九乘法表：");
        int a;
        int b;
        for (a = 1; a <= 9; a++) {

            for (b = 1; b <= a; b++) { //b小于a,确保运行次数;
                System.out.print(b + "*" + a + "=" + (a * b) + "\t");

                if(a==b){
                    System.out.println("");
                }
            }
        }*/
   /*    Scanner input =new Scanner(System.in);//输入值；
        System.out.println("请输入性别：");
       String sex = input.next();
       do{
           if(sex.equals("男")){
           System.out.println("进入男子组！");
        }else if (sex.equals("女")){
           System.out.println("进入女子组！");
        }}
       while(!sex.equals("男")&&!sex.equals("女"));*/
       /* for(int i=1;i<=5;i++){
                for(int k=1;k<=5-i;k++){
                    System.out.print(" ");
                }
                for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");*/
        //输出平行四边形
      /*  for (int i = 1; i <= 5; i++) {
for (int m=1;m<=5-i;m++){
    System.out.print(" ");
}
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println("");*/
        //输出三角形
        /*int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }*/
        //九九乘法表
        for (int i = 1; i <= 9 ; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }

}