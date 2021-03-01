package dz2.part1;

public class Farm extends Animal {
    public boolean farm = true;

    public Farm(){

    }

    public Farm(int age, String view, boolean farm) {
        super(age, view);
        this.farm = farm;
    }

    public boolean isFarm() {
        return farm;
    }

    public void setFarm(boolean farm) {
        this.farm = farm;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "farm=" + farm +
                "} " + super.toString();
    }
}
