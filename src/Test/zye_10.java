package Test;

import javax.swing.*;
import java.util.MissingFormatArgumentException;
import java.util.Random;
import java.util.Scanner;
public class zye_10 {
    public static void main(String[] args)
    {
   /* *//*    Scanner input =new Scanner (System.in);
        int []array=new int[4];
        System.out.println("请输入"+array.length+"家店的价格：");
        for(int i=0;i<array.length;i++){
            System.out.print("第"+(i+1)+"店的价格：");
            array[i]= input.nextInt();
        }
            int min=array[0];
        for(int j= 1;j< array.length;j++){
            if (array[j] >min) {
               min=min;
                }
            else{
                min=array[j];
            }
            }
        System.out.println("最低价格是："+min);*//* //求出4家店的最低手机价格
        *//*Scanner input =new Scanner (System.in);
        double []array=new double[5];
        double sum=0;
        System.out.println("请输入会员本月的消费记录：");
        for(int i=0;i<array.length;i++){
            System.out.print("请输入第"+(i+1)+"笔购物金额：");
            array[i]= input.nextDouble();
            sum+=array[i];
        }
        System.out.println("序号\t\t金额（元）");
        for(int i=0;i< array.length;i++){
            System.out.println((i+1)+"\t\t"+array[i]);
        }
        System.out.println("总金额\t\t"+sum);*//*//数组存储5笔购物金额，在控制台输出并计算总金额
       *//* Scanner imput=new Scanner(System.in);
        int []array=new int[10];
        for(int i=0;i< array.length;i++){
            System.out.print("请输入"+(i+1)+"个数：");
            array[i]= imput.nextInt();
        }
        System.out.print("这个数组的数为：");
        for(int a:array){
            System.out.print(a+"\t");
        }*//*//使用数组静态初始化方式初始化一个大小为10的整型数组并输出。
        *//*Scanner input = new Scanner(System.in);
        String[] array = new String[]{"my", "new", "name", "is", "are", "he", "she", "school", "home", "class"};
        System.out.println("请输入一个单词：");
        String word = input.next();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i])) {
                flag = true;
                break;
            }
        }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }*//*//数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
       *//* int [] array=new int[10];
        Random random = new Random();
for(int i=0;i< array.length;i++){
    array[i]= random.nextInt(100);
    System.out.print(array[i]+"\t");
}
int max=array[0];
int min=array[0];
for(int i=1;i< array.length;i++){
    if(array[i]>max){
        max=array[i];
    }else{
        max=max;
    }
}
        for(int i=1;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }else{
                min=min;
            }
        }
        System.out.println();
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);*//*//利用Java的Math类的random()方法，随机生成10个数，填充一个数组，并找出产生10个随机数中最大的、最小的数。
        *//*int m = 0;
        int sum=0;
        int oldArr[] = {1, 2, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 6, 7, 0, 5,};
        for (int a : oldArr) {
            System.out.print(a + "\t");

        }
        for (int i=0;i< oldArr.length;i++){
            if(oldArr[i]==0){
                sum+=1;
            }
        }
            int newArr [] = new int[oldArr.length-sum];

        System.out.println(" ");
        for (int i=0;i< oldArr.length;i++) {
            if (oldArr[i]!= 0) {
                newArr[m]=oldArr[i];
                m++;
            }else{
                newArr[m]=newArr[m];
            }
        }
        for(int o:newArr)
        System.out.print(o+"" +"\t");*//*//删除数组里面为0的数字
        *//*int [] array=new int[]{8,4,2,1,23,344,12};
        int sum=0;
        boolean flag=false;
        Scanner input = new Scanner(System.in);
        System.out.println("这个数组的数为：");
        for(int a:array){
            System.out.print(a+" ");
            sum=sum+a;
        }
        System.out.println("");
        System.out.println("这个数组的和为"+sum);
        System.out.println("请输入一个数字：");
        int a=input.nextInt();

        for(int b:array){
            if(a==b){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("这个数在这个数组中！");
        }else {
            System.out.println("这个数不在这个数组中！");
        }*//*
     *//* int array [] ={99,85,82,63,68,};
      int []b=new int[8];
     int []ay=new int[6];
       Scanner input=new Scanner(System.in);
        System.out.println("请输入您要输入的数字：");
        int num= input.nextInt();
        int n= array.length-1;

        for(int i=0;i< array.length;i++){
            if(num>=array[i]){
                n=i;
                break;
            }
        }
        //找到数的位置，标记为n,将后面的位置后移一位；
        for(int j= array.length-1; j>n; j--){
            array[j]=array[j-1];
        }

            array[n]=num;
        for(int y:array)
        { System.out.print(y+" ");}*//*//在数组中加入一个数，并排序
        *//*int[]array=new int[6];
        Scanner input = new Scanner(System.in);
        Random input1  = new Random(100);
        for (int i = 0; i < array.length; i++) {
            array[i]=input1.nextInt(100);
        }
        for(int a:array){
            System.out.print(a+" ");
        }
        System.out.println("请输入一个数字：");
        int num= input.nextInt();
        boolean flag=false;

        for(int b:array){
            if(num==b){
               flag=true;
               break;
            }
        }
        if(flag){
            System.out.println("这个数在数组中!");
        }else {
            System.out.println("这个数不在数组中！");
        }*//* //随机产生数来填充数组，再自己输入一个数，判断是不是在数组中！
       *//*Scanner input =new Scanner(System.in);
        Random input1 = new Random(10);
        int[] array = new int[6];
        for (int m = 0; m < array.length; m++) {
            array[m]= input1.nextInt(100);
        }
        for(int y:array){
            System.out.print(y+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
for(int m:array){
    System.out.print(m+" ");
}*//* //冒泡排序*/
    }
        }





