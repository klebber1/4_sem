public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        membro.nome = "Zezinho";
        membro.idade = 8;
        membro.imprimir();
        membro.separarGrupo();
        System.out.println();
        membro.imprimir();
    }
}