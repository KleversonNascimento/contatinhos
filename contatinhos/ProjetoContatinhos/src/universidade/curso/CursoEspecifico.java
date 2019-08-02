/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade.curso;

import universidade.Turma;

/**
 *
 * @author ufabc
 */
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
