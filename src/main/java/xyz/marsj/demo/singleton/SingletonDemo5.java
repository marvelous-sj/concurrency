package xyz.marsj.demo.singleton;

/**
 * @author sj
 * @create 2018/8/14
 */
//枚举模式,最安全
public class SingletonDemo5 {

    private SingletonDemo5(){

    }
    public SingletonDemo5 getInstance()
    {
        return Singleton.INSTANCE.getInstance();
    }
    private enum Singleton{
        INSTANCE;
        private SingletonDemo5 singleton;
        //JVM保证这个方法只执行一次
        Singleton(){
            singleton=new SingletonDemo5();
        }
        public  SingletonDemo5 getInstance(){
            return singleton;
        }
    }
}
