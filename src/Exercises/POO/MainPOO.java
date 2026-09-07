package Exercises.POO;

public class MainPOO {
    static void main() {
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        System.out.println("Ejercicio 1");
        var person1 = new Person("a", -1);
        person1.sayHello();

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        System.out.println("Ejercicio 2");
        var producto1 = new Product(4);
        producto1.setPrice(5);
        System.out.println(producto1.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        System.out.println("Ejercicio 3");
        var bankaccount = new BankAccount("B01");
        System.out.println(bankaccount.getBalance());

        bankaccount.deposit(50);
        System.out.println(bankaccount.getBalance());
        bankaccount.withdraw(60);
        System.out.println(bankaccount.getBalance());

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        System.out.println("Ejercicio 4");
        var book1 = new Book("Causa");
        System.out.println(book1.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        System.out.println("Ejercicio 5");
        var temperatura = new Temperature(100);
        System.out.println(temperatura.getCelsius());

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        System.out.println("Ejercicio 6");
        var usuario = new User("YonosaberMucho", "12345");
        usuario.checkPassword("12345");
        System.out.println(usuario.getUsername());
        System.out.println(usuario.getPassword());
        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        System.out.println("Ejercicio 7");
        var empleado = new Employee(1130, "Juan");
        System.out.println(empleado.getSalary());
        empleado.raiseSalary(400);
        System.out.println(empleado.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        System.out.println("Ejercicio 8");
        var rectangulo = new Rectangle(8,6);
        System.out.println(rectangulo.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        System.out.println("Ejercicio 9");
        var estudiante = new Student(59);
        estudiante.isPassed();
        estudiante.setGrade(60);
        estudiante.isPassed();

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        System.out.println("Ejercicio 10");
        var carro = new Car(30);
        carro.accelerate(20);
        System.out.println(carro.getSpeed());
        carro.brake(49);
        System.out.println(carro.getSpeed());

        //Inheritance


    }
}
