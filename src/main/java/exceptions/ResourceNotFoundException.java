package exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException (String mess)
    {
        super(mess);
    }


}
