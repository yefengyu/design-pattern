package com.yefengyu.type1;

public class Singleton
{
    //类内部实例化
    private final static Singleton INSTANCE = new Singleton();

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
