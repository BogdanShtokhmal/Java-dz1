package dz3;

import java.util.Arrays;

public class Atelier  {
    private Closes[] atelier;

    public Atelier(Closes[] atelier) {
        this.atelier = atelier;
    }

    public Closes[] getAtelier() {
        return atelier;
    }

    public void setAtelier(Closes[] atelier) {
        this.atelier = atelier;
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "atelier=" + Arrays.toString(atelier) +
                '}';
    }

    public String AllMenCloses(Closes[] atelier){
        for(Closes atelier1: atelier){
            if(atelier1 instanceof Mencloses){
                return atelier1.toString();
            }
        } return "nofind WomenCloses";

    }
    public String AllWomenCloses(Closes[] atelier){
        for(Closes atelier1: atelier){
            if(atelier1 instanceof WomenCloses){
                return atelier1.toString();
            }
        }return "nofind WomenCloses";

    }

}
