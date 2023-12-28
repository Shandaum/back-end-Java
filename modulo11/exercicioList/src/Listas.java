import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Listas masculinoList = new Listas();
        Listas femininoList = new Listas();

        String resposta = "";
        do {
            System.out.print("Digite seu nome: ");
            String nome = s.next();
            System.out.print("Digite seu sexo(M/F): ");
            String sexo = s.next();

            if (sexo.equalsIgnoreCase("M")) {
                masculinoList.adicionarMasculino(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                femininoList.adicionarFeminino(nome);
            } else {
                System.out.println("Sexo não localizado");
            }
            System.out.print("Deseja informar outra pessoa?(S/N) ");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("");
        System.out.println("Lista dos nomes masculinos: ");
        masculinoList.obterNomesMasculinos();

        System.out.println("");
        System.out.println("Lista dos nomes femininos: ");
        femininoList.obterNomesFemininos();

        s.close(); 
    }

    private List<Masculino> masculinoList;
    private List<Feminino> femininoList;

    public Listas() {
        this.femininoList = new ArrayList<>();
        this.masculinoList = new ArrayList<>();
    }

    public void adicionarMasculino(String nome) {
        masculinoList.add(new Masculino(nome));
    }

    public void adicionarFeminino(String nome) {
        femininoList.add(new Feminino(nome));
    }

    public void obterNomesMasculinos() {
        System.out.println(masculinoList);
    }

    public void obterNomesFemininos() {
        System.out.println(femininoList);
    }

}
