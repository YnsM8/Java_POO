package Exercises.POO;

public class Circle extends Shape implements Drawable{
    // Atributos
    private double radius;
    // Constructor
    public Circle(double radius){
        this.setRadius(radius);
    }
    // Setters
    public void setRadius(double radius){
        if(radius>0){
            this.radius = radius;
        }else{
            System.out.println("Ingrese un valor válido mayor a 0");
        }
    }
    // Getters
    public double getRadius(){
        return radius;
    }
    // Métodos
    @Override
    public double calculateArea(){
        double area;
        area = 3.14 * (radius*radius);
        return area;
    }
    public void draw(){
        System.out.println("Pues simplemente haz una circunferencia hijito");
    }
}
