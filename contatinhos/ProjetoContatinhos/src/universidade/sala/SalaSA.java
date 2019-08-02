package universidade.sala;

import universidade.Turma;

public class SalaSA implements Sala{
    private Turma[] turma;
    private String sala;
    
    public SalaSA(){}
    public SalaSA(String sala){
        this.sala = sala;
    }
    
    public String campus(){
        return "SA";
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