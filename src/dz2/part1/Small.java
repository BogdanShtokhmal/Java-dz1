package dz2.part1;

public class Small extends Farm {
    private String house;

    public Small() {
    }

    public Small(int age, String view, boolean farm, String house) {
        super(age, view, farm);
        this.house = house;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Small{" +
                "house='" + house + '\'' +
                "} " + super.toString();
    }
}
