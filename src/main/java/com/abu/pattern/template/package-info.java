/**
 * 模板方法模式
 * 在一个方法中定义一个算法的股价，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 * 模板方法：final
 * 抽象方法：子类必须实现
 * 流程方法：final
 * 钩子方法：非final，可有默认实现，可改变流程
 */
package com.abu.pattern.template;
