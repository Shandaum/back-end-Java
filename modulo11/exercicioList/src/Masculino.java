public class Masculino {

    private String nome;

    public Masculino(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Masculino [nome=" + nome + "]";
    }

}
