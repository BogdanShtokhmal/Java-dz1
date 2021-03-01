package dz2.part1.part2;

public class Comics extends Book {
    private String world;

    public Comics() {
    }

    public Comics(int id, String name, int countpages, String world) {
        super(id, name, countpages);
        this.world = world;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "world='" + world + '\'' +
                "} " + super.toString();
    }
}
