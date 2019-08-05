package universidade;
/*import pessoas.Aluno;*/

public class Turma{
	private String nomeTurma;
	private Professor prof;
        private Aluno[] alunos;
        private Horario[] hora;

        public Turma(){}
	public Turma(String nomeTurma, Aluno[] alunos, Professor prof, Horario[] hora){
		this.nomeTurma = nomeTurma;
                this.alunos = alunos;
		this.prof = prof;
                this.hora = hora;
	}

	public void setNomeTurma(String nomeTurma){
		this.nomeTurma = nomeTurma;
	}
        public void setProfessor(Professor prof){
            this.prof = prof;
        }
        
	public String getNomeTurma(){
		return this.nomeTurma;
	}
        public Professor getProfessor(){
            return this.prof;
        }
        public Horario getHora(int i){
            return this.hora[i];
        }
        
        public Aluno[] getAlunos(){
            return this.alunos;
        }
}