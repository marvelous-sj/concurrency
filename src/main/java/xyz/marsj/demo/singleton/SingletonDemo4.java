package xyz.marsj.demo.singleton;

/**
 * @author sj
 * @create 2018/8/14
 */
//饿汉式,线程安全
public class SingletonDemo4 {
    private static SingletonDemo4 instance=null;
    static{
        instance=new SingletonDemo4();
    }
    //上面两个操作顺序不能换，静态代码块是按照顺序执行的
    private SingletonDemo4(){

    }
    public SingletonDemo4 getInstance(){
        return instance;
    }
}
