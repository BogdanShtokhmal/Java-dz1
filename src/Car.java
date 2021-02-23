public class Car {
    private String model;
    private int yar;
    private int price;

    public Car(){

    }

    public Car(String model, int yar, int price){
        this.model=model;
        this.yar=yar;
        this.price=price;
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
    public void setPrice(){
        this.price=price;
    }

    public String toString(){
        return "model-"+model+" "+"yar-"+yar+" "+"price-"+price;
    }
}


