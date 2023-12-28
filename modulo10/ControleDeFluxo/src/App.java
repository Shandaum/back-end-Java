import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner pra receber informação do usuário
        Scanner s = new Scanner(System.in);

        System.out.println("IF");
        System.out.print("Digite a nota 1: ");
        int nota1 = s.nextInt();
        System.out.print("Digite a nota 2: ");
        int nota2 = s.nextInt();
        System.out.print("Digite a nota 3: ");
        int nota3 = s.nextInt();
        System.out.print("Digite a nota 4: ");
        int nota4 = s.nextInt();
        System.out.println(retornarMedia(nota1,nota2,nota3,nota4));

        System.out.println("");
        System.out.println("FOR");
        contarFor();

        System.out.println("");
        System.out.println("Tabuada FOR");
        System.out.print("Digite o númnero para calcular a tabuada: ");
        int numeroTabuada = s.nextInt();
        gerarTabuadaFor(numeroTabuada);

        System.out.println("");
        System.out.println("WHILE");
        contarWhile();

        System.out.println("");
        System.out.println("Tabuada WHILE");
        gerarTabuadaWhile();

        System.out.println("");
        System.out.println("Tabuada DO WHILE");
        gerarTabuadaDoWhile();

        System.out.println("");
        System.out.println("SWITCH CASE");
        System.out.print("Digite o númnero para verificar o mês: ");
        int mes = s.nextInt();
        System.out.println(getMes(mes));

        s.close();
    }

    // IF, ELSE IF, ELSE
    public static String retornarMedia(int nota1, int nota2, int nota3, int nota4) {
        double media = (nota1+nota2+nota3+nota4)/4;
        if (media >= 7) {
            return media+" - Aprovado";
        } else if (media < 7 && media >= 5) {
            return media+" - Recuperação";
        } else {
            return media+" - Reprovado";
        }
    }

    // FOR
    public static void contarFor() {
        for (int i = 0; i <= 10; i++) {
            if (i == 8) {
                break;
            }
            if (i == 4)
                continue;
            System.out.println(i);
        }
    }

    public static void gerarTabuadaFor(int numeroTabuada) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " X " + i + " = " + numeroTabuada * i);
        }
    }

    // WHILE
    public static void contarWhile() {
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }

    public static void gerarTabuadaWhile() {
        Scanner s = new Scanner(System.in);
        System.out.print("Deseja gerar a tabuada de algum numero? ");
        String resposta = s.next();
        while (resposta.equalsIgnoreCase("Sim")) {
            System.out.print("Digite um numero para gerar a tabuada: ");
            int num = s.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }

            System.out.print("Deseja gerar novamente a tabuada de algum numero? ");
            resposta = s.next();
        }
        System.out.println("Obrigado!");
    }

    // DO WHILE
    public static void gerarTabuadaDoWhile() {
        Scanner s = new Scanner(System.in);
        String resposta = "";
        do {
            System.out.print("Digite um numero para gerar a tabuada: ");
            int num = s.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }
            System.out.print("Deseja gerar a tabuada de algum numero? ");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("Obrigado!");
    }

    // SWITCH CASE
    public static String getMes(int mes) {
        String result;
        switch (mes) {
            case 1:
                result = "Janeiro";
                break;
            case 2:
                result = "Fevereiro";
                break;
            case 3:
                result = "Março";
                break;
            case 4:
                result = "Abril";
                break;
            case 5:
                result = "Maio";
                break;
            case 6:
                result = "Junho";
                break;
            case 7:
                result = "Julho";
                break;
            case 8:
                result = "Agosto";
                break;
            case 9:
                result = "Setembro";
                break;
            case 10:
                result = "Outubro";
                break;
            case 11:
                result = "Novembro";
                break;
            case 12:
                result = "Dezembro";
                break;
            default:
                result = "Mês não existe!";
                break;
        }
        return result;
    }
}
