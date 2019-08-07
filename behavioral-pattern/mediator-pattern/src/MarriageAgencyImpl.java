import java.util.ArrayList;
import java.util.List;

public class MarriageAgencyImpl implements MarriageAgency {

    List<Person> men = new ArrayList<>();
    List<Person> women = new ArrayList<>();

    @Override
    public void pair(Person person) {
        List<Person> temp = person.getSex() == Sex.MALE? women: men;
        for (Person man: temp)
            if (man.getAge() == person.getRequestAge()) {
                System.out.println(person.getName() + "和" + man.getName() + "配对成功");
            }
    }

    @Override
    public void register(Person person) {
        if (person.getSex() == Sex.MALE) men.add(person);
        else women.add(person);
    }
}
