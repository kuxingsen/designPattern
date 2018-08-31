package book.singleton;

/**
 * 懒汉式单例：比较懒，一开始不初始化实例。等什么时候用就什么时候初始化.避免资源浪费
 * Created by Kuexun on 2018/5/1.
 */
public class Singleton02 {
    /**
     * 1、声明一个静态实例，不给它初始化。等什么时候用就什么时候初始化。节省资源
     */
    private static Singleton02 singleton02;
    /**
     * 2、依然私有化构造器，对外不让new
     */
    private Singleton02() {
    }
    /**
     * 3、对外提供一个获取实例的方法，因为静态属性没有实例化。
     * 假如高并发的时候，有可能会同时调用该方法。造成new出多个实例。所以需要加上同步synchronized，因此调用效率不高
     * 在方法上加同步，是整个方法都同步。效率不高
     */
    public synchronized static Singleton02 getInstance()
    {
        if(singleton02 == null)
        {
            singleton02 = new Singleton02();
        }
        return singleton02;
    }
}
