package Exercises.POO;

public class Book {
    // Atributos
    private String title;
    // Constructores
    public Book(String title){
        this.setTitle(title);
    }
    // Getters
    public String getTitle(){
        return title;
    }
    // Setters
    private void setTitle(String title){
        if(title.isBlank()){
            System.out.println("El nombre escrito esta vacío");
        }else{
            this.title=title;
        }
    }
    // Métodos
}
