package com.yefengyu.filter;

import com.yefengyu.entity.Alarm;


public interface Filter
{
    void execute(Alarm alarm, FilterChain chain);
}
