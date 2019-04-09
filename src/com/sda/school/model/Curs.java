package com.sda.school.model;

import java.util.Arrays;

public class Curs implements Comparable<Curs> {

    private String name;
    private Profesor profesor;
    Student[] studenti = new Student[10];

    public Curs(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Student[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }

    @Override
    public String toString() {
        return "Curs " + name + ", profesor=" + profesor + ", studenti=" + Arrays.toString(studenti) + "]";
    }

    @Override
    public int compareTo(Curs o) {
        int nrStudenti = 0;
        for (int i = 0; i < 10; i++)
            if (studenti[i] != null)
                nrStudenti++;

        int nrStudenti2 = 0;
        for (int i = 0; i < 10; i++)
            if (o.getStudenti()[i] != null)
                nrStudenti2++;

        if (nrStudenti > nrStudenti2)
            return 1;
        if (nrStudenti < nrStudenti2)
            return -1;
        return 0;
    }

}

