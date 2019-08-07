import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany implements Company {

    private List<Company> companyList = new ArrayList<>();

    private String name;

    private String position;

    private int salary;

    public ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company) {
        companyList.add(company);
    }

    public void remove(Company company) {
        companyList.remove(company);
    }

    public List<Company> getChildren() {
        return companyList;
    }

    @Override
    public String getInfo() {
        return "ConcreteCompany{" +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
