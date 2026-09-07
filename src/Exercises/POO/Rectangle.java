package Exercises.POO;

public class Rectangle {
    // Atributos
    private double width;
    private double height;
    // Constructor
    public Rectangle(double width, double height){
        this.setWidth(width);
        this.setHeight(height);
    }
    // Setter
    public void setWidth(double width){
        if(width>0){
            this.width = width;
        }else{
            System.out.println("Ingrese una medida válida mayor a 0");
        }
    }
    public void setHeight(double height){
        if(height>0){
            this.height = height;
        }else{
            System.out.println("Ingrese una medida válida mayor a 0");
        }
    }
    // Getter
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    // Métodos
    public double calculateArea(){
        return width*height;
    }
}
