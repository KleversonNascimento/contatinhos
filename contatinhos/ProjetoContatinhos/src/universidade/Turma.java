package universidade;
import universidade.sala.Sala;
import universidade.pessoa.Professor;
/*import pessoas.Aluno;*/

public class Turma{
	private String nomeTurma;
	private Professor prof;
        private Sala sala;
        private Horario hora;
	/*private int tamTurma; //tamanho da turma;
        private Aluno[] aluno;*/

        public Turma(){}
	public Turma(String nomeTurma/*, int tamTurma*/, Professor prof, Sala sala, Horario hora){
		this.nomeTurma = nomeTurma;
		/*this.tamTurma = tamTurma;
                aluno = new Aluno[tamTurma];*///Não vamos pegar dados de alunos
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
        


	/*public void setTamTurma(int tamTurma){
		this.tamTurma = tamTurma;
	}
	public int getTamTurma(){
		return this.tamTurma;
	}*/
}