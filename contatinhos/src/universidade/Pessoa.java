package universidade;

import java.util.ArrayList;

public abstract class Pessoa{
    protected String nome;
    protected String email;
    protected String RA;
    private ArrayList<Turma> turmas = new ArrayList();

    public abstract void setNome(String nome);

    public String getNome(){
	return this.nome;
    }

    public void setEmail(String email){
	this.email = email;
    }

    public String getEmail(){
    	return this.email;
    }

    public void adicionarTurma(Turma turma){
	this.turmas.add(turma);
    }
    public ArrayList<Turma> getTurmas(){
	return turmas;
    }
    
    public String getRA() {
        return this.RA;
    }
}