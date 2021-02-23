public class Class {

    public static void main(String[] args) {

        String[] skills = new String[2];
        skills[0]="Java";
        skills[1]="Js";

        User user1 = new User(1, "Vasya", skills);
        System.out.println(user1);

        Car car1 = new Car("audi", 2010, 15000);
        User user2 = new User(2, "Max",new String[]{"Java","Angluar"}, car1);
        System.out.println(user2);

        User user3 = new User(3, "Olya",skills, "bmw", 2020, 25000);
        System.out.println(user3);




    }
}
