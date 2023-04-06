import Artist.*;

import java.util.ArrayList;

public abstract class Performances {
    private final Singers mainArtist;
    private final String venue;
    private final int year;
    private String performanceName;
    //mainArtist
    private ArrayList<Track> tracks = new ArrayList<>();
    private ArrayList<BackupDancers> backupDancers = new ArrayList<>();
    private ArrayList<BackupSingers> backupSingers = new ArrayList<>();

    public String getVenue() {
        return venue;
    }

    public int getYear() {
        return year;
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public void setPerformanceName(String performanceName){
        this.performanceName = performanceName;
    }

    public Performances(Singers mainArtist, String venue, int year, String performanceName, ArrayList<BackupSingers> backupSingers, ArrayList<BackupDancers> backupDancers){
        this.mainArtist = mainArtist;
        this.performanceName = performanceName;
        this.venue = venue;
        this.year = year;
        this.backupSingers = backupSingers;
        this.backupDancers = backupDancers;
    }
    public abstract void record();

    public void start(){
        System.out.println("Welcome to the Performance "+performanceName+" by "+mainArtist.getName()+"!\n");
        System.out.print("Backup singers : ");
        for(BackupSingers i : backupSingers){
            System.out.print(i.getName()+"  ");
        }
        System.out.println();
        System.out.print("Backup dancers : ");
        for(BackupDancers i : backupDancers){
            System.out.print(i.getName()+"  ");
        }
        playTrack();
        System.out.print("\n");
        mainArtist.sing(mainArtist.getName());
        backupSingers.get(0).backUp();
        backupDancers.get(0).backUp();
        System.out.println("\nEnd track and performance!\n");


    }
    public void addTrack(Track track) {
        this.tracks.add(track);
    }
    public void removeTrack(int index) {
        this.tracks.remove(index);
    }
    public void playTrack(){
        System.out.println("\n\nplaying sound track in track list");
    }
}
