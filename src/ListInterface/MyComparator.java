package ListInterface;

import java.util.Comparator;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.parseInt(o1) - Integer.parseInt(o2);
    }
}
