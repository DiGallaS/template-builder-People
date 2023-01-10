public class Person {
    protected final String name;
    protected final String surname;
    protected final int age;
    protected final String adress;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public boolean hasAge() { /*...*/ }
    public boolean hasAddress() { /*...*/ }

    public String getName() { /*...*/ }
    public String getSurname() { /*...*/ }
    public OptionalInt getAge() { /*...*/ }
    public String getAddress() { /*...*/ }

    public void setAddress(String address) { /*...*/ }
    public void happyBirthday() { /*...*/ }

    @Override
    public String toString() { /*...*/ }

    @Override
    public int hashCode() { /*...*/ }

    public PersonBuilder newChildBuilder() { /*...*/ }
}
