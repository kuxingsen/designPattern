package book.adapter.classAdapter;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class M5DataLineAdapter extends M4DataLine implements Target {
    public void connection()
    {
        System.out.println("使用适配器...");
        super.connection();
    }
}
