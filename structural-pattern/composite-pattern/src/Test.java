public class Test {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("张三", "老板", 10000);
        ConcreteCompany a = new ConcreteCompany("李四", "CEO", 10000);

        Employee e1 = new Employee("A", "研发部", 3000);
        Employee e2 = new Employee("B", "研发部", 4000);
        Employee e3 = new Employee("C", "研发部", 5000);
        Employee e4 = new Employee("D", "研发部", 6000);

        root.add(a);
        a.add(e1); a.add(e2); a.add(e3); a.add(e4);

        System.out.println(root.getInfo());
        display(root);
    }

    private static void display(ConcreteCompany root) {
        for (Company c: root.getChildren()) {
            System.out.println(c.getInfo());
            if (!(c instanceof Employee)) display((ConcreteCompany) c);
        }
    }
}
