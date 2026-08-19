public class conta {
    private String titular;
    private int saldo;
    private int limite;
    double valor = 0;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo = 0;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        if (saldo <= 10000) {


        }
        this.limite = limite;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double depositar() {
        if (valor < saldo) {
            IO.println("Valor invalido");
        }
        return valor -= saldo;
    }
    public double sacar() {
        if (valor > saldo) {
            IO.println("Saldo insuficiente");
        }
        return saldo -= valor;
    }

    public conta() {
    }

    @Override
    public String toString() {
        return "conta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", valor=" + valor +
                '}';
    }
}
