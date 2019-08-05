/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import universidade.*;

/**
 *
 * @author kleverson
 */
public class ReadFiles {

    private static String ENROLLMENTS = "";
    private final static String studentsList = "lista_ra";
    private final static String theorySchedules = "teoria";
    private static final String theoryTeacher = "docenteTeoria";
    private final static String practiceSchedules = "pratica";
    private static final String practiceTeacher = "docentePratica";
       
    public static void readClasses(Universidade university)  {
        ENROLLMENTS = convertFileToString("res/matriculas_2019_2.json");
        
        JSONParser parser = new JSONParser();
        JSONArray arrayEnrollments;
        
        try {
            Object obj = parser.parse(ENROLLMENTS);
            arrayEnrollments = (JSONArray) obj;
            
            System.out.println(arrayEnrollments.size() + " turmas encontradas");
            
            for (int i = 0; i < arrayEnrollments.size(); i++) {
                System.out.println("Preenchendo infos da " + i + "º turma");
                JSONObject newClass = (JSONObject) arrayEnrollments.get(i);
                JSONArray students = (JSONArray) newClass.get(studentsList);
                Aluno[] classStudents = new Aluno[students.size()]; 
                
                for (int j = 0; j < students.size(); j++) {
                    Aluno student = new Aluno(students.get(j).toString());
                    university.addStudent(student);
                    classStudents[j] = student;
                }
                
                if (!((String) newClass.get(theoryTeacher)).equals("0") && !((String) newClass.get(theorySchedules)).equals("0")) {
                    Professor teacher = university.getTeacherByName(theoryTeacher);
                    int lengthSchedules = newClass.get(theorySchedules).toString().split(",").length / 3;
                    Horario[] schedules = new Horario[lengthSchedules];
                    for (int j = 0; j < lengthSchedules; j++) {
                        String[] fields = newClass.get(theorySchedules).toString().split(",");
                        String day = fields[3 * j].split(" das ")[0];
                        int startTime = Integer.parseInt(fields[3 * j].split(" das ")[1].split(" às ")[0].replace(":", ""));
                        int endTime = Integer.parseInt(fields[3 * j].split(" das ")[1].split(" às ")[1].replace(":", ""));
                        String frequently = fields[(3 * j) + 2];
                        Sala room;
                        if (newClass.get("classe").toString().contains("Santo André")) {
                            room = university.getRoom(fields[(3 * j) + 1], "Santo André");
                        } else {
                            room = university.getRoom(fields[(3 * j) + 1], "Santo André");
                        }
                        schedules[j] = new Horario(day, startTime, endTime, frequently, room);
                    }
                    Turma newTurma = new Turma(newClass.get("classe").toString(), classStudents, teacher, schedules);
                    teacher.adicionarTurma(newTurma);
                    university.adicionarTurma(newTurma);
                }
                
                if (!((String) newClass.get(practiceTeacher)).equals("0") && !((String) newClass.get(practiceSchedules)).equals("0")) {
                    Professor teacher = university.getTeacherByName(practiceTeacher);
                    int lengthSchedules = newClass.get(practiceSchedules).toString().split(",").length / 3;
                    Horario[] schedules = new Horario[lengthSchedules];
                    for (int j = 0; j < lengthSchedules; j++) {
                        String[] fields = newClass.get(practiceSchedules).toString().split(",");
                        String day = fields[3 * j].split(" das ")[0];
                        int startTime = Integer.parseInt(fields[3 * j].split(" das ")[1].split(" às ")[0].replace(":", ""));
                        int endTime = Integer.parseInt(fields[3 * j].split(" das ")[1].split(" às ")[1].replace(":", ""));
                        String frequently = fields[(3 * j) + 2];
                        Sala room;
                        if (newClass.get("classe").toString().contains("Santo André")) {
                            room = university.getRoom(fields[(3 * j) + 1], "Santo André");
                        } else {
                            room = university.getRoom(fields[(3 * j) + 1], "Santo André");
                        }
                        schedules[j] = new Horario(day, startTime, endTime, frequently, room);
                    }
                    Turma newTurma = new Turma(newClass.get("classe").toString(), classStudents, teacher, schedules);
                    teacher.adicionarTurma(newTurma);
                    university.adicionarTurma(newTurma);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private static String convertFileToString(String file){
        
        StringBuilder sb = new StringBuilder();
        try {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
                char[] buf = new char[1024];
                int len;
                while ((len  = in.read(buf, 0, buf.length)) > 0) {
                    sb.append(buf, 0, len);
                }
            }
        } catch (IOException e) {
        }
        return sb.toString();
    }
}
