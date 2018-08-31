package book.iterator;

/**
 * 定义具体容器角色(ConcreteAggregate)
 * Created by Kuexun on 2018/5/1.
 */
public class ConcreteAggregate implements List{

    private Object[] list;
    private int index;
    private int size;

    public ConcreteAggregate() {
        list = new Object[100];
        index = 0;
        size = 0;
    }

    @Override
    public void add(Object o) {
        list[index++] = o;
        size++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
