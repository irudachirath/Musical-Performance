package Artist;

abstract class Artists{
    private final String name;

    public Artists(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}