package com.yefengyu.type3;

public class Singleton
{
    private static Singleton instance;

    //构造器私有化，防止new对象
    private Singleton()
    {
    }

    //只有在第一次使用的时候构造实例对象，使用synchronized避免多线程问题
    public static synchronized Singleton getInstance()
    {
        if (instance == null)
        {
            //System.out.println("创建实例");
            instance = new Singleton();
        }
        return instance;
    }
}
