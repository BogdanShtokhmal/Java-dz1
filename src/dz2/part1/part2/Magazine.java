package dz2.part1.part2;

public class Magazine extends Book {
    private int price;

    public Magazine() {
    }

    public Magazine(int id, String name, int countpages, int price) {
        super(id, name, countpages);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "price=" + price +
                "} " + super.toString();
    }
}
