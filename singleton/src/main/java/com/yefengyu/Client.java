package com.yefengyu;

import com.yefengyu.type3.Singleton;


public class Client
{
    public static void main(String[] args)
    {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);

//        for (int i = 0; i < 1000; i++)
//        {
//            new Thread(() -> {
//                Singleton.getInstance();
//            }).start();
//        }
    }
}
