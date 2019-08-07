public class Person {

    private String name;

    private int age;

    private Sex sex;

    int requestAge;

    MarriageAgency agency;

    public Person(String name, int age, Sex sex, int requestAge, MarriageAgency agency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;
        this.agency.register(this);
    }

    public void find() {
        agency.pair(this);
    }

    public Sex getSex() {
        return sex;
    }

    public int getRequestAge() {
        return requestAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
