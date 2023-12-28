public class App {
    public static void main(String[] args) throws Exception {
        
        
        Fisica fisica = new Fisica();
        fisica.setCpf(111111111);
        fisica.setNome("Alexandre");
        fisica.setEndereco("Rua aaaaaaaaa");
        imprimir(fisica);

        Juridica juridica = new Juridica();
        juridica.setCnpj(22222222);
        juridica.setNome("Veras SA");
        juridica.setEndereco("Av. bbbbbbbbbb");
        imprimir(juridica);
    }


    public static void imprimir(Pessoa pessoa) {
        System.out.println(pessoa.getNome());
    }
    
}
