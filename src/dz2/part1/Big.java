package dz2.part1;

public class Big extends Farm{
    private String home;

    public Big() {
    }

    public Big(int age, String view, boolean farm, String home) {
        super(age, view, farm);
        this.home = home;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Big{" +
                "home='" + home + '\'' +
                "} " + super.toString();
    }
}
