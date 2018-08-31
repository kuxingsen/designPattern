package book.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射破解单例实例代码
 * Created by Kuexun on 2018/5/1.
 */
public class ReflectSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton03 singleton1 = Singleton03.getInstance();
        Singleton03 singleton2 = Singleton03.getInstance();
        System.out.println(singleton1 == singleton2);

        //通过反射破解
        Class<Singleton03> clazz = (Class<Singleton03>) Class.forName(Singleton03.class.getName());
        Constructor<Singleton03> c = clazz.getDeclaredConstructor(null);//获得无参构造器
        c.setAccessible(true);
        Singleton03 singleton3 = c.newInstance();
        Singleton03 singleton4 = c.newInstance();
        System.out.println(singleton3 == singleton4);
        /*
        //防止通过反射破解//此时抛出异常
        Class<AvoidReflectSingleton> cla = (Class<AvoidReflectSingleton>) Class.forName(AvoidReflectSingleton.class.getName());
        Constructor<AvoidReflectSingleton> con = cla.getDeclaredConstructor(null);//获得无参构造器
        c.setAccessible(true);
        AvoidReflectSingleton avoidReflectSingleton1 = con.newInstance();
        AvoidReflectSingleton avoidReflectSingleton2 = con.newInstance();
        System.out.println(avoidReflectSingleton1 == avoidReflectSingleton2);
        */
    }
}
