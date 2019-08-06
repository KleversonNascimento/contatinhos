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
    private final ArrayList<Sala> rooms;
    private final ArrayList<Aluno> students;
    private final ArrayList<Turma> turmas;
    
    public Universidade (String name) {
        this.name = name;
        this.teachers = new ArrayList();
        this.rooms = new ArrayList();
        this.students = new ArrayList();
        this.turmas = new ArrayList();
    }
    
    public void addTeacher(Professor teacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teacher.getNome().equals(teachers.get(i).getNome())) {
                return;
            }
        }
        this.teachers.add(teacher);
    }
    
    public void addRoom(Sala room) {
        for (int i = 0; i < rooms.size(); i++) {
            if (room.getSala().equals(rooms.get(i).getSala())) {
                return;
            }
        }
        this.rooms.add(room);
    }
    
    public void addStudent(Aluno student) {
        for (int i = 0; i < students.size(); i++) {
            if (student.getRA() == students.get(i).getRA()) {
                return;
            }
        }
        this.students.add(student);
    }
    
    public void getAllTeachers() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getNome());
        }
    }
    
    public Professor getTeacherByName(String name) {
        for (int i = 0; i < teachers.size(); i++) {
            if (name.equals(teachers.get(i).getNome())) {
                return teachers.get(i);
            }
        }
        Professor newTeacher = new Professor(name);
        this.teachers.add(newTeacher);
        return newTeacher;
    }
    
    public Sala getRoom(String room, String type) {
        for (int i = 0; i < rooms.size(); i++) {
            if (room.equals(rooms.get(i).getSala())) {
                return rooms.get(i);
            }
        }
        if (type.equals("Santo André")) {
            Sala newRoom = new SalaSA(room);
            this.rooms.add(newRoom);
            return newRoom;
        } 
        Sala newRoom = new SalaSBC(room);
        this.rooms.add(newRoom);
        return newRoom;
    }
    
    public void adicionarTurma(Turma turma){
	this.turmas.add(turma);
    }
    
    public void getRooms() {
        for (int i = 0; i < this.rooms.size(); i++) {
            System.out.println(this.rooms.get(i).getSala());
        }
    }
    
    public void getSizeStudents() {
        System.out.println("Neste quadrimestre há " + this.students.size() + " matriculas");
    }
    
    public void getTurmas() {
        for (int i = 0; i < this.turmas.size(); i++) {
            System.out.println(this.turmas.get(i).getNomeTurma());
        }
    }
    
    public void getTurmasByRA(String RA) {
        for (int i = 0; i < this.turmas.size(); i++) {
            for (int j = 0; j < this.turmas.get(i).getAlunos().length; j++) {
                if (this.turmas.get(i).getAlunos()[j].getRA().equals(RA)) {
                    System.out.println(this.turmas.get(i).getNomeTurma());
                    break;
                }
            }
        }
    }
    
    public void getRoomByName(String name) {
        for (int i = 0; i < this.teachers.size(); i++) {
            if (this.teachers.get(i).getNome().contains(name)) {
                System.out.println("Sala do(a) " + this.teachers.get(i).getNome() + " é a " + this.teachers.get(i).getSalaProfessor().getSala());
            }
        }
    }
}
