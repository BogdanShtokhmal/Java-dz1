package dz2.part1;

public class Duki extends Animal {
    private boolean forest = true;

    public Duki(){

    }

    public Duki(int age, String view, boolean forest) {
        super(age, view);
        this.forest = forest;
    }

    public boolean isForest() {
        return forest;
    }

    public void setForest(boolean forest) {
        this.forest = forest;
    }

    @Override
    public String toString() {
        return "Duki{" +
                "forest=" + forest +
                "} " + super.toString();
    }
}
