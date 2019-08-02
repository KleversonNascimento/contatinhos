/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

/**
 *
 * @author Eugene
 */
public class Horario {
    private String dia;
    private int horaInicio, horaFim, quinzenal;

    public Horario(){}
    public Horario(String dia, int horaInicio, int horaFim, int quinzenal){
    	this.dia = dia;
    	this.horaInicio = horaInicio;
    	this.horaFim = horaFim;
    	this.quinzenal = quinzenal;
    }

    public void setDia(String dia){
    	this.dia = dia;	
    }
    public void setHoraInicio(int horaInicio){
    	this.horaInicio = horaInicio;	
    }
    public void setHoraFim(int horaFim){
    	this.horaFim = horaFim;	
    }
    public void setQuinzenal(int quinzenal){
    	this.quinzenal = quinzenal;	
    }

    public String getDia(){
    	return this.dia;
    }
    public int getHoraInicio(){
    	return this.horaInicio;
    }
    public int getHoraFim(){
    	return this.horaFim;
    }
    public int getQuinzenal(){
	return this.quinzenal;
    }
}
