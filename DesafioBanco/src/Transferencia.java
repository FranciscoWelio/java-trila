public interface Transferencia {
    void sacar(double saque);
    void depositar(double deposito);
    void transferirTED(double transferencia, Transferencia destino);
    void PIX(double pix, String mensagem, Transferencia destino);
    void Extrato();
    
} 
