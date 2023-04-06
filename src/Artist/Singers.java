package Artist;

public class Singers extends Artists{

    public Singers(String name) {
        super(name);
    }

    public void sing(String name){
        System.out.println("----------This is the method sing in the class Singers----------");
        System.out.println(name+" singing...");
    }
}