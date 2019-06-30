package com.yefengyu;

import com.yefengyu.entity.Alarm;
import com.yefengyu.factory.FilterFactory;
import com.yefengyu.filter.FilterChain;
import com.yefengyu.rule.Rule1;
import com.yefengyu.rule.Rule2;

import java.util.Date;


public class Client
{
    public static void main(String[] args)
    {
        //构造告警事件
        Alarm alarm = new Alarm(1, 10, "光功率衰耗", "省政府23号楼", 1, 1, 1, new Date(), "割接");

        //将规则加入责任链
//        FilterChain filterChain = new FilterChain();
//        filterChain.addFilter(new Rule1()).addFilter(new Rule2());

        //将规则加入责任链中,通过注解扫描指定的包，此处无需指定执行哪个规则（FIlter的实现类）
        FilterChain filterChain = new FilterChain();
        filterChain.addFilters(FilterFactory.getFilters("com.yefengyu.rule"));

        //执行责任链
        filterChain.doFilter(alarm, filterChain);

        //输出结果
        System.out.println(alarm);
    }
}
