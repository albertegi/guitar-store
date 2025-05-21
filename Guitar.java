public class Guitar {
    private String serialNumber, builder, model, type, backWood, topWood;
    private double price;

    public Guitar(String serialNumber, double price,
                  Builder builder, String model,
                  Type type, Wood backWood, Wood topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = String.valueOf(builder);
        this.model = model;
        this.type = String.valueOf(type);
        this.backWood = String.valueOf(backWood);
        this.topWood = String.valueOf(topWood);
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public String getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }
    public String getType(){
        return type;
    }
    public String getBackWood(){
        return backWood;
    }
    public String getTopWood(){
        return topWood;
    }

}
