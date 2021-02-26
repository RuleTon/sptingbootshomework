package exceptions;

public class ProductNotFound extends RuntimeException{
    public ProductNotFound (String mess) {
        super(mess);
    }
}
