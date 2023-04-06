import Artist.*;

import java.util.ArrayList;

class StudioPerformances extends Performances{
    public StudioPerformances(Singers mainArtist, String venue, int year, String performanceName, ArrayList<BackupSingers> backupSingers, ArrayList<BackupDancers> backupDancers) {
        super(mainArtist, venue, year, performanceName, backupSingers, backupDancers);
    }

    @Override
    public void record() {
        System.out.println("----------This is the method record in the class StudioPerformances----------");
    }
}