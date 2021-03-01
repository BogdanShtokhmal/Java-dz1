package dz2.part1.part3;

public class Main {
    public static void main(String[] args) {
        User user1= new User(1,"kolya", "men");
        User user2= new User(2, "olya", "woman");

        MenClothes[] menClothes = {user1};
        WomanClothes[] womanClothes = {user2};

        dressMen(user1);
        dressWoman(user2);



    }

    public static void dressMen (MenClothes men){
        men.dressMen();
    }

    public static void dressWoman (WomanClothes woman){
        woman.dressWoman();
    }
}
