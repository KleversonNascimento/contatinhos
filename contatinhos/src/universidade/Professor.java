package universidade;

public class Professor extends Pessoa {
    private String area, centro, telefone;
    private Sala sala;

    public Professor(String nome, String email, Sala sala, String area, String centro, String telefone){
	this.nome = "Prof. " + nome;
	this.email = email;
	this.sala = sala;
	this.area = area;
	this.centro = centro;
    	this.telefone = telefone;
    }

    public Professor(String nome){
	this.nome = "Prof. " + nome;
    }

    @Override
    public void setNome(String nome){
    	this.nome = "Prof. " + nome;
    }

    public void setSalaProfessor(Sala sala){
    	this.sala = sala;
    }
    public void setAreaProfessor(String area){
    	this.area = area;
    }
    public void setCentroProfessor(String centro){
	this.centro = centro;
    }
    public void setTelefoneProfessor(String telefone){
	this.telefone = telefone;
    }

    public Sala getSalaProfessor(){
    	return this.sala;
    }
    public String getAreaProfessor(){
    	return this.area;
    }
    public String getCentroProfessor(){
    	return this.centro;
    }
    public String getTelefoneProfessor(){
	return this.telefone;
    }
    
}