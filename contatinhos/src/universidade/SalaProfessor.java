/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

/**
 *
 * @author kleverson
 */
public class SalaProfessor implements Sala {
    String nome;
    
    public SalaProfessor (String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getSala() {
        return this.nome;
    }
    
    @Override
    public void setSala(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getType() {
        return "Teacher room";
    }
}
