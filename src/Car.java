public class Car {
    private String model;
    private int yar;
    private int price;
    private String color;

    public Car(){

    }

    public Car(String model, int yar, int price, String color){
        this.model=model;
        this.yar=yar;
        this.price=price;
        this.color=color;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }

    public int getYar(){
        return yar;
    }
    public void setYar(int yar){
        this.yar=yar;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String toString(){
        return "model-"+model+" "+"yar-"+yar+" "+"price-"+price+" "+"color-"+color;
    }
}


