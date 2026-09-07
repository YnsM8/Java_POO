package Exercises.POO;

/*
Clase 72 - Ejercicios: Excepciones
Vídeo: https://youtu.be/JOAqpdM36wI?t=29721
*/

public class ExceptionsExercises {

    public static void main(String[] args) {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        System.out.println("Ejercicio 1");
        int a = 6;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("El error es el siguiente: " + e.getMessage());
        }
        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        System.out.println("Ejercicio 2");
        int[] lista = {67, 69, 10};
        try{
            System.out.println(lista[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El error aborda el contenido del array: " + e.getMessage());
        }
        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        System.out.println("Ejercicio 3");
        String prueba = null;
        try{
            System.out.println(prueba.length());
        } catch (NullPointerException e){
            System.out.println("El error es el siguiente: " + e.getMessage());
        }
        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        System.out.println("Ejercicio 4");
        try {
            System.out.println(textToNumber("45a"));
        }catch(NumberFormatException e){
            System.out.println("El valor ingresado no és valido, solo se permiten caracteres numéricos: " + e.getMessage());
        }

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        System.out.println("Ejercicio 5");
        int x = 5, y = 0;
        try{
            System.out.println(x/y);
        } catch(ArithmeticException e){
            System.out.println("El error es el mismo que el primero: " + e.getMessage());
        } finally {
            System.out.println("Fin de la operación usando finally");
        }
        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        System.out.println("Ejercicio 6");
        int number = 6;
        if(number>=0){
            System.out.println("El número es válido");
        }else{
            throw new IllegalArgumentException("El número es negativo");
        }
        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        System.out.println("Ejercicio 7");
        var temperatura = new TemperatureChecker();
        try{
            temperatura.checkTemperature(54);
        } catch (InvalidTemperatureException e){
            System.out.println("Error en el valor de la temperatura: " + e);
        }
        System.out.println("Fin ejercicio 7");
        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        System.out.println("Ejercicio 8");
        String[] array = {"Casa", "Colegio", "Hospital"};
        int result = 10;
        try{
            System.out.println(result/10);
            System.out.println(array[array.length]);
        } catch (ArithmeticException e){
            System.out.println("Error de cálculo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException c){
            System.out.println("Error al intentar acceder al valor que no existe: " + c.getMessage());
        }
        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        System.out.println("Ejercicio 9");
        checkPassword("@@@@@1");

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        System.out.println("Ejercicio 10");
        var account = new LoginSystem("yonosabermucho","12345");
        try{
            account.login("bonchiman", "54312");
        } catch (LoginFailedException e){
            System.out.println("El error es con respecto a las credenciales: " + e.getMessage());
        }
    }
    // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
    public static int textToNumber(String text){
        return Integer.parseInt(text);
    }
    // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
    public static void checkPassword(String pass){
        if(pass.length() <=5){
            throw new IllegalArgumentException("La contraseña ingresada es demasiado corta");
        }
        System.out.println("La contraseña es tiene una longitud válida");
    }
}
