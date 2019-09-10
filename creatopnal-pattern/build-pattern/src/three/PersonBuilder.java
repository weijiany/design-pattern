package three;

public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        person = new Person("weijian", 23);
    }

    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder age(int age) {
        person.setAge(age);
        return this;
    }

    public Person build() {
        return person;
    }
}
