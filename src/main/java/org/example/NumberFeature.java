package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
        // test git
        //
        int weishu=1;
        int zishu=1;
        result=0;
        while (inputNumber>0) {
           int n=inputNumber%10;
           if((n%2==0 && weishu%2==0)||(n%2!=0 && weishu%2!=0)) {
               result+=zishu;
           }
           inputNumber=inputNumber/10;
           weishu++;
           zishu*=2;

        }
        if (result==0){System.out.println("您输入的数字有误，请输入正数");}
        else System.out.println(result);
    }
}
