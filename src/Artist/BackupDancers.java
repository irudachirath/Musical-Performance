package Artist;

public class BackupDancers extends Artists implements IBackup{
    public BackupDancers(String name){
        super(name);
    }
    @Override
    public void backUp(){
        System.out.println("----------This is the method backUp in the class BackupDancers----------");
        System.out.println("Supporting to the main artist by dancing");
    }
}
