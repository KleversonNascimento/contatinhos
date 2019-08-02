/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot;


import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/**
 *
 * @author kleverson
 */
public class Crawler {
    private static final String URL_TEACHERS_INFOS = "http://www.ufabc.edu.br/ensino/docentes";
    private static final String TABLE_SELECTOR = "#docentes_list";
    private static final String LINE_SELECTOR = "tr";
    private static final String LINK_SELECTOR = "a";
    private static final String HREF_SELECTOR = "abs:href";

    public static void getTeachersInfos () {
        try {
            Document page = Jsoup.connect(URL_TEACHERS_INFOS).get();
            
            ArrayList<String> teachers_links =  getTeachersLinksFromPrincipalPage(page);
            
            
        } catch (Exception ex) {}   
    }
    
    private static ArrayList<String> getTeachersLinksFromPrincipalPage(Document page) {
        Elements teachers_table = page.select(TABLE_SELECTOR);
        Elements teachers = teachers_table.select(LINE_SELECTOR);
        ArrayList<String> links = new ArrayList();
        
        for (int i = 0; i < teachers.size(); i++) {
            String link = teachers.select(LINK_SELECTOR).get(i).attr(HREF_SELECTOR);
            links.add(link);
        }
        
        return links;
    }
}
