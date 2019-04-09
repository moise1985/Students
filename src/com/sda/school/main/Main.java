package com.sda.school.main;

import java.util.Arrays;

import com.sda.school.model.Curs;
import com.sda.school.model.Departament;
import com.sda.school.model.Profesor;
import com.sda.school.model.Student;

public class Main {
    
    static Departament[] departamente = new Departament[3];
    static Profesor[] profesori = new Profesor[4];
    static Curs[] cursuri = new Curs[4];
    static Student[] studenti = new Student[10];

    public static void main(String[] args) {
        initializeData();
        
        populateDepartments();
        
        populateCursuri();
        
        populateNote();
        
        sortareStudenti();
        
        sortareProfesori();
        
        sortareCursuri();

    }
    
    
    public static void sortareDepartament() {
        
    }
    
    public static void sortareProfesori() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Student" + i);
            Student stud = studenti[i];
            
            for (int j = 0; j < 5; j++) {
                int nrCurs = stud.getNoteCurs()[j][0];
                int nota = stud.getNoteCurs()[j][1];
                
                if (nota > 0) {
                    Curs curs = cursuri[nrCurs];
                    curs.getProfesor().setNrNote(curs.getProfesor().getNrNote() + 1);
                    curs.getProfesor().setSumaNote(curs.getProfesor().getSumaNote() + nota);
                }
            }
        }
        
        for(int i=0; i<4; i++) 
            System.out.println(profesori[i]);
        
        Arrays.sort(profesori);
        
        System.out.println("Profesori sortati");
        
        for(int i=0; i<4; i++) 
            System.out.println(profesori[i]);
    }
    
    public static void sortareStudenti() {
        for(int i=0; i<10; i++) 
            System.out.println(studenti[i]);
        
        Arrays.sort(studenti);
        
        System.out.println("Studenti sortati");
        
        for(int i=0; i<10; i++) 
            System.out.println(studenti[i]);
    }
    
    public static void sortareCursuri() {
        for(int i=0; i<4; i++) 
            System.out.println(cursuri[i]);
        
        Arrays.sort(cursuri);
        
        System.out.println("Cursuri sortate");
        
        for(int i=0; i<4; i++) 
            System.out.println(cursuri[i]);
    }

    public static void populateNote() {
        for(int i=0; i<10; i++) 
            System.out.println(studenti[i]);
        
        studenti[0].getNoteCurs()[0][0] = 0;
        studenti[0].getNoteCurs()[0][1] = 8;
        studenti[0].getNoteCurs()[1][0] = 2;
        studenti[0].getNoteCurs()[1][1] = 6;
        
        studenti[1].getNoteCurs()[0][0] = 2;
        studenti[1].getNoteCurs()[0][1] = 10;
        studenti[1].getNoteCurs()[1][0] = 3;
        studenti[1].getNoteCurs()[1][1] = 9;
        studenti[1].getNoteCurs()[2][0] = 0;
        studenti[1].getNoteCurs()[2][1] = 9;
        
        studenti[2].getNoteCurs()[0][0] = 1;
        studenti[2].getNoteCurs()[0][1] = 4;
        
        for(int i=0; i<10; i++) 
            System.out.println(studenti[i]);
    }

    public static void populateCursuri() {
        for(int i=0; i<4; i++)
            System.out.println(cursuri[i]);
        
        cursuri[0].setProfesor(profesori[1]);
        cursuri[0].getStudenti()[0] = studenti[1];
        cursuri[0].getStudenti()[1] = studenti[7];
        
        
        cursuri[1].setProfesor(profesori[2]);
        cursuri[1].getStudenti()[0] = studenti[4];
        cursuri[1].getStudenti()[1] = studenti[5];
        cursuri[1].getStudenti()[2] = studenti[6];
        
        
        cursuri[2].setProfesor(profesori[0]);
        cursuri[2].getStudenti()[0] = studenti[8];
        cursuri[2].getStudenti()[1] = studenti[9];
        
        
        cursuri[3].setProfesor(profesori[3]);
        cursuri[3].getStudenti()[0] = studenti[2];
        cursuri[3].getStudenti()[1] = studenti[3];
        
        for(int i=0; i<4; i++)
            System.out.println(cursuri[i]);
    }

    public static void populateDepartments() {
        for(int i=0; i<3; i++)
            System.out.println(departamente[i]);
        
        departamente[0].getProfesors()[0] = profesori[0];
        departamente[0].getProfesors()[1] = profesori[1];
        
        departamente[1].getProfesors()[0] = profesori[3];
        
        departamente[2].getProfesors()[0] = profesori[1];
        departamente[2].getProfesors()[1] = profesori[2];
        
        
        for(int i=0; i<3; i++)
            System.out.println(departamente[i]);
    }
    
    private static void initializeData() {
        initializeCursuri();
        initializeDepartamente();
        initializeProfesori();
        initializeStudenti();
    }
    
    private static void initializeProfesori() {
        for(int i=0; i<4; i++) {
            profesori[i] = new Profesor("prenumeProf" + i, "numeProf" + i);
        }
    }
    
    private static void initializeStudenti() {
        for(int i=0; i<10; i++) {
            studenti[i] = new Student("prenumeStud" + i, "numeStud" + i);
        }
    }
    
    private static void initializeDepartamente() {
        for(int i=0; i<3; i++) {
            departamente[i] = new Departament("dep" + i);
        }
    }
    
    private static void initializeCursuri() {
    	
    	cursuri[0] = new Curs("Java Fundamentals");
    	cursuri[1] = new Curs("Java Advanced");
    	cursuri[2] = new Curs("PHP");
    	cursuri[3] = new Curs("MySQL");
    	
    	
     //   for(int i=0; i<4; i++) {
     //       cursuri[i] = new Curs("curs" + i);
     //   }
    }

}

