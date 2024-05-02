import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o parâmetro nº 1:");
        a = scan.nextInt();
        System.out.println("Digite o parâmetro Nº 2:");
        b = scan.nextInt();
        scan.close();
        try {
            Repetition(a, b);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção Detectada: " +e.getMessage());
        }
        
    }
    public static void Repetition(int x, int y) throws ParametrosInvalidosException{
        if (x > y) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{ 
            int i = y - x;
            for (int j = 0; j<= i; j++ ){
                System.out.println("Imprimindo o número " + j);
            }
        }
    }
}
