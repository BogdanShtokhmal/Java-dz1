package dz2.part1.part2;

public class Papirus {
    private int id;

    public Papirus() {
    }

    public Papirus(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "id=" + id +
                '}';
    }
}
