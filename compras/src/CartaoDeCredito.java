import java.util.List;
import java.util.ArrayList;

public class CartaoDeCredito {
    private double limite;
    private double saldoDevedor;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldoDevedor = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (compra.getValor() <= saldoDevedor) {
            compras.add(compra);
            saldoDevedor -= compra.getValor();
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public List<Compra> getCompras() {
        return compras;
    }

}
