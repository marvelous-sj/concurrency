package xyz.marsj.demo.singleton;

/**
 * @author sj
 * @create 2018/8/14
 */
//懒汉式,线程安全
public class SingletonDemo2 {
    //使用volatile 防止重排序造成的指向完成但还未初始化的情况
    //volatile+双重检测机制-->禁止指令重排
    private static volatile SingletonDemo2 instance=null;
    private SingletonDemo2(){
    }
    public SingletonDemo2 getInstance(){
        //双重检测
        if(instance==null){   //线程B
            synchronized (SingletonDemo2.class){
                if(instance==null){
                    instance=new SingletonDemo2(); //线程A
                }
            }
        }
        return instance;
    }
}
