public class Caminhao implements IVeiculo {

    @Override
    public void andar() {
        System.out.println("O caminhão está andando!");
    }


    //alterando o metodo default no Implemento - botão direito-ação de origem
    @Override
    public void parar() {
        System.out.println("O caminhão está parando!");
    }

    
    
    
}
