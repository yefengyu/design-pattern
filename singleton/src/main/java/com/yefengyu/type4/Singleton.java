package com.yefengyu.type4;

public class Singleton
{
    private static Singleton instance;

    //构造器私有化，防止new对象
    private Singleton()
    {
    }

    //只有在第一次使用的时候构造实例对象，使用synchronized代码块和双重判断避免多线程问题，并且提供效率
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                if (instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
