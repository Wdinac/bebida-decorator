// ConcreteComponent
// Elemento que será "decorado"
public class Cafe implements Bebida {
    @Override
    public String getDescricao() {
        return "Cafe simples";
    }
    
    @Override
    public double getCusto() {
        return 3.0;
    }
}