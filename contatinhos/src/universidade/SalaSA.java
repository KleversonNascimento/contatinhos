package universidade;

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

    public void setTurma(Turma[] turma) {
        this.turma = turma;
    }

    public Turma[] getTurma() {
        return this.turma;
    }    
}