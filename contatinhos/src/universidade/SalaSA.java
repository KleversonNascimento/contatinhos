package universidade;

import java.util.ArrayList;

public class SalaSA implements Sala{
    private ArrayList<Turma> turmas = new ArrayList();
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

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }
    
    @Override
    public String getType() {
        return "Classroom";
    }
}