package universidade;

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

    public void setTurma(Turma[] turma) {
        this.turma = turma;
    }

    public Turma[] getTurma() {
        return this.turma;
    }
}