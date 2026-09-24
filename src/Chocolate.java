// ConcreteDecorator
public class Chocolate extends BebidaDecorator {
    public Chocolate (Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 2.0;
    }
}