package universidade.curso;

import universidade.Turma;

public class BI extends CursoEspecifico{
        private CursoEspecifico[] cursoEsp;

	public BI(){}
	public BI(Turma[] turma, CursoEspecifico[] cursoEsp){
            this.turma = turma;
            this.cursoEsp = cursoEsp;
	}

	public void setCursosEspecificos(CursoEspecifico[] cursoEsp){
		this.cursoEsp = cursoEsp;
	}
	public CursoEspecifico[] getCursosEspecificos(){
		return this.cursoEsp;
	}

	public void printTurmas(){
            for (Turma turma1 : turma) {
                System.out.println(turma1.getNomeTurma());
            }
	}
}