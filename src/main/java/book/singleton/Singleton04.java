package book.singleton;

/**
 * 静态内部类单例实现
 * Created by Kuexun on 2018/5/1.
 */
public class Singleton04 {
    private Singleton04() {
    }
    /**
     * 声明一个静态内部类,在静态内部类内部提供一个外部类的实例（常量，不可改变）
     * 初始化Singleton4 的时候不会初始化SingletonClassInstance，实现了延时加载。并且线程安全
     */
    private static class SingletonClassInstance{
        //该实例只读，不管谁都不能修改
        private static final Singleton04 singleton04 = new Singleton04();
    }
    public static Singleton04 getInstance()
    {
        return SingletonClassInstance.singleton04;
    }
}
