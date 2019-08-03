/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;
import java.util.ArrayList;
/**
 *
 * @author kleverson
 */
public class Universidade {
    private final String name;
    private final ArrayList<Professor> teachers;
    
    public Universidade (String name) {
        this.name = name;
        this.teachers = new ArrayList();
    }
    
    public void addTeacher(Professor teacher) {
        teachers.add(teacher);
    }
    
    public void getAllTeachers() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getNome());
        }
    }
}
