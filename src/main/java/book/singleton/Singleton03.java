package book.singleton;

/**
 * 双重检索单例模式
 * 将锁加在判断实例为空的地方，不加在方法上
 * Created by Kuexun on 2018/5/1.
 */
public class Singleton03 {
    /**
     * 没有volatile修饰符，可能出现Java中的另一个线程看到个初始化了一半的_instance的情况
     * volatile变量，所有的写（write）都将先行发生于读（read）
     */
    private static volatile Singleton03 singleton03;

    private Singleton03() {
    }

    /**
     * 对外提供获取实例的方法
     * 但是同步的时候将锁放到第一次获取实例的时候，这样的好处就是只有第一次会同步。效率高
     */
    public static Singleton03 getInstance()
    {
        if(singleton03 == null)
        {
            synchronized (Singleton03.class){
                if(singleton03 == null)
                {
                    singleton03 = new Singleton03();
                }
            }
        }
        return singleton03;
    }
}
