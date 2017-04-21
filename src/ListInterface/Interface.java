package ListInterface;

import java.util.*;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class Interface {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "100", "150", "200", "250", "300", "500", "1000", "5000", "10000");


//        Comparator c = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.parseInt(o1) - Integer.parseInt(o2) ;
//            }
//        };

        Collections.sort(list, (String o1, String o2)) -> {
            int a = Integer.parseInt(o1);
            int b = Integer.parseInt(o2);
        }

        System.out.println(list);

    }
}
