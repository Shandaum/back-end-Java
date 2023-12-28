public interface IVeiculo {
    //interface serve para gerar o que será obrigatório nas classes que implementarem
    
    //metodo defalt o implemento pode ser feito aqui mesmo, sendo padrão para as classes implementadas, podendo ter a alteração em cada classe
    default void parar(){
        System.out.println("O veículo está parando");
    }


    //metodo que precisa ser descrito em toda classe que tiver esta interface
    public void andar();


}
