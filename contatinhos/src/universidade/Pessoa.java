package universidade;

public abstract class Pessoa{
    protected String nome;
    protected String email;
    private Turma[] turma;

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

    public void adicionarTurma(Turma[] turma){
	this.turma = turma;
    }
    public Turma[] getTurma(){
	return turma;
    }
}