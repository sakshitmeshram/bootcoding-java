package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(5);

        Collections.sort(list);

        System.out.println(list);

    }

}
