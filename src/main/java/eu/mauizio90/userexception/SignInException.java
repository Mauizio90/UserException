package eu.mauizio90.userexception;

/**
 *
 * @author mauiz
 */
public class SignInException extends RuntimeException{
    
    public SignInException(){
        super();
    }
    
    public SignInException(String message){
        super(message);
    }
    
    public SignInException(Throwable th){
        super(th);
    }
    
    public SignInException(String message, Throwable th){
        super(message, th);
    }
}
