package Exercises.POO;

public class Rectangulo extends Shape{
    // Atributos
    private double width;
    private double height;
    // Constructor
    public Rectangulo(double width, double height){
        this.setHeight(height);
        this.setWidth(width);
    }
    // Setters
    public void setWidth(double width){
        if(width>0){
            this.width = width;
        }else{
            System.out.println("Ingrese un valor mayor a 0");
        }
    }
    public void setHeight(double height){
        if(height>0){
            this.height = height;
        }else{
            System.out.println("Ingrese un valor mayor a 0");
        }
    }
    // Getters
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    // Métodos
    @Override
    public double calculateArea(){
        double area;
        area = width * height;
        return area;
    }
}
