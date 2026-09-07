package TechStore;

public class ClothingProduct extends Product{
    // Atributos
    private final String size;
    // Constructor
    public ClothingProduct(String id, String name, double price, int stock, String size){
        super(id, name, price, stock);
        if(size!=null && !size.isBlank()){
            this.size = size.toUpperCase();
        }else{
            throw new IllegalArgumentException("Ingrese un valor válido");
        }
    }
    // Setters
    // Getters
    public String getSize(){
        return size;
    }
    // Métodos
    @Override
    public double calculateFinalPrice(){
        double discount=0;
        double price = getPrice();
        if(price>=200){
            discount = 0.05;
        }
        return price - (price * discount);
    }
}
