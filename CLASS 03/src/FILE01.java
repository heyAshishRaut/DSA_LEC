import java.util.*;

class NameComparison implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
/*
This is a custom Comparator, not the natural order.
It compares two Employee objects by their name, alphabetically.
Useful if you want temporary, alternate sorting criteria (instead of the default defined in compareTo).
You can pass this to Collections.sort(list, new NameComparison()).
*/

class IdComparison implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id;
    }
}
/*
Another custom comparator, but this one compares based on the id field.
It sorts Employee objects numerically based on ID.
Again, use it like: Collections.sort(list, new IdComparison());
*/

class Employee implements Comparable<Employee> {
    public int id;
    public String name;

    public Employee(int id,String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Employee o) {
        // return this.id - o.id;
        return this.name.compareTo(o.name);
        /*
        String.compareTo() is a lexicographical comparison (dictionary order).

        Return Value	Meaning
        0	            Both names are equal
        < 0 (negative)	this.name comes before o.name
        > 0 (positive)	this.name comes after o.name
        */
    }
}

public class FILE01 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ashish");
        Employee e2 = new Employee(2, "Raut");

//        System.out.println(e1.compareTo(e2)); -17

//        HashSet<Employee> h = new HashSet<>();
//
//        h.add(e1);
//        h.add(e2);
//        System.out.println(h.toString());
//
        ArrayList<Employee> a = new ArrayList<Employee>();
        a.add(e1);
        a.add(e2);

        Collections.sort(a , new IdComparison());
        Collections.sort(a , new NameComparison());
    }
}