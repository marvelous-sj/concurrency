package xyz.marsj.demo.singleton;

/**
 * @author sj
 * @create 2018/8/14
 */
//懒汉式,线程不安全
public class SingletonDemo {
    private static SingletonDemo instance=null;
    private SingletonDemo(){

    }
    public SingletonDemo getInstance(){
        if(instance==null){
            instance=new SingletonDemo();
        }
        return instance;
    }
}
