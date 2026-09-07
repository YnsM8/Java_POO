package TechStore;

public abstract class Product {
    // Atributos
    final public static String STORE_NAME = "TechStore";
    private final String id;
    private int stock;
    private String name;
    private double price;
    // Constructores
    public Product(String id, String name, double price, int stock){
        if(id!=null && !id.isBlank()){
            this.id = id;
        }else{
            throw new IllegalArgumentException("NO ingresaste ningún valor, ingrese uno válido");
        }
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }
    // Setters
    public void setName(String name){
        if(name!= null && !name.isBlank()){
            this.name = name;
        }else{
            throw new IllegalArgumentException("NO ingresaste ningún valor, ingrese uno válido");
        }
    }
    public void setPrice(double price){
        if(price>0){
            this.price = price;
        }else{
            throw new IllegalArgumentException("Ingresaste un valor menor o igual a 0, ingresado uno válido");
        }
    }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("Ingresaste un valor menor a 0, ingresado uno válido");
        }
    }
    // Getters
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return  stock;
    }
    // Métodos
    public abstract double calculateFinalPrice();
}
