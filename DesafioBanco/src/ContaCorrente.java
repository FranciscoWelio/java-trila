public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    public void extrado(){
        System.out.println("Extrato Conta Corrente");
        super.Extrato();
    }

    
}
