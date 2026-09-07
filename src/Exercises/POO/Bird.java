package Exercises.POO;

public class Bird {
    // Atributos
    private String name;
    // Constructor
    public Bird(String name){
        this.setName(name);
    }
    // Setter
    public void setName(String name){
        if(name.isBlank()){
            System.out.println("Ingrese algún nombre");
        }else{
            this.name = name;
        }
    }
    // Getter
    public String getName(){
        return name;
    }
    // Métodos
    public void fly(){
        System.out.println("La ave está volando :)");
    }
}
