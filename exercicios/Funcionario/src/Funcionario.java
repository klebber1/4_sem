public class Funcionario {
    private String departamento;
    private double salario;
    private  String rg;
    private String nome;
    private  boolean ativo;

    public Funcionario(String nome, String departamento, String rg, double salario) {
        this.departamento = departamento;
        this.salario = salario;
        this.rg = rg;
        this.nome = nome;
        this.ativo = true;
    }

    public  void  Bonificar(double valor){


    }

    public void listar(){
        System.out.println("Dados do Funcionario");
        System.out.println("Nome = "+nome);
        System.out.println("RG = "+rg);
        System.out.println("departamento = "+departamento);
        String texto = ativo ? "Ativo" : "Inativo";
        System.out.println("Situacao do funcionario"+texto);

    }
    public  String getRg(){
        return rg;
    }

}
