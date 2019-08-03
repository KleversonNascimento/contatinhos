/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatinhos;
import bot.Crawler;
import universidade.Universidade;
/**
 *
 * @author kleverson
 */
public class Contatinhos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidade UFABC = new Universidade("UFABC");
        Crawler.getTeachersInfos(UFABC);
        UFABC.getAllTeachers();
    }

}
