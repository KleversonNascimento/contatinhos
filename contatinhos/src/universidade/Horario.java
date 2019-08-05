package universidade;

public class Horario {
    private String dia, quinzenal;
    private int horaInicio, horaFim;
    private Sala sala;

    public Horario(){}
    public Horario(String dia, int horaInicio, int horaFim, String quinzenal, Sala sala){
    	this.dia = dia;
    	this.horaInicio = horaInicio;
    	this.horaFim = horaFim;
    	this.quinzenal = quinzenal;
        this.sala = sala;
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

    public String getDia(){
    	return this.dia;
    }
    public int getHoraInicio(){
    	return this.horaInicio;
    }
    public int getHoraFim(){
    	return this.horaFim;
    }
    public String getQuinzenal(){
	return this.quinzenal;
    }
}
