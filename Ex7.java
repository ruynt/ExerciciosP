package Ex7;

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEscola(Escola escola) {
        if (!escolas.contains(escola)) {
            escolas.add(escola);
            escola.adicionarProfessor(this); 
        }
    }

    public void exibirEscolas() {
        System.out.println("Professor " + nome + " leciona nas seguintes escolas:");
        for (Escola escola : escolas) {
            System.out.println("- " + escola.getNome());
        }
    }
}

class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
        }
    }

    public void exibirProfessores() {
        System.out.println("Escola " + nome + " tem os seguintes professores:");
        for (Professor professor : professores) {
            System.out.println("- " + professor.getNome());
        }
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");

        professor1.adicionarEscola(escola1);
        professor1.adicionarEscola(escola2);
        professor2.adicionarEscola(escola1);

        escola1.exibirProfessores();
        escola2.exibirProfessores();
        
        professor1.exibirEscolas();
        professor2.exibirEscolas();
    }
}

