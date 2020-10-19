package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test10_13 {
    /*public static void main(String[] args) {
        String[] array = {"1经典", "2优秀", "3良好", "4及格", "5继续努力"};
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("5继续努力")) {
                index = i;
                break;
            } }
        array[index]="5不及格";
if(index!=-1){
    for (String  k:array) {
        System.out.print(k+" ");

}}else{
    System.out.println("不存在！");
}*/
    //数组中修改某一元素的值
    public static void main(String[] args) {
        /*String[] array = {"经典", "优秀", "良好", "及格", "不及格"};
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("经典")) {
                index = i;
                break;
            } }
        for (int i = index;  i < array.length-1; i++) {
            array[i ] = array[i+1];
        }
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+" ");
        }
    }*/
   /* public static void main(String [] args){
        int sum=0;
        Scanner input = new Scanner(System.in);
        int []array=new int[6];
        System.out.println("输入五名学生的成绩：");
        for (int i = 0; i < array.length; i++) {
            array[i]= input.nextInt();
        }
        int max=0;
        int min=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(sum+ " " +max+" "+min);
    }*/
      /* int[] array = {12, 23, 11, 10, 76, 46};
       for (int i = 0; i < array.length - 1; i++) {
           for (int j = 0; j < array.length - i - 1; j++) {
               if (array[j] > array[j + 1]) {
                   int temp = 0;
                   temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
               }
           }
       }
       for (int l:array
            ) {
           System.out.print(l+" ");
       }*/
       /* int[] array = {1, 88, 67, 4};
        int i = 0;
        int j = array.length - 1;
        int temp;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
      Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/
        //数组数倒置输出
     /* int[][] arrays={{12,32}};
      int sum;
      sum =arrays[0][0]+arrays[0][1];
      System.out.println(sum);*/
        //数组
       /* System.out.println("........equals(arr1,arr2)方法.........");
        int [] arr1={11,22,33,44};
        int [] arr2={11,22,33,44};
        int [] arr3={11,22,33,21,18};
        System.out.println("判断两个数组是不是相等!");
        System.out.println("判断数组arr1与arr2是不是相等:"+Arrays.equals(arr1,arr2));
        System.out.println("判断数组arr1与arr3是不是相等:"+Arrays.equals(arr1,arr3));
        System.out.println(".......toString(arr1)方法....");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        int []arr4={23,34,54,76,67};
        int []arr5=Arrays.copyOf(arr4,6 );
        Arrays.fill(arr5,2,5,10);
        System.out.println(Arrays.toString(arr5));*/
        //数组Arrays类的应用，Array.equals(arr1,arr2);Array.toString(arr);Array.sort(arr1) 二位数组Array.sort(arr[1])
   /*char []chars={'a','c','u','b','e','p','f','z'};
   Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        int index=Arrays.binarySearch(chars,'e');
        System.out.println(index);*///1、	使用Arrays升序排列一组字符
    /*Scanner input =new Scanner(System.in);
    String []array=new String [5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入"+(i+1)+"个水果的英文名字：");
            String  num= input.next();
            array[i]=num;
        }
        System.out.println("这些水果的英文名在字典中出现的顺序是：");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        //水果的字母排序
            int[] arr = {1, 0,2,2, 3,3};
            int[] arr_copy = new int[0];
            int m = 0;
        boolean tag = false;
            for (int i = 0; i < arr.length; i++) {
                 tag = false;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i]==arr[j]) {
                        //重复
                        tag = true;
                    }
                }
                //如果没有重复就放进数组中
                if (!tag) {
                    arr_copy= Arrays.copyOf(arr_copy,arr_copy.length+1);
                    //同时让新数组的下标自加1;
                    arr_copy[m++]=arr[i];
                }
            }
            //i作用就是来确定数组中实际数组的长度
            //int i;
            //for(int i=0;i<arr_copy.length&&arr_copy[i]!=0;i++);
            //System.out.println("数组长度:" + m);
            //知道了数组的长度,把旧数组中有值的元素加入到新数组里.

        System.out.println(Arrays.toString(arr_copy));
            //for (int i = 0; i < m; i++) {
                //System.out.println(new_arr[i]);
            //}
        }
    }


