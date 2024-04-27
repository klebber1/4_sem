public class Acampamento {
    /* */
    public String  nome;
    public char equipe;
    public int idade;

    //definir os metodos
    public void imprimir(){
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo(){
        if (idade<6){
            equipe = '-';
            return;
        }
        if (idade<=10){
            equipe = 'A';
            return;
        }
        if (idade<=20) {
            equipe = 'B';
        }
        equipe='C';
    }
}
