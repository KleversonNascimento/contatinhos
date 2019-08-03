/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot;

import universidade.SalaProfessor;
import universidade.Professor;
import universidade.Universidade;
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
    private static final String NAME_SELECTOR = "documentFirstHeading";
    private static final String AREA_CLASS_SELECTOR = "item-page item-page";
    private static final String AREA_COMPONENT = "h2";
    private static final String AREA_REPLACE_TEXT = "Área: ";
    private static final String EMPTY_TEXT = "";
    private static final String TITLE = "title";
    private static final String EMAIL = "Email";
    private static final String CENTER_REPLACE_TEXT = "Centro: ";
    private static final String ROOM_REPLACE_TEXT = "Sala: ";
    private static final String TELEPHONE_REPLACE_TEXT = "Telefone: ";
    private static final String AUTHOR_INFO = "infoAutor";
    private static final String ITEM_TABLE = "li";

    public static void getTeachersInfos (Universidade university) {
        try {
            Document page = Jsoup.connect(URL_TEACHERS_INFOS).get();
            
            ArrayList<String> teachers_links =  getTeachersLinksFromPrincipalPage(page);
            saveInfos(teachers_links, university);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }   
    }
    
    private static ArrayList<String> getTeachersLinksFromPrincipalPage(Document page) {
        Elements teachers_table = page.select(TABLE_SELECTOR);
        Elements teachers = teachers_table.select(LINE_SELECTOR);
        ArrayList<String> links = new ArrayList();
        
        for (int i = 0; i < (teachers.size() - 1); i++) {
            String link = teachers.select(LINK_SELECTOR).get(i).attr(HREF_SELECTOR);
            links.add(link);
        }
        
        return links;
    }
    
    private static void saveInfos(ArrayList<String> teachers, Universidade university) {
        for (int i = 0; i < teachers.size(); i++) {
            try {
                Document page_teacher = Jsoup.connect(teachers.get(i)).get();
                final String name_teacher = page_teacher.getElementsByClass(NAME_SELECTOR).get(0).text();
                final String email_teacher = page_teacher.getElementsByAttributeValueContaining(TITLE, EMAIL).get(0).text();
                final String area = page_teacher.getElementsByClass(AREA_CLASS_SELECTOR).get(0).selectFirst(AREA_COMPONENT).text().replace(AREA_REPLACE_TEXT, EMPTY_TEXT);
                String center = EMPTY_TEXT;
                String telephone = EMPTY_TEXT;
                String room = EMPTY_TEXT;
                Elements table_infos = page_teacher.getElementsByClass(AUTHOR_INFO).select(ITEM_TABLE);
                
                for (int j = 0; j < table_infos.size(); j++) {
                    if (table_infos.get(j).text().contains(CENTER_REPLACE_TEXT)) {
                        center = table_infos.get(j).text().replace(CENTER_REPLACE_TEXT, EMPTY_TEXT);
                    } else if (table_infos.get(j).text().contains(ROOM_REPLACE_TEXT)) {
                                room = table_infos.get(j).text().replace(ROOM_REPLACE_TEXT, EMPTY_TEXT);
                            } else if (table_infos.get(j).text().contains(TELEPHONE_REPLACE_TEXT)) {
                                        telephone = table_infos.get(j).text().replace(TELEPHONE_REPLACE_TEXT, EMPTY_TEXT);
                                    }
                }
                
                SalaProfessor room_teacher = new SalaProfessor(room);
                Professor teacher = new Professor(name_teacher, email_teacher, room_teacher, area, center, telephone);
                university.addTeacher(teacher);
                System.out.println(i);
            } catch (Exception ex) {}
        } 
    }
}
