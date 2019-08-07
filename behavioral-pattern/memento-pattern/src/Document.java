public class Document {

    private String content;

    private String otherContent;

    public Backup save() {
        return new Backup(content);
    }

    public void resume(Backup backup) {
        this.content = backup.getContent();
    }

    public Document(String content, String otherContent) {
        this.content = content;
        this.otherContent = otherContent;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", otherContent='" + otherContent + '\'' +
                '}';
    }
}
