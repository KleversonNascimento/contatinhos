package universidade;
/*import pessoas.Aluno;*/

public class Turma{
	private String nomeTurma;
	private Professor prof;
        private Aluno[] alunos;
        private Sala sala;
        private Horario hora;

        public Turma(){}
	public Turma(String nomeTurma, Aluno[] alunos, Professor prof, Sala sala, Horario hora){
		this.nomeTurma = nomeTurma;
                this.alunos = alunos;
		this.prof = prof;
                this.sala = sala;
                this.hora = hora;
	}

	public void setNomeTurma(String nomeTurma){
		this.nomeTurma = nomeTurma;
	}
        public void setProfessor(Professor prof){
            this.prof = prof;
        }
        public void setSala(Sala sala){
            this.sala = sala;
        }
        public void setHora(Horario hora){
            this.hora = hora;
        }
        
	public String getNomeTurma(){
		return this.nomeTurma;
	}
        public Professor getProfessor(){
            return this.prof;
        }
        public Sala getSala(){
            return this.sala;
        }
        public Horario getHora(){
            return this.hora;
        }
}