package Exercises.POO;

public class LoginSystem {
    // Atributos
    private String username, password;
    // Constructor
    public LoginSystem(String username, String password){
        this.setUsername(username);
        this.setPassword(password);
    }
    // Setters
    public void setUsername(String username){
        if(username.isBlank()){
            throw new IllegalArgumentException("El username está vacío");
        }else{
            this.username = username;
        }
    }
    public void setPassword(String password){
        if(password.isBlank()){
            throw new IllegalArgumentException("El password está vacío");
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
    public void login(String username, String password) throws LoginFailedException{
        if(username.equals(this.username) && password.equals(this.password)){
            System.out.println("Se inició sesión con éxito :)");
        }else{
            throw new LoginFailedException("Las credenciales no son correctas, inténtelo de nuevo.");
        }
    }
}
