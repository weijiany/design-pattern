import java.util.LinkedList;

public class VersionControlSystem {

    private LinkedList<Backup> backups = new LinkedList<>();

    private int nextVersion = 0;

    public void add(Backup backup) {
        backup.setVersion(nextVersion ++);
        backups.add(backup);
    }

    public Backup get(int version) {
        return backups.stream().filter(b -> b.getVersion() == version).findFirst().orElse(null);
    }

    public Backup getLast() {
        return backups.getLast();
    }
}
