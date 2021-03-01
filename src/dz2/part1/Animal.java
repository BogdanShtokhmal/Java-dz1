package dz2.part1;

public class Animal {
    private int age;
    private String view;

    public Animal() {
    }

    public Animal(int age, String view) {
        this.age = age;
        this.view = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", view='" + view + '\'' +
                '}';
    }
}




