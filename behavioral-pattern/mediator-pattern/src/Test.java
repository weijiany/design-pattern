public class Test {

    public static void main(String[] args) {
        MarriageAgency agency = new MarriageAgencyImpl();
        Person m1 = new Man("张三", 20, 18, agency);
        Person m2 = new Man("李四", 30, 20, agency);
        Person w1 = new Woman("王五", 18, 20, agency);
        Person w2 = new Woman("赵六", 20, 30, agency);

        m1.find();
        w2.find();
    }
}
