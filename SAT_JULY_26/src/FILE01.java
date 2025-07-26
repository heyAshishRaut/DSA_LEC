import java.util.*;

public class FILE01 {
    public static void main(String[] args) {
//        static → means it belongs to the class, not to an object.
//        So the Java Virtual Machine (JVM) can call main() directly using the
//        class name — like FILE01.main(...), internally.
//        No object creation is required.
//        String[] args (argument) - To get work done by main function, and we don't know no. of arguments so there is array
//        and its type is String because String can be converted into any other data types.

//        ARRAYLIST - Dynamic array
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);

        Iterator<Integer> it = a.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        
//        LINKED LIST - Runtime allocation
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(1, 30);
        System.out.println(l);
    }
}
