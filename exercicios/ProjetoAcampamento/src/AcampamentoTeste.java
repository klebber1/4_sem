public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        membro.nome = "kleber";
        membro.idade = 38;

        membro.imprimir();
        membro.separarGrupo();
        System.out.println();
        membro.imprimir();
    }
}
