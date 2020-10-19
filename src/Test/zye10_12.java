package Test;

import java.util.Random;
import java.util.Scanner;

public class zye10_12 {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("请输入5名学员的成绩：");
        for (int i = 0; i < array.length; i++) {
            int score = input.nextInt();
            array[i] = score;
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]<array[j+1]){
                    int temp =array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int k:array){
            System.out.print(k+" ");
        }
    }*///使用冒泡排序对输入的5名学员成绩进行降序排列
    /*public static void main(String[] args) {
        int[] nums  ={8,7,3,9,5,66,1};
        int index=0;
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }else{
                max=max;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==max){
            index=i;}
        }
        System.out.println("数组中的最大值："+max+"\n"+"最大值的下标："+index);
    }*/ //定义一个数组int[] nums={8,7,3,9,5,4,1} 输出数组中的最大值和最大值所在的下标
    /*public static void main(String[] args) {
    int [] array =new int[10];
            Random input=new Random();
            int sum=0;
            int avg=0;
        for (int i = 0; i < array.length; i++) {
            array[i]= input.nextInt(10);
        }
        int temp=array[0];
        for(int i:array){
            System.out.print(i+" ");
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("");
        System.out.print("这个数升序输出："+" ");
        for(int i:array){
            System.out.print(i+" ");
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("");
        System.out.print("这个数降序输出："+" ");
        for(int i:array){
            sum+=i;
            System.out.print(i+" ");
        }
        avg=sum/ array.length;
        System.out.println( );
        System.out.println("数组的总和："+sum);
        System.out.println("数组的平均数："+avg);
}*///随机十个数，升序输出、降序输出,输出总和、平均数
    /*public static void main(String[] args) {
        int[] array = new int[10];
        Random input = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(10);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        int[] add = new int[10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < add.length; j++)
                if (array[i] == j) {
                    add[j]++;
                }
        }
        System.out.println("");
        for (int i : add) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < add.length; i++) {
            if(add[i]>0){
                System.out.println(i+"出现了"+add[i]+"次");
            }
        }
        int max=add[0];
        for(int i=1;i< add.length;i++){
            if(add[i]>max){
                max=add[i];
            }}
        for (int i = 0; i < add.length; i++) {
            if(add[i]==max) {
                System.out.println("次数最多的数字："+i);
            }
        }
        int count=0;
        for (int i = 0; i < add.length; i++) {
            if(add[i]==1){
                count++;
            }
        }
        int [] list=new int[count];
        int count1=0;
        for (int i = 0; i < add.length; i++) {
            if(add[i]==1){
                list[count1]=i;
                count1++;
            }
        }
        int min=list[0];
        for (int i=1;i< list.length;i++) {
            if (list[i]<min) {
                min=list[i];
                }
            }
            System.out.print("出现1的最小数："+min);
        }*/// 附加题
    public static void main(String[] args) {
        Random input =new Random();
        int []array= new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i]= input.nextInt(10);
        }
        for (int m:array){
            System.out.print(m+" ");
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j]<array[j+1]){
                    int temp=0;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            }
        System.out.println();
        for (int k : array) {
            System.out.print(k+" ");
        }
        }
    }




