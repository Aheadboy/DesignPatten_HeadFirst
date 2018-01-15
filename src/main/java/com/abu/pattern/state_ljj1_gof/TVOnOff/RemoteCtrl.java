package com.abu.pattern.state_ljj1_gof.TVOnOff;

public class RemoteCtrl {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.reciveBtnClick();
        tv.reciveBtnClick();
        tv.reciveBtnClick();
        tv.reciveBtnClick();
    }
}
