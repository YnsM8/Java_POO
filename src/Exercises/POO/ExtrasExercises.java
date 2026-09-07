package Exercises.POO;

/*
Clase 75 - Ejercicios: Extras
Vídeo: https://youtu.be/JOAqpdM36wI?t=31583
*/

import java.util.Scanner;
import java.util.Random;

public class ExtrasExercises {

    static String message = "Esta es una variable global";

    public static void main(String[] args) {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        System.out.println("Ejercicio 1");
        String ej1 = "prueba";
        ej1 = null;
        if(ej1 != null && !ej1.isBlank()){
            System.out.println(ej1.toLowerCase());
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        System.out.println("Ejercicio 2");
        var scanner = new Scanner(System.in);
        /*String name;
        int age;
        System.out.println("Ingrese su pinche nombre: ");
        name = scanner.nextLine();
        System.out.println("Ingrese su puñetera edad: ");
        age = scanner.nextInt();
        System.out.println(String.format("Usted se llama: %s y tiene: %d años de edad.", name, age));
        scanner.close();*/


        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        System.out.println("Ejercicio 3");
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        String message = "Esta es una variable local";
        System.out.println(message);
        System.out.println(ExtrasExercises.message);

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        /*System.out.println("Ejercicio 5");
        double numero;
        System.out.println("Ingrese un número para comprobar si es par o impar: ");
        numero = scanner.nextDouble();
        if(numero>=0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }*/

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println("Ejercicio 6");
        System.out.println(Clase.palabra);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        System.out.println("Ejercicio 7");
        var random = new Random();
        for(int i=0; i<=10; i++){
            System.out.println(random.nextInt(11));
        }
        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.


        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        System.out.println("Ejercicio 9 ");
        var user = new UserUltimo();
        var nombre = UserUltimo.APP_NAME;
        System.out.println(nombre);
        user.printVariables();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.

    }
}
