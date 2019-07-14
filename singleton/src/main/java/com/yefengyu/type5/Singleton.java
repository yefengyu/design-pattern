package com.yefengyu.type5;

public class Singleton
{
    private static Singleton instance;

    //构造器私有化，防止new对象
    private Singleton()
    {
    }

    //静态内部类，在外部类加载的时候不会加载静态内部类
    private static class SingletonInstance
    {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance()
    {
        //只有在使用到静态内部类的时候才会加载，并且通过类加载机制保证在初始化的时候只有一个实例产生
        return SingletonInstance.INSTANCE;
    }
}
