public class Test {

    public static void main(String[] args) {
        VersionControlSystem system = new VersionControlSystem();

        Document d1 = new Document("content1", "content1");
        Document d2 = new Document("content2", "content2");
        Document d3 = new Document("content3", "content3");

        System.out.println("保存备份-->d1: " + d1);
        System.out.println("保存备份-->d2: " + d2);

        system.add(d1.save());
        system.add(d2.save());

        d3.resume(system.get(0));
        System.out.println("恢复备份到 d3: " + d3);

        d3.resume(system.get(1));
        System.out.println("恢复备份到 d3: " + d3);
    }
}