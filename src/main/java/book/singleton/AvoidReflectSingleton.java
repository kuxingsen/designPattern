package book.singleton;

/**
 * 防止反射破解单例模式
 * Created by Kuexun on 2018/5/1.
 */
public class AvoidReflectSingleton {

    private static volatile AvoidReflectSingleton instance = new AvoidReflectSingleton();

    /**
     * 如果不是第一次构建，则直接抛出异常。不让创建
     */
    private AvoidReflectSingleton(){
        if (instance != null) {
            //如果不是第一次构建，则直接抛出异常。不让创建
            throw new RuntimeException();
        }
    }

    public static AvoidReflectSingleton getInstance()
    {
        if(instance == null)
        {
            synchronized (Singleton03.class){
                if(instance == null)
                {
                    instance = new AvoidReflectSingleton();
                }
            }
        }
        return instance;
    }
}
