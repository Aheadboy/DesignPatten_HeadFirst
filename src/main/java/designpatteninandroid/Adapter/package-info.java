package designpatteninandroid.Adapter;
//
/**
 * 安卓的适配器 BaseAdapter：涉及两个涉及模式：
 * 适配器模式、观察者模式
 *  其中的适配器所负责的内容：
 *      作为视图和数据的链接桥梁;同时负责为数据集中的各个数据生成对应的视图。（getView）
 *      注意，适配的是itemView与数据集。而不是ListView，GridView之类的。
 *  其中的观察者模式所负责的内容：
 *
 *
 *  ListView 与 Adapter之间是桥接模式。
 */