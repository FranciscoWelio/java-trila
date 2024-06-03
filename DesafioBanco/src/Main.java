public class Main {
    public static void main(String[] args) throws Exception {
        Cliente nomes = new Cliente();
        nomes.setNome("");
        nomes.setCpf("");
        Conta cc = new ContaCorrente(nomes);
        Conta cp = new ContaPoupança(nomes);
        cc.Extrato();
        cc.depositar(100);
		cc.transferirTED(100,cp);
        cp.PIX(50, "Foi 50 a mais", cc);
        cp.PIX(1, "1 real", cc);
		cp.Extrato();
    }
}
