package SortedSet;

public class Main {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Eko"));
        people.add(new Person("Budi"));
        people.add(new Person("Joko"));

        for (var person : people){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Kurniawan"));

    }
}
