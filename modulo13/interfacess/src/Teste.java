public class Teste {
    public static void main(String[] args) throws Exception {
       IVeiculo carro = new CarroPasseio();
       carro.andar();
       carro.parar();


       IVeiculo caminhao = new Caminhao();
       caminhao.andar();
       caminhao.parar();
    }
}
