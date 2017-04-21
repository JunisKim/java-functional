import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class InterfaceExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
        "kim", "lee", "parkkkk", "choiiiiii", "ryu", "jin"
        );

        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        Collections.sort(list, c);

        System.out.println(list);
    }
}
