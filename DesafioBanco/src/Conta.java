public abstract class Conta implements Transferencia{
    private static final int numero_agencia = 19; 
    private static int numero_conta = 1000;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    

    public Conta(Cliente cliente2) {
        this.agencia = numero_agencia;
        this.numero = numero_conta++;
        this.cliente = cliente2;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double saque){
        saldo = saldo -saque;
    } 
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    public void transferirTED(double valor, Transferencia destino){
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void PIX(double valor, String mensagem, Transferencia destino){
        this.sacar(valor);
        System.out.println(mensagem);
        destino.depositar(valor);
    }


    public void conta(Cliente cliente){
        this.agencia = numero_agencia;
        this.numero = numero_conta++;
        this.cliente = cliente;
    }
    
    public void Extrato(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println("Agência: "+ this.agencia);
        System.out.println("Conta: " +this.numero);
        System.out.println("Saldo: "+ this.saldo);
    }
    
}
