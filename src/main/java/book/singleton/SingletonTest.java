package book.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试几种单例模式的速度
 * Created by Kuexun on 2018/5/1.
 */
public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadNum = 10;//10个线程
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                       // Object o = Singleton01.getInstance();
                      //  Object o = Singleton02.getInstance();
                       // Object o = Singleton03.getInstance();
                      //  Object o = Singleton04.getInstance();
                        Object o = Singleton05.SINGLETON_05;
                    }
                    countDownLatch.countDown();//计数器-1
                }
            }).start();
        }
        countDownLatch.await();//main线程阻塞
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
    }
}
