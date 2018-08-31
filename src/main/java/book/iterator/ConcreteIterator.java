package book.iterator;


/**
 * 定义具体迭代器角色(Concrete Iterator)
 * Created by Kuexun on 2018/5/1.
 */
public class ConcreteIterator implements Iterator{
    private List list = null;
    private int index;

    public ConcreteIterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        if(!hasNext())
        {
            return null;
        }else {
            return list.get(index++);
        }

    }
}
