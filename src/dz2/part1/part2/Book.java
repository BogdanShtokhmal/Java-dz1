package dz2.part1.part2;

public class Book extends Papirus{
    private String name;
    private int countpages;

    public Book() {
    }

    public Book(int id, String name, int countpages) {
        super(id);
        this.name = name;
        this.countpages = countpages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountpages() {
        return countpages;
    }

    public void setCountpages(int countpages) {
        this.countpages = countpages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", countpages=" + countpages +
                "} " + super.toString();
    }
}
