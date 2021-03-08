package dz3.part1;

public class Pants extends Closes implements Mencloses,WomenCloses {
    @Override
    public void DressMen() {
        System.out.println("Man dressed");

    }

    @Override
    public void DressWomen() {
        System.out.println("Woman dressed");

    }
}
