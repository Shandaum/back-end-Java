public class App {
    public static void main(String[] args) throws Exception {
        
        //Composição precisa de uma base em classe para ser usada como central, como por exemplo um banco e suas contas 

        Banco banco = new Banco();

        banco.setCodigo(10L);
        banco.setNome("BancoV");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10.00);
        

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10.00);


    }
}
