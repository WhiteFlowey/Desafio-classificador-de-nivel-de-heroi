import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        char saida = 's';
        int xp;

        while (saida == 's') 
        {
            System.out.println("\nInforme o nome do seu herói: ");
            nome = scanner.nextLine();
            System.out.println("Informe o xp do seu herói: ");
            xp = scanner.nextInt();

            if (xp <= 1000) 
            {
                System.out.println("\nO herói de nome " + nome + " está no nível Ferro.");
            } 
                else if (xp >= 1001 && xp <= 2000) 
                {
                    System.out.println("\nO herói de nome " + nome + " está no nível Bronze.");
                } 
                    else if (xp >= 2001 && xp <= 5000) 
                    {
                        System.out.println("\nO herói de nome " + nome + " está no nível Prata.");
                    } 
                        else if (xp >= 5001 && xp <= 7000) 
                        {
                            System.out.println("\nO herói de nome " + nome + " está no nível Ouro.");
                        } 
                            else if (xp >= 7001 && xp <= 8000) 
                            {
                                System.out.println("\nO herói de nome " + nome + " está no nível Platina.");
                            } 
                                else if (xp >= 8001 && xp <= 9000) 
                                {
                                    System.out.println("\nO herói de nome " + nome + " está no nível Ascendente.");
                                } 
                                    else if (xp >= 9001 && xp <= 10000) 
                                    {
                                        System.out.println("\nO herói de nome " + nome + " está no nível Imortal.");
                                    } 
                                        else if (xp >= 10001) 
                                        {
                                            System.out.println("\nO herói de nome " + nome + " está no nível Radiante.");
                                        }

            System.out.println("\nDeseja continuar? (s/n)");
            saida = scanner.next().charAt(0);
            while (saida != 'n' && saida != 's') 
            {
                System.out.println("Resposta Inválida");
                System.out.println("\nDeseja continuar? (s/n)");
                saida = scanner.next().charAt(0);
            }
            scanner.nextLine(); // Limpa o buffer do scanner
        }

        System.out.println("Saindo...");
        scanner.close();
    }
}
