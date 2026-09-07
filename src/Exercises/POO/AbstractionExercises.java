package Exercises.POO;

/*
Clase 66 - Ejercicios: Abstracción
Vídeo: https://youtu.be/JOAqpdM36wI?t=26892
*/

public class AbstractionExercises {

    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        System.out.println("Ejercicio 1");
        var circulo = new Circle(2);
        var rectangulo = new Rectangulo(3,4);
        System.out.println(circulo.calculateArea());
        System.out.println(rectangulo.calculateArea());

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        System.out.println("Ejercicio 2");
        var guitarra = new Guitar();
        var piano = new Piano();
        piano.play();
        guitarra.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        System.out.println("Ejercicio 3");
        AnimalUltimo[] listaAnimal = {new DogUltimo(), new CatUltimo()};
        for(AnimalUltimo animal: listaAnimal){
            animal.makeSound();
        }
        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        System.out.println("Ejercicio 4");
        new Triangle().draw();
        new Circle(4).draw();
        new Square().draw();
        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        System.out.println("Ejercicio 5");
        System.out.println(new FullTimeEmployee(1130,100).calculateSalary());
        System.out.println(new PartTimeEmployee(76,8).calculateSalary());

        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        System.out.println("Ejercicio 6");
        new Carro(50, "Negro").mover();
        new Robot().mover();
        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        System.out.println("Ejercicio 7");
        var tv = new TV();
        var lavadora = new WashingMachine();
        lavadora.turnOn();
        lavadora.turnOff();
        tv.turnOn();
        tv.turnOff();
        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        System.out.println("Ejercicio 8");
        new Duck().fly();
        new Duck().swim();
        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        System.out.println("Ejercicio 9");
        new PDFDocument().print();
        new WordDocument().print();
        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        System.out.println("Ejercicio 10");
        new Invoice().pay();
        new EmployeePayment().pay();
    }
}
