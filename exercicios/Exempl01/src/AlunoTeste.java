


public class AlunoTeste {
    public static void main(String[] args) {

        Aluno aluno1, aluno2, aluno3;

        aluno1=new Aluno();

        aluno2=new Aluno("kleber","123");

        aluno3=new Aluno(1,"Antonio",
                "aluAntonio", "456","ADS");
        System.out.println( aluno1);
        System.out.println( aluno2);
        System.out.println( aluno3);
        System.out.println(Math.sqrt(Math.PI));
    }
}
