public class Aluno {

        private int ra;
        private String nome;
        private String login;
        private String senha;
        private String turma;

        public Aluno(){


        }

        public Aluno(String login, String senha){
            this.login = login;
            this.senha = senha;

        }

        public Aluno(int ra, String nome, String login, String senha, String turma) {
            this(login,senha);
            this.ra = ra;
            this.nome = nome;
            this.turma = turma;

        }

    @Override
    public String toString() {
        return "Dados do Aluno: \n"+
                "RA: "+ra+"\n"+
                "Nome: "+nome+"\n"+
                "Turma: "+turma+"\n"+
                "Login: "+login+"\n";
    }
}
