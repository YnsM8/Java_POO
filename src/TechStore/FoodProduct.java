package TechStore;

public class FoodProduct extends Product{
    // Atributos
    private final int daysToExpire;
    // Constructor
    public FoodProduct(String id, String name, double price, int stock, int daysToExpire){
        super(id, name, price, stock);
        if(daysToExpire>=0){
            this.daysToExpire = daysToExpire;
        }else {
            throw new IllegalArgumentException("Valor inválido, los dias deben ser mayor o igual a 0");
        }

    }
    // Setters
    // Getters
    public int getDaysToExpire(){
        return daysToExpire;
    }
    // Métodos

    @Override
    public double calculateFinalPrice() {
        double discount=0;
        double price = getPrice();
        if(daysToExpire<=3){
            discount = 0.2;
        }
        return price - (price * discount);
    }
}

