package universidade;

class CursoEspecifico {
    private String nomeCurso;
    Turma[] turma;

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public String getNomeCurso(){
        return this.nomeCurso;
    }
        
    public void setTurma(Turma[] turma){
    	this.turma = turma;
    }
    public Turma[] getTurma(){
        return this.turma;
    }
}
