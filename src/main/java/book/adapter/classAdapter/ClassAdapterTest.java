package book.adapter.classAdapter;

/**
 * 类适配器模式：通过继承来实现适配器功能。
 * Created by Kuexun on 2018/5/1.
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        Target m5 = new M5DataLine();
        m5.connection();

        Target adapter = new M5DataLineAdapter();
        adapter.connection();
    }
}
