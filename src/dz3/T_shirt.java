package dz3;

public class T_shirt extends Closes implements WomenCloses, Mencloses {


    @Override
    public void DressMen() {
        System.out.println("Man dressed");

    }

    @Override
    public void DressWomen() {
        System.out.println("Woman dressed");

    }
}
