/**
 * 策略模式
 * 定义多个系列的算法，分别封装起来，让他们可以动态相互替换
 * 算法的变化不会影响使用其的用户
 * 参考文章：
 * http://design-patterns.readthedocs.io/zh_CN/latest/behavioral_patterns/strategy.html
 * <p>
 * android源码中用到的策略模式：
 * 时间插值器：TimeInterpolator(Concrete:AccelerateDecelerateInterpolator,CycleInterpolator......)
 * 适配器：ListAdapter(Concrete:BaseAdapter,ArrayAdapter......)
 * 估值器:TypeEvaluator(Concrete:ArgbEvaluator，FloatEvaluator.....)
 * Volley中的缓存：磁盘缓存与内存缓存是不同的缓存策略。
 */
package com.abu.pattern.strategy;
