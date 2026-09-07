package TechStore;

public class ElectronicProduct extends Product{
    // Atributos
    private final int warrantyMonths;
    // Constructor
    public ElectronicProduct(String id, String name, double price, int stock, int warrantyMonths){
        super(id, name, price, stock);
        if(warrantyMonths>=0){
            this.warrantyMonths = warrantyMonths;
        }else{
            throw new IllegalArgumentException("Ingrese un valor válido mayor o igual a 0");
        }
    }
    // Setters
    // Getters
    public int getWarrantyMonths(){
        return warrantyMonths;
    }
    // Métodos
    @Override
    public double calculateFinalPrice(){
        double discount = 0;
        if(getPrice()>=1000){
            discount = 0.1;
        }
        return getPrice() - (getPrice()*discount);
    }
}
