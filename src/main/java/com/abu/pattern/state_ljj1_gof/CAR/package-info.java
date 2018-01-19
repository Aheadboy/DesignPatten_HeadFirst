package com.abu.pattern.state_ljj1_gof.CAR;
//
//这个Car的实例应该说是失败的。
//这里分割了engine、door、car的state
//如此，当初始状态为engine stop、door closed、car stop
//如果我直接调用engine start，那么引擎是会启动的，这是不合理的，因为人还没有进入car
//
//正确的做法应该是汽车整体作为状态：
////    可以类比下ATM 机子