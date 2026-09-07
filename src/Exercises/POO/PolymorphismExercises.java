package Exercises.POO;

/*
Clase 64 - Ejercicios: Polimorfismo
Vídeo: https://youtu.be/JOAqpdM36wI?t=25474
*/

import java.util.ArrayList;
import java.util.List;

public class PolymorphismExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        System.out.println("Ejercicio 1");
        var animalsList = new ArrayList<Animal>(List.of(
                new Dog("Bobi"),
                new Cat("Tortis"),
                new Cow("Clara")
        ));

        var perro = animalsList.get(0);
        var gato = animalsList.get(1);
        var vaca = animalsList.get(2);

        for(Animal animal: animalsList){
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        System.out.println("Ejercicio 2");
        var figuresList = new ArrayList<Shape>(List.of(
                new Circle(4),
                new Rectangulo(3,4)
        ));

        for(Shape figure: figuresList){
            System.out.println(figure.calculateArea());
        }
        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        System.out.println("Ejercicio 3");
        var pintor = new Printer();
        pintor.print("Juan Antes", 14, "72240320");
        pintor.print("Juan Ahora", 21);
        pintor.print("Jhon", 21, 1130);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        System.out.println("Ejercicio 4");
        var anfitrion = new Greeter();
        anfitrion.greet();
        anfitrion.greet("Juan");
        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        System.out.println("Ejercicio 5");
        var vehicleList = new ArrayList<Vehicle>(List.of(
                new Carro(50, "Verde"),
                new Truck(45),
                new Bike(20)
        ));

        for(Vehicle vehiculo : vehicleList){
            vehiculo.start();
        }

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        System.out.println("Ejercicio 6");
        var email = new EmailNotification();
        var sms = new SMSNotification();
        var notiSimple = new Notification();

        sendNotification(email);
        sendNotification(sms);
        sendNotification(notiSimple);

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        System.out.println("Ejercicio 7");
        var gaturro = new Cat("Flow");
        var sabueso = new Dog("Papucho");
        var caballo = new Horse("Nose");

        showAnimalType(gaturro);
        showAnimalType(sabueso);
        showAnimalType(caballo);
        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        System.out.println("Ejercicio 8");
        Converter convertir = new Converter();
        System.out.println(convertir.convert(14));
        System.out.println(convertir.convert(22.4));
        System.out.println(convertir.convert("causa"));

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        System.out.println("Ejercicio 9");
        var productList = new ArrayList<Product>(List.of(
            new Libro(80),
            new Electronic(1000)
        ));

        for(Product producto : productList){
            System.out.println(producto.getPrice());
        }

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        System.out.println("Ejercicio 10");
        Character[] personajes = {new Archer(), new Mage(), new Warrior()};
        for(int i=0;i<= personajes.length;i++){
            personajes[i].attack();
        }
    }
    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
    public static void sendNotification(Notification n){
        n.send();
    }
    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    public static void showAnimalType(Animal animal){
        animal.getType();
    }
}
