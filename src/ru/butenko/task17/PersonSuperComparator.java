package ru.butenko.task17;

        import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int value = o1.getName().compareTo(o2.getName());
        return value;
    }

    @Override
    public Comparator<Person> thenComparing(Comparator<? super Person> other) {
        return null;
    }

    /*
    @Override
    public int compare(Person o1, Person o2) {
        int value = o1.getName().compareTo(o2.getName());

        if (value == 0) {
            if (o1.getAge() == o2.getAge()) {
                return value;
            } else if (o1.getAge() > o2.getAge()) {
                return o1.getAge() - o2.getAge();
            } else return o2.getAge() - o1.getAge();
        }
        return value;
    }

    */
}
