package com.yefengyu.type2;

public class Singleton
{
    private final static Singleton INSTANCE;

    static
    {
        //使用静态代码块生成对象
        INSTANCE = new Singleton();
    }

    //构造器私有化，防止new对象
    private Singleton()
    {
    }

    //对外提供公有方法调用
    public static Singleton getInstance()
    {
        return INSTANCE;
    }
}
