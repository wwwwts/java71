package World;

import java.util.Random;
public class WeiShu {
    public static void main(String[] args) {
        System.out.println("随机生成一个四位数：");
        Random no = new Random();
        int number = no.nextInt(10000);//产生一个四位数的随机数；
        System.out.println("这个随机数：" + number);
        int gewei = number % 10;
        int shiwei = number / 10 % 10;
        int baiwei = number / 100 % 10;
        int qianwei = number / 1000 % 10;
        System.out.println("这个数的个位：" + gewei);
        System.out.println("这个数的十位：" + shiwei);
        System.out.println("这个数的百位：" + baiwei);
        System.out.println("这个数的千位：" + qianwei);
        int random = (int) (Math.random() * 10);//产生随机数！
        System.out.println("这个随机数："+random);
        if (baiwei == random) {
            System.out.println("恭喜你，中奖！奖励Iphone11");
        } else {
            System.out.println("很遗憾！你没有中奖！");
        }
    }
}
