

package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(12);
        l.add("lokesh");
        l.add("solanki");

        ListIterator it = l.listIterator();
        while (it.hasNext()) {
        	
            System.out.println(it.next());
        }
    }
}
