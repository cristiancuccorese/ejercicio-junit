package classes;

public class CuentaBancaria {
    private Usuario titular;
    private double saldo;

    public CuentaBancaria(Usuario usuario) {
        titular = usuario;
    }

    public Usuario getUsuario() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double saldoADepositar) {
        if (saldoADepositar <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor a 0");
        }
        saldo += saldoADepositar;
    }
}
