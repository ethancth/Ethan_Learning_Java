package com.learningjava;

import java.util.Scanner;
public class cal24 {
    static int times=0;
    public static void main(String[] args) {
        System.out.println("请输入数字:");
        //从控制台获取数字
        Scanner sc=new Scanner(System.in);
        int[] array=new int[4];
        for(int i=0;i<4;i++)
            array[i]=sc.nextInt();

        System.out.println("结果：");
        combination(array);
        System.out.println(times);//输出共有多少种组合
    }

    static int twoInt(int a,int b,int i) throws ArithmeticException{//两个数字与4中运算符的组合，5种
        if(i==0){

            return a+b;}
        else if(i==1)
            return a-b;
        else if(i==2)
            return a*b;
        else
            return a/b;

    }
    static void fourInt(int a,int b,int c,int d){
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        //共三层循环，第一层是a,b,第二层是（a,b）,c,第三层是（（a,b）,c）,d
        for(int i=0;i<4;i++){
            try {
                s1=twoInt(a, b, i);
            } catch (Exception e) {
                continue;
            }
            for(int j=0;j<4;j++){
                try {
                    s2=twoInt(c,s1,j);
                } catch (Exception e) {
                    continue;
                }
                for(int k=0;k<4;k++){
                    try {
                        s3=twoInt(d,s2,k);
                        if(s3==24){
                            System.out.println(d+"--"+s2);
                        }
                    } catch (Exception e) {
                        continue;
                    }
                    if(s3==24){

                        System.out.print("yes"+" ");
                        times++;
                    }
                }
            }
        }
    }

    //对四个数进行排列组合，前面提供的连接里有详细介绍
    static void combination(int array[]) {
        if(array.length!=4){
            System.out.println("数组长度不为4");
            System.exit(0);
        }
        for(int i=0;i<4;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                if(j==i)
                    continue;
                for(int k=0;k<4;k++){
                    if(k==j||k==i)
                        continue;
                    for(int h=0;h<4;h++){
                        if(h==k||h==j||h==i)
                            continue;
                        fourInt(array[i], array[j], array[k], array[h]);

                    }
                }
            }
        }
    }
}