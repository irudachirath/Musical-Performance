package Artist;

public class BackupSingers extends Singers implements IBackup{

    public BackupSingers(String name) {
        super(name);
    }
    public void backUp(){
        System.out.println("----------This is the method backUp in the class BackupSingers----------");
        System.out.println("Supporting to the main artist by singing");
    }
}