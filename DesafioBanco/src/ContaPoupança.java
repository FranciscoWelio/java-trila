public class ContaPoupança  extends Conta{

    public ContaPoupança(Cliente cliente) {
        super(cliente);
        
    }
    public void extrado(){
        System.out.println("Extrato Conta Poupança");
        super.Extrato();
    }
    
}