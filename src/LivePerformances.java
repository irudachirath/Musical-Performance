import Artist.*;

import java.util.ArrayList;

class LivePerformances extends Performances{
    public LivePerformances(Singers mainArtist, String venue, int year, String performanceName, ArrayList<BackupSingers> backupSingers, ArrayList<BackupDancers> backupDancers) {
        super(mainArtist, venue, year, performanceName, backupSingers, backupDancers);
    }

    @Override
    public void record() {
        System.out.println("----------This is the method record in the class LivePerformances----------\nRecording Starts...\n");
    }
}