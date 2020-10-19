package Test;

import java.util.Scanner;

public class zye {
    public static void main(String[] args) {
     /*   Scanner input = new Scanner(System.in);
        System.out.println("出行月份：");
        int mouth = input.nextInt();
        System.out.println("输入等级：");
        String dengji = input.next();
        int price = 5000;
        double money1 = (price * 0.9);
        double money2 = (price * 0.8);
        double money3 = (price * 0.7);
        double money4 = (price * 0.5);
        double money5 = (price * 0.4);
        double money6 = (price * 0.3);
            if (mouth >= 4 && mouth <= 10) {
                if (dengji.equals("头等舱")) {
                    System.out.println("你的购票价格为：" + money1);
                }
                if (dengji.equals("商务舱")) {
                    System.out.println("你的购票价格为：" + money2);
                }
                if (dengji.equals("经济舱")) {
                    System.out.println("你的购票价格为：" + money3);
                }
            } else {
                if (mouth > 10 && mouth <= 12 || mouth < 4 && mouth > 0) {
                    if (dengji.equals("头等舱")) {
                        System.out.println("你的购票价格为：" + money4);
                    } else if (dengji.equals("商务舱")) {
                        System.out.println("你的购票价格为：" + money5);
                    } else if (dengji.equals("经济舱")) {
                        System.out.println("你的购票价格为：" + money6);
                    }
                }
            }
        }
    }*/
       /* System.out.println("请输入一个月份：");
        Scanner input = new Scanner (System.in);
        int a= input.nextInt();
        switch (a){
            case 1:System.out.println("冬天");break;
            case 2:System.out.println("冬天");break;
            case 3:System.out.println("春天");break;
            case 4:System.out.println("春天");break;
            case 5:System.out.println("春天");break;
            case 6:System.out.println("夏天");break;
            case 7:System.out.println("夏天");break;
            case 8:System.out.println("夏天");break;
            case 9:System.out.println("秋天");break;
            case 10:System.out.println("秋天");break;
            case 11:System.out.println("秋天");break;
            case 12:System.out.println("冬天");break;
        }


    }
}*/
     /* Scanner input = new Scanner(System.in);
        System.out.println("输入第一个数字：");
        int a = input.nextInt();
        System.out.println("输入第二个数字：");
        int b = input.nextInt();
        System.out.println("输入运算符号：");
        String  c = input.next();
        switch(c){
            case "+":
                System.out.println(a+"+"+b+"="+(a+b));break;
            case "-":
                if(a>=b){System.out.println(a+"-"+b+"=:"+(a-b));break;}
                else{System.out.println(b+"-"+a+"="+(b-a));break;}
            case "*":
                System.out.println(a+"*"+b+"="+(a*b));break;
            case"/":
                if(a>b){System.out.println(a+"/"+b+"="+(a/b));break;}
                else{ System.out.println(b+"/"+a+"="+(b/a));break;}
        }
    }
}*/
       /* System.out.println("请输入一个数字：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String lxin;
        lxin = (number%2==0)?"偶数":"奇数";
        System.out.println(lxin);
    }}*/
      /*  Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = input.nextInt();
        if (score == 100) {
            System.out.println("想干啥就干啥！");
        }
        if (score >= 90 && score < 100) {
            System.out.println("看电视、吃零食！");
        }
        if (score < 90 && score >= 60) {
            System.out.println("看书，写作业！");
        }
        if (score < 60) {
            System.out.println("做家务、洗碗、拖地！");
        }
    }
}*/
       /* Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个字母：");
        String word = input.next();
         char i = word.charAt(0);
         switch (i){
             case 'M':System.out.println("星期一");break;
             case 'W':System.out.println("星期三");break;
             case 'F':System.out.println("星期五");break;
             case 'T':
                 System.out.println("请输入第二个字母：");
             String second =input.next();
             char j =second.charAt(0);
             if (j=='u'){
                    System.out.println("星期二");
             }else if(j=='h'){
                 System.out.println("星期四");
             }else{
                 System.out.println("请输入有效字符！");
             }
             break;
             case 'S':
                 System.out.println("请输入第二个字母：");
                 String third= input.next();
                 char s=third.charAt(0);
                 if(s=='a'){
                     System.out.println("星期六");
                 }else if(s=='h'){
                     System.out.println("星期天");
                 }else{
                     System.out.println("请输入有效字符：");
                 }break;
             default:
                 System.out.println("请输入有效数字:");
                 break;
         }

    }
}*/
      /*  System.out.println("请输入工资数：");
      Scanner input = new Scanner(System.in);
      int pay = input.nextInt();
      int a = pay-5000;
      double shui;
      if(pay<=5000){
          System.out.println("不需要缴纳个人所得税！");
      }else if(a>0&&a<=3000){
           shui=a*0.03;
          System.out.println("应缴纳个人所得税："+shui);
        }else if(a>3000&&a<=12000){
           shui=a*0.1-210;
          System.out.println("应缴纳个人所得税："+shui);
      }else if(a>12000&&a<=25000){
          shui=a*0.2-1410;
          System.out.println("应缴纳个人所得税："+shui);
      }else if(a>25000&&a<=35000){
          shui=a*0.25-2660;
          System.out.println("应缴纳个人所得税："+shui);
      }else if(a>35000&&a<=55000){
          shui=a*0.3-4410;
          System.out.println("应缴纳个人所得税："+shui);
      }else if(a>55000&&a<=80000){
          shui=a*0.35-7160;
          System.out.println("应缴纳个人所得税："+shui);
      }else if(a>80000){
         shui=a*0.35-15160;
          System.out.println("应缴纳个人所得税："+shui);
      }



    }
}*/}}