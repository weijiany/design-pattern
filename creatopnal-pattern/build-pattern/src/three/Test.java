package three;

public class Test {

    public static void main(String[] args) {
        Person person = new PersonBuilder().name("zhang san").age(18).build();
        System.out.println(person);
    }
}
