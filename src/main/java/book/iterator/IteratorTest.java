package book.iterator;

import java.util.Date;

/**
 * Created by Kuexun on 2018/5/1.
 */
public class IteratorTest {
    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add("123");
        list.add(234);
        list.add(new Date());
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
