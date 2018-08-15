package xyz.marsj.demo.singleton;

/**
 * @author sj
 * @create 2018/8/14
 */
//饿汉式,线程安全
public class SingletonDemo3 {
    private static SingletonDemo3 instance=new SingletonDemo3();
    private SingletonDemo3(){

    }
    public SingletonDemo3 getInstance(){
        return instance;
    }
}
