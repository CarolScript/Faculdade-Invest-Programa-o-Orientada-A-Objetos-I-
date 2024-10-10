import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Nome2 = "Emilly";
        byte idade = 55;
        boolean maiorDeIdade = true;
        char sexo = 'M';
        String estado = "MT";

        System.out.println("Nome:" + Nome2);
        System.out.println("Idade:" + idade);
        System.out.println("maiorDeIdade:" + maiorDeIdade);
        System.out.println("Sexo:" + sexo);
        System.out.println("Estado:" + estado);

        //1

        String Nome1 = "Emilly";
        String email2 = "Emilly@gmail.com";
        System.out.println("Olá " + Nome1 + "! Seu email " + email2 + " foi cadastrado");

        //2

        Scanner scanner = new
                Scanner(System.in);

        System.out.println("Digite seu Nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu email:");
        String email = scanner.nextLine();

        System.out.println("Olá " + nome + "! Seu email " + email + " foi cadastrado");

        //3


        System.out.println("Digite sua Massa:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua Altura:");
        double alt = scanner.nextDouble();

        double imc = peso / (alt * alt);

        System.out.println("Seu IMC é:" + imc);



        //4


        System.out.println("Digite suas Notas de 1 a 10:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double nota = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua Média é:" + nota);

//5


        System.out.println("Digite sua Idade:");
        double idade2 = scanner.nextDouble();

        if (idade2 < 18) {
            System.out.println("Você é menor de idade");
        }

        if (idade2 > 18) {
            System.out.println("Você é maior de Idade");
        }
        //6


        System.out.println("Digite sua senha:");
        double senha1 = scanner.nextDouble();

        System.out.println("Digite sua senha novamente:");
        double senha2 = scanner.nextDouble();

        if (senha1 != senha2) {
            System.out.println("error");
        }

        if (senha1 == senha2) {
            System.out.println("Calma que já está acabando!");
            //7


            System.out.println("Digite seu email:");
            String emailr = scanner.next();

            System.out.println("Digite sua senha:");
            String senhap = scanner.next();

            System.out.println("Digite seu email novamente:");
            String email3 = scanner.next();

            System.out.println("Digite sua senha novamente:");
            String senhac = scanner.next();

            boolean emailiguais =
                    emailr.equals(email3);

            boolean senhasiguais =
                    senhap.equals(senhac);


            if (emailiguais && senhasiguais) {
                System.out.println("Seja Bem Vindo ao Nosso Sistema!");
            } else {
                if (!emailiguais) {
                    System.out.println("emails invalidos");
                    if (!senhasiguais) {
                        System.out.println("Senhas invalidas");
                    }
                }
            }


        }

    }
}







