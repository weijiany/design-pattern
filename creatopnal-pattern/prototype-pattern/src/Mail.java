public class Mail implements Cloneable {

    private String receiver;

    private String context;

    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public Mail(String context) {
        this.context = context;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "receiver='" + receiver + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
