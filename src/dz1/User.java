package dz1;

import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private String[] skills;
    private Car car;
    private Family family;

    public User(){

    }

    public User (int id, String name, String[] skills){
    this.id=id;
    this.name=name;
    this.skills=skills;

    }

    public User (int id, String name, String[] skills, Car car){
        this.id=id;
        this.name=name;
        this.skills=skills;
        this.car=car;

    }

    public User (int id, String name, String[] skills, String model, int yar, int price, String color){
        this.id=id;
        this.name=name;
        this.skills=skills;
        this.car=new Car(model, yar, price, color);


    }
    public User (int id, String name, String[] skills, Car car, Family family){
        this.id=id;
        this.name=name;
        this.skills=skills;
        this.car=car;
        this.family=family;

    }




    public int getId(){
    return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String[] getSkills(){
        return skills;
    }

    public void setSkills(String[] skills){
        this.skills=skills;
    }

    public Car getCar(){
        return  car;
    }
    public void setCar(Car car){
        this.car=car;
    }

    public Family getFamily(){
        return family;
    }
    public void setFamily(Family family){
        this.family=family;
    }

    public String toString(){
        return "id:"+id+" "+"name-"+name+" "+"skills:"+ Arrays.toString(skills)+" "+"dz1.Car:"+car+" "+"dz1.Family:"+family;
    }



}

