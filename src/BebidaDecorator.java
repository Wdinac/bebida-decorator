// Decorator
public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;
    
    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}