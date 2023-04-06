
import Artist.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicalPerformance{
    public static void main(String[] args) {
        //main singer
        Singers mainArtist = new Singers("Taylor Swift");
        //backup singers
        BackupSingers backupSinger1 = new BackupSingers("Jeslyn");
        BackupSingers backupSinger2 = new BackupSingers("Melanie");
        ArrayList<BackupSingers> backupSingers = new ArrayList<>();
        backupSingers.add(backupSinger1); backupSingers.add(backupSinger2);
        //backup dancers
        BackupDancers backupDancers1 = new BackupDancers("Stephanie");
        BackupDancers backupDancers2 = new BackupDancers("Jake");
        ArrayList<BackupDancers> backupDancers = new ArrayList<>();
        backupDancers.add(backupDancers1); backupDancers.add(backupDancers2);
        //live performance
        LivePerformances livePerformance = new LivePerformances(mainArtist, "Glendale", 2023, "Eras Tour", backupSingers, backupDancers);
        Track track1 = new Track("Lavender Haze", "3:31");
        Track track2 = new Track("All Too Well", "5:31");
        Track track3 = new Track("the lakes", "3:48");
        Track track4 = new Track("The Man", "4:15");
        Track track5 = new Track("Love Story", "3:56");
        //adding tracks
        livePerformance.addTrack(track1); livePerformance.addTrack(track2); livePerformance.addTrack(track3); livePerformance.addTrack(track4); livePerformance.addTrack(track5);
        System.out.println("Track list finalized\nPerformance is Ready to begin\n");
        //start recording
        livePerformance.record();
        //live performance starts
        livePerformance.start();
        System.out.print("Press any key to Exit! ");
        //creating a scanner to hold the execution until user press any key
        Scanner myObj = new Scanner(System.in);
        String exit = myObj.nextLine();
        myObj.close();
    }
}