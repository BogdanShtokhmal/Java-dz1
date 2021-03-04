package dz3;

public abstract class Closes  {
    private SizeCloses size;
    private int price;
    private String color;

    public Closes() {
    }

    public Closes(SizeCloses size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public SizeCloses getSize() {
        return size;
    }

    public void setSize(SizeCloses size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Closes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
