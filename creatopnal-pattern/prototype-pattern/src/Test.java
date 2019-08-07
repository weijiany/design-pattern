public class Test {

    private static int count = 6;

    public static void main(String[] args) {
        Mail mail = new Mail("邮件标题");

        for (int i = 0; i < count; i ++) {
            Mail t = mail.clone();
            t.setReceiver("收件人：" + (i + 1));
            System.out.println(t);
        }
    }
}
