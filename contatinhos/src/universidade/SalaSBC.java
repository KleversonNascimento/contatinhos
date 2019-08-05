package universidade;

import java.util.ArrayList;

public class SalaSBC implements Sala{
    private ArrayList<Turma> turmas;
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

    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    @Override
    public String getType() {
        return "Classroom";
    }
}