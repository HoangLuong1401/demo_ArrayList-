package bavalak.vn;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Print All Name IN ArrayList:");
        names.add("Tom");
        names.add("Dick");
        names.add("Harry");

        for(String name : names){
            System.out.println(name);
        }
        System.out.println("");
        names.remove("Dick");
        names.add("George");

        names.add(0,"John");

        System.out.println("Print All Name In ArrayList After Process:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
