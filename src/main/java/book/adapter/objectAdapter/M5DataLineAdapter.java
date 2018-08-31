package book.adapter.objectAdapter;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class M5DataLineAdapter implements Target{

    private M4DataLine m4;

    public M5DataLineAdapter(M4DataLine m4) {
        this.m4 = m4;
    }

    @Override
    public void connection() {
        System.out.println("使用适配器...");
        m4.connection();
    }
}
