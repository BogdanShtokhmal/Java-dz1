public class Class {

    public static void main(String[] args) {

        String[] skills = new String[2];
        skills[0]="Java";
        skills[1]="Js";

        User user1 = new User(1, "Vasya", skills);
        System.out.println(user1);

        Car car1 = new Car("audi", 2010, 15000, "black");
        User user2 = new User(2, "Max",new String[]{"Java","Angluar"}, car1);
        System.out.println(user2);

        User user3 = new User(3, "Olya",skills, "bmw", 2020, 25000,"red");
        System.out.println(user3);

        String[] children= new String[2];
        children[0]="Ivan";
        children[1]="Katya";
        Family family1= new Family("Roman","Oksana", "Ira", children);
        User user4 = new User(4,"Ivan", new String[]{"Html","CSS"}, car1, family1);
        System.out.println(user4);

        Family family2 = new Family("Oleg", "Nina", "Lilya", new String[] {"vlad"});
        User user5= new User(5,"Tolik", skills, car1, family2);
        System.out.println(user5);




    }
}
