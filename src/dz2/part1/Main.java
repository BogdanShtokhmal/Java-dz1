package dz2.part1;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(1, "vovk");
        Duki duki1= new Duki(2,"kaban",true);
        Grass grass1= new Grass(3, "losy", true,"grass");
        Meat meat1= new Meat(4, "lisa", true,"meat");
        Farm farm1= new Farm(5,"korova",true);
        Big big1= new Big(6,"korova",true,"farm");
        Small small1 = new Small(7,"cat",false,"house");


        Animal[] animals = new Animal[6];
        animals[0]=animal;
        animals[1]=duki1;
        animals[2]=grass1;
        animals[3]=meat1;
        animals[4]=farm1;
        animals[5]=big1;
        animals[6]=small1;

        Duki[] dukis = {duki1, grass1, meat1};
        Farm[] farms = {farm1, big1, small1};




    }
}
