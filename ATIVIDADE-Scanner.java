import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        double peso = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seus dados:  ");
        idade = scanner.nextInt();
        peso = scanner.nextDouble();
        scanner.nextLine();
        nome = scanner.nextLine();
        
        scanner.close();
        
        System.out.println("Nome "+ nome);
        System.out.println("idade "+ idade);
        System.out.println("peso "+ peso);
    }
}
