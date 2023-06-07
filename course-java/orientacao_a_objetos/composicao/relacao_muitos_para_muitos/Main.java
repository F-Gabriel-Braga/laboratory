package orientacao_a_objetos.composicao.relacao_muitos_para_muitos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel");
        Aluno aluno2 = new Aluno("Estefane");
        Aluno aluno3 = new Aluno("Rita");
        Aluno aluno4 = new Aluno("Diego");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("JavaScript");
        Curso curso3 = new Curso("React Native");
        Curso curso4 = new Curso("Android Studio");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno4);

        curso4.adicionarAluno(aluno1);
        curso4.adicionarAluno(aluno4);

        System.out.println("\n" + curso1.nome);
        for(Aluno aluno: curso1.alunos) {
            System.out.println(aluno);
        }

        System.out.println("\n" + curso2.nome);
        for(Aluno aluno: curso2.alunos) {
            System.out.println(aluno);
        }

        System.out.println("\n" + curso3.nome);
        for(Aluno aluno: curso3.alunos) {
            System.out.println(aluno);
        }

        System.out.println("\n" + curso4.nome);
        for(Aluno aluno: curso4.alunos) {
            System.out.println(aluno);
        }

        System.out.println("\n" + aluno1.obterCursoPorNome("Java Completo"));
        System.out.println("\n" + aluno1.obterCursoPorNome("JavaScript"));

    }
}
