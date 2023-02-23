package eu.mauizio90.userexception;

/**
 *
 * @author mauiz
 */
public class User {
    String firstName;
    String lastName;
    String email;
    String password;
    int age;

    public User(String firstName, String lastName, String email, String password, int age) {
        if(firstName == null || lastName == null){
            throw new SignInException("non puoi lasciare il campo vuoto");
        }
        
        if(!email.contains("@") || !email.contains(".")){
            throw new SignInException("indirizzo email non valido");
        }
        
        if(password.length()<8){
            throw new SignInException("la password deve contenere almeno 8 caratteri");
        }
        
        if(age < 18 || age < 0){
            throw new SignInException("inserisci un'età valida, devi essere maggiorenne");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null){
            throw new SignInException("non puoi lasciare il campo vuoto");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;       
    }

    public void setLastName(String lastName) {
        if(lastName == null){
            throw new SignInException("non puoi lasciare il campo vuoto");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@") || !email.contains(".")){
            throw new SignInException("indirizzo email non valido");
        }
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()>8){
            throw new SignInException("la password deve contenere almeno 8 caratteri");
        }
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 && age < 0){
            throw new SignInException("inserisci un'età valida, devi essere maggiorenne");
        }
        this.age = age;
        
    }
    
    
}
