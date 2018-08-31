package book.singleton;

/**
 * 饿汉式（线程安全，调用效率高，但是不能延时加载）
 * Created by Kuexun on 2018/5/1.
 */
public class Singleton01 {
    /**
     * 1、提供一个静态变量。
     * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能
     */
    private static Singleton01 singleton01 = new Singleton01();
    /**
     * 2、私有化构造器:外部是不能直接new该对象的
     */
    private Singleton01() {
    }
    /**
     * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
     * @return
     */
    public static Singleton01 getInstance()
    {
        return singleton01;
    }
}
