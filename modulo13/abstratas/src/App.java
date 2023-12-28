public class App {
    public static void main(String[] args) throws Exception {


        Assalariado empregado = new Assalariado();
        empregado.setCpf("11111");
        empregado.setNome("Alexandre");
        empregado.setSobrenome("Veras");
        empregado.setSalario(100.00);
        imprimir(empregado);


        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("22222");
        comissionado.setNome("Alex");
        comissionado.setSobrenome("Domingues");
        comissionado.setTotalComissao(0.1);
        comissionado.setTotalVenda(2000.00);
        imprimir(comissionado);


        Horista horista = new Horista();
        horista.setCpf("33333");
        horista.setNome("Andre");
        horista.setSobrenome("Vieira");
        horista.setPrecoHora(100.00);
        horista.setTotalHoraTrabalhada(60.00);
        imprimir(horista);
    }


    public static void imprimir(Empregado empregado) {
        System.out.println(empregado.getNome() + " tem de salário: " + empregado.vencimento());
    }
    
}
