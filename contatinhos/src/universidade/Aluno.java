package universidade;

public class Aluno extends Pessoa {	
    
    private String nome;
	
    @Override
    public void setNome(String nome){
            this.nome = nome;
    }
    
    public Aluno(String RA) {
        this.RA = RA;
    }
}