package xyz.marsj.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sj
 * @create 2018/8/14
 */
@Slf4j
public class SynchronizedDemo2 {
    //修饰一个类
    public void test1(){
        synchronized (SynchronizedDemo2.class){
            for (int i=0;i<10;i++){
                log.info("test1--{}",i);
            }
        }
    }
    //修饰一个静态方法
    public static synchronized void test2(){
        for (int i=0;i<10;i++){
            log.info("test2--{}",i);
        }
    }

    public static void main(String[] args) {
        //以上两个只作用【所有】对象
        SynchronizedDemo2 sync1=new SynchronizedDemo2();
        SynchronizedDemo2 sync2=new SynchronizedDemo2();
        ExecutorService service= Executors.newCachedThreadPool();
        service.execute(()->{
            sync1.test1();
        });
        service.execute(()->{
            sync2.test1();
        });
    }
}
