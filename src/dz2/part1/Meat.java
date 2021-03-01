package dz2.part1;

public class Meat extends Duki {
    private String eat;

    public Meat() {
    }

    public Meat(int age, String view, boolean forest, String eat) {
        super(age, view, forest);
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "eat='" + eat + '\'' +
                "} " + super.toString();
    }
}
