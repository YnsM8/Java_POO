package Exercises.POO;

public class Person {

    // Atributos

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    // Métodos

    public void sayHello(){
        System.out.println(String.format("Hola, mi nombre es %s y tengo %d años", name, age));
    }

    // Setters

    public void setName(String name){
        name = name.toLowerCase();
        if(name.length()>=2){
            this.name = name;
        }else{
            System.out.println("El nombre ingresado no es válido");
        }
    }

    public void setAge(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("La edad ingresada no es válida");
        }
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
