package book.iterator;

/**
 * 定义容器角色(Aggregate)
 * Created by Kuexun on 2018/5/1.
 */
public interface List {
    public void add(Object o);
    public Object get(int index);
    public int size();
    public Iterator iterator();

}
