package universidade.sala;

import universidade.Turma;

public class SalaSBC implements Sala{
    private Turma[] turma;
    private String sala;
    
    public SalaSBC(){}
    public SalaSBC(String sala){
        this.sala = sala;
    }

    public String campus(){
        return "SBC";
    }
    
    @Override
    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String getSala() {
        return sala;
    }

    @Override
    public void setTurma(Turma[] turma) {
        this.turma = turma;
    }

    @Override
    public Turma[] getTurma() {
        return this.turma;
    }
}