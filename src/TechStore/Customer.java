package TechStore;

public class Customer {
    // Atributos
    private String name;
    private final String dni;
    private final boolean isPremium;
    // Constructores
    public Customer(String name, String dni, boolean isPremium){
        // Name
        this.setName(name);
        //DNI
        if(dni!=null && dni.length()==8 ){
            for(int i=0; i<dni.length(); i++){
                char digit = dni.charAt(i);
                if(!Character.isDigit(digit)){
                    throw new IllegalArgumentException("El DNI ingresado no es válido");
                }
            }
            this.dni = dni;
        }else{
            throw new IllegalArgumentException("Ingrese un valor válido de 8 dígitos");
        }
        // isPremium
        this.isPremium = isPremium;
    }
    // Setters
    public void setName(String name){
        if(name!=null && !name.isBlank()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Ingrese algún valor, no dejes vacío");
        }
    }
    // Getters
    public String getName(){
        return name;
    }
    public String getDni(){
        return dni;
    }
    public boolean isPremium(){
        return isPremium;
    }
    // Métodos
}
