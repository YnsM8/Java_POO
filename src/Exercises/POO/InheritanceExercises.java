package Exercises.POO;

/*
Clase 62 - Ejercicios: Herencia
Vídeo: https://youtu.be/JOAqpdM36wI?t=24373
*/

import java.util.ArrayList;

public class InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        System.out.println("Ejercicio 1");
        var carro = new Carro(45,"Azul");

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        System.out.println("Ejercicio 2");
        var estudiante = new Estudiante("Juan", 14, 60);
        estudiante.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        System.out.println("Ejercicio 3");
        var gatito = new Cat("Tortis");
        var perrito = new Dog("Papucho");
        gatito.makeSound();
        perrito.makeSound();
        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        System.out.println("Ejercicio 4");
        var supervisor = new Manager(1800, "Jorge","RRHH");
        System.out.println(supervisor.getDepartment() + " " + supervisor.getName() + " " + supervisor.getSalary());

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        System.out.println("Ejercicio 5");
        var rectangulo = new Rectangulo(4,3);
        var circulo = new Circle(3);
        System.out.println(rectangulo.calculateArea());
        System.out.println(circulo.calculateArea());

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        System.out.println("Ejercicio 6");
        var aguila = new Eagle("Pimpollo");
        aguila.fly();
        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        System.out.println("Ejercicio 7");
        var celular = new Phone("Azul");

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        System.out.println("Ejercicio 8");
        var cuenta = new SavingsAccount("SA1");
        cuenta.deposit(200);
        cuenta.addInterest(10);
        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        System.out.println("Ejercicio 9");
        var bicicleta = new Bike(20);
        var camion = new Truck(50);
        var carrito = new Carro(60, "Azul");
        bicicleta.describe();
        camion.describe();
        carrito.describe();
        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        System.out.println("Ejercicio 10");
        var animales = new ArrayList<Animal>();
        var perro = new Dog("Bobi");
        var gato = new Cat("Flow");
        var pajaro = new Pajaro("Piolin");
        animales.add(perro);
        animales.add(gato);
        animales.add(pajaro);
        for(Animal animal : animales){
            animal.makeSound();
        }

    }
}
