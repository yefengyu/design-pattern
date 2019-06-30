package com.yefengyu.factory;

import com.yefengyu.annotation.EnableFilter;
import com.yefengyu.filter.Filter;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class FilterFactory
{
    public static List<Filter> getFilters(String packages)
    {
        List<Filter> filterList = new ArrayList<>();
        //通过注解扫描指定的包
        Reflections reflections = new Reflections(packages);
        //如果该包下面有被EnableFilter注解修饰的类，那么将该类的实例加入到列表中，并最终返回
        Set<Class<?>> filters = reflections.getTypesAnnotatedWith(EnableFilter.class);
        for (Class filter : filters)
        {
            try
            {
                filterList.add((Filter)filter.newInstance());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        return filterList;
    }
}