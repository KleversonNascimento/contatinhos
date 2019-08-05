/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatinhos;
import bot.Crawler;
import bot.ReadFiles;
import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);
        Universidade UFABC = new Universidade("UFABC");
        System.out.println("Carregando informações dos professores...");
        Crawler.getTeachersInfos(UFABC);
        System.out.println("Professores carregados");
        ReadFiles.readClasses(UFABC);
        while (true) {
            System.out.println("Menu principal:");
            System.out.println("1 - Ver matérias de um aluno");
            System.out.println("2 - Sala de um professor");
            
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o RA do aluno");
                String ra = scannerText.nextLine();
                UFABC.getTurmasByRA(ra);
            } else if (opcao == 2) {
                System.out.println("Digite o nome do professor");
                String nome = scannerText.nextLine();
                UFABC.getRoomByName(nome);
            }
        }
    }

}
