package Exercises.POO;

public class User {
    // Atributos
    private String username;
    private String password;
    // Constructores
    public User(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
    }
    // Setters
    public void setUsername(String username){
        if(username.isBlank() && username.length()<=5){
            System.out.println("El username no puede estar vacío y tiene que tener al menos 5 caracteres.");
        }else{
            this.username = username;
        }
    }
    public void setPassword(String password){
        if(password.isBlank() && password.length()<=5){
            System.out.println("El password no puede estar vacío y tiene que tener al menos 5 caracteres.");
        }else{
            this.password = password;
        }
    }
    // Getters
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
    // Métodos
    public boolean checkPassword(String inputPassword){
        if(inputPassword.equals(password)){
            System.out.println("Si, es esta tu contraseña!!");
            return true;
        }else{
            System.out.println("No, Esta no es tu contraseña :(, prueba de nuevo");
            return false;
        }
    }
}
