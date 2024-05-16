import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        double limite = scanner.nextDouble();
       
        while (check) {
            double saque = scanner.nextDouble();
            if(saque > limite){
                System.out.print("Limite diario de saque atingido. ");
                check = false;
            }else if(saque ==0){
                check =false;
            }else{
                limite = limite - saque;
                System.out.println("Saque realizado. Limite restante: " + limite);     
            }
        }
        System.out.println("Transacoes encerradas.");
    }
    
}
