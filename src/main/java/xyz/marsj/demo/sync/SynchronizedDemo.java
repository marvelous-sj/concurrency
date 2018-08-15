package xyz.marsj.demo.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author sj
 * @create 2018/8/14
 */
@Slf4j
public class SynchronizedDemo {
    //修饰一个代码块
    public void test1(){
        synchronized (this){
            for (int i=0;i<10;i++){
                log.info("test1--{}",i);
            }
        }
    }
    //修饰一个方法
    public synchronized void test2(){
        for (int i=0;i<10;i++){
            log.info("test2--{}",i);
        }
    }

    public static void main(String[] args) {
        //以上两个只作用于【调用的】对象
        SynchronizedDemo sync1=new SynchronizedDemo();
        SynchronizedDemo sync2=new SynchronizedDemo();
        ExecutorService service= Executors.newCachedThreadPool();
        service.execute(()->{
            sync1.test1();
        });
        service.execute(()->{
            sync2.test1();
        });
    }
}
