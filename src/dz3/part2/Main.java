package dz3.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"ivan",18, Gender.Male);
        User user2 = new User(2,"katya",20,Gender.Female);
        User user3 = new User(3,"olya", 15,Gender.Female);
        User user4 = new User(4,"kolya",21, Gender.Male);
        User user5 = new User(5,"lilya",20,Gender.Female);
        User user6 = new User(6,"vova",28, Gender.Male);
        User user7 = new User(7,"ira",21,Gender.Female);
        User user8 = new User(8,"sara", 25,Gender.Female);
        User user9 = new User(9,"nazar",31, Gender.Male);
        User user10 = new User(10,"nina",20,Gender.Female);

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        arrayList.add(user5);
        arrayList.add(user6);
        arrayList.add(user7);
        arrayList.add(user8);
        arrayList.add(user9);
        arrayList.add(user10);

        System.out.println(arrayList);

//        for (User user: arrayList){
//            if(user.getId()%2==0) System.out.println(user);
//        }

//        for (User user: arrayList){
//            if (user.getName().length()>=5) System.out.println(user);
//        }

        for (User user: arrayList){
            if (user.getGender()==Gender.Female) System.out.println(user);
        }





    }


}
