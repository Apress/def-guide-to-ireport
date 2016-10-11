package examples;

public class TestFactory
{

    public static java.util.Collection generateCollection()
    {
        java.util.Vector collection = new java.util.Vector();

        collection.add(new Person("Ted",  20) );
        collection.add(new Person("Jack", 34) );
        collection.add(new Person("Bob",  56) );
        collection.add(new Person("Alice",12) );
        collection.add(new Person("Robin",22) );
        collection.add(new Person("Peter",28) );

        return collection;
    }
}
