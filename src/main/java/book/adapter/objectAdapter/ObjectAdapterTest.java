package book.adapter.objectAdapter;

import book.adapter.classAdapter.M5DataLine;
import book.adapter.classAdapter.M5DataLineAdapter;
import book.adapter.classAdapter.Target;

/**
 * 对象适配器模式：通过组合来实现适配器功能。
 * 根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系
 * Created by Kuexun on 2018/5/1.
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        Target m5 = new M5DataLine();
        m5.connection();

        Target adapter = new M5DataLineAdapter();
        adapter.connection();
    }
}
