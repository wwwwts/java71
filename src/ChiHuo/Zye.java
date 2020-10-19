package ChiHuo;
import java.util.Scanner;
public class Zye {
    public static void main(String[] args) {

        String[]names=new String[4];
        //保存订餐人姓名
        String[]dishMegs=new String[4];
        //保存所选的信息，包括菜品名和份数
        int[]times =new  int[4];
        //保存送餐时间
        String[] addresses=new String[4];
        //保存送餐地址
        int[]states=new int[4];
        //保存订单状态：0表示已经预定，1表示已完成
        double[]sumprices=new double[4];
        //保存订单的总金额
        String[]dishNames ={"红烧鲫鱼","鱼香肉丝","黄焖鸡"};
        //菜品名称
         double[]prices=new double[]{38.0,20.0,10.0};
        //菜品价格
         int[]praiseNums=new int[3];
        //点赞数
         
        Scanner input = new Scanner(System.in);
        int num = -1;
        boolean isExit = false;
        System.out.println("欢迎使用“吃货联盟订餐系统”");
        do {
            System.out.println("************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("************************");
            System.out.print ("请选择：");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("** 我要订餐 **");
                    Boolean isAdd=false;//记录是否可以订餐；
                    for(int j=0;j< names.length;j++){
                        if(names[j]==null){
                            isAdd=true;
                            System.out.println("请输入订餐人姓名：");
                            String name= input.next();

                            //显示可以选择的菜品信息
                            System.out.println("序号"+"\t"+" "+"菜名"+" "+" "+"\t"+"单价"+" "+" "+"\t"+"点赞数");
                            for(int i=0;i<dishNames.length;i++){
                                String price=prices[i]+"元";
                                String priaiseNum = (praiseNums[i])>0?praiseNums[i]+"赞":"0";//min=10<7?10:7;
                                System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+" "+priaiseNum);
                            }
                            //用户点菜
                            System.out.println("请选择您要点的菜品编号：");
                            int chooseDish= input.nextInt();
                            System.out.println("请选择您需要的份数：");
                            int number = input.nextInt();
                            String dishMeg=dishNames[chooseDish-1]+" "+number+"份";
                            double sumprise = prices[chooseDish-1]*number;

                            //满50元，免送餐费5元
                            double deliChange = (sumprise>=50)?0:5;
                            System.out.println("请输入送餐时间（送餐时间是10点至20点之间整点送餐）");
                            int time= input.nextInt();
                            while(time<10||time>20){
                                System.out.println("您的输入有误，请输入10-20之间的整数！");
                                time = input.nextInt();
                            }
                            System.out.println("请输入送餐地址：");
                            String address=input.next();

                            //无须添加状态，默认是0，表示预定状态
                            System.out.println("订餐成功！");
                            System.out.println("您订的是;"+dishMeg);
                            System.out.println("送餐时间："+time+"点");
                            System.out.println("送餐地址："+address);
                            System.out.println("餐费："+sumprise+"元，送餐费"+deliChange+"元,总计:"+(sumprise+deliChange)+"元。");

                            //添加数据
                            names[j]=name;
                            dishMegs[j]=dishMeg;
                            times[j]=time;
                            addresses[j]=address;
                            sumprices[j]=sumprise+deliChange;
                            break;
                        }
                    }
                    if (!isAdd){
                        System.out.println("对不起，您的餐袋已满！");
                    }
                    break;
                case 2:
                    System.out.println("** 查看餐袋 **");
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t\t送餐地址\t\t总金额\t订单状态");
                    for(int i=0;i< names.length;i++){
                        if(names[i]!=null){
                            String state=(states[i]==0)?"已预订":"已完成";
                            String date = times[i]+"点";
                            String sumprice =sumprices[i]+"元";
                            System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t\t"+date+"\t\t"+addresses[i]+"\t\t"+sumprice+"\t"+state);
                        }
                    }
                    break;
                case 3:
                    System.out.println("** 签收订单 **");
                    boolean isSignFind=false;//找到要签收的订单
                    System.out.println("请选择要签收的订单序号：");
                    int signOrderld= input.nextInt();
                    for(int i=0;i< names.length;i++){
                        if(names[i]!=null&& states[i]==0&&signOrderld==i+1){
                            states[i]=1;
                            System.out.println("订单签收成功！");
                            isSignFind=true;
                        }else if(names[i]!=null&&states[i]==1&&signOrderld==i+1){
                            System.out.println("您选择的订单已经签收，不能再次签收！");
                            isSignFind = true;// 标记已经找到此订单
                        }
                    }
                    if(!isSignFind){
                        System.out.println("您选择的订单不存在！");
                    }
                    break;
                case 4:
                    System.out.println("** 删除订单 **");
                    boolean isDelFind = false;//标记是否找到要删除的订单
                    System.out.println("请输入要删除的订单序号：");
                    int delId = input.nextInt();
                    for(int i =0;i<names.length;i++){//状态值为已完成，序号值为用户输入的序号减1，可以删除
                        if(names[i]!=null&&states[i]==1&&delId==i+1 ){
                            isDelFind=true;//标记已找到此订单
                            //执行删除操作，删除后的元素依次前移
                            for(int j=delId-1;j< names.length-1;j++){
                                names[j]=names[j+1];
                                dishMegs[j]=dishMegs[j+1];
                                times[j]=times[j+1];
                                addresses[j]=addresses[j+1];
                                states[j]=states[j+1];
                                sumprices[j]=sumprices[j+1];
                            }
                            //最后一位清空
                            int endIndex = names.length-1;
                            names[endIndex]=null;
                            dishMegs[endIndex]=null;
                            times[endIndex]=0;
                            addresses[endIndex]=null;
                            states[endIndex]=0;
                            sumprices[endIndex]=0;
                            System.out.println("删除订单成功！");
                            break;
                        }else if(names[i]!=null&&states[i]==0&&delId==i+1){
                            System.out.println("您选择的订单未签收，不能删除！");
                            isDelFind=true;
                            break;
                        }
                    }
                    //没有找到订单编号，不能删除
                    if(!isDelFind){
                        System.out.println("您要删除的订单不存在！");
                    }
                    break;

                case 5:
                    System.out.println("** 我要点赞 **");
                    //显示菜品信息
                    System.out.println("序号"+"\t"+"菜名"+"" +
                            "t"+"单价");
                    for(int i=0;i<dishNames.length;i++){
                        String price= prices[i]+"元";
                        String priaiseNum=(praiseNums[i]>0?praiseNums[i]+"赞":"");
                        System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+priaiseNum);
                    }
                    System.out.println("请选择您要点赞的菜品序号：");
                    int priaiseNum= input.nextInt();
                    praiseNums[priaiseNum-1]++;//点赞数加1
                    System.out.println("点赞成功！");
                    break;

                case 6:
                    isExit = true;
                    break;
                default:
                    isExit = true;
                    break;
            }
            if (!isExit) {
                System.out.println("输入0返回：");
                num = input.nextInt();
            } else {
                break;
            }
        } while (num == 0);
    }
}
