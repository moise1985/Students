package com.sda.school.model;

public class Profesor implements Comparable<Profesor>{

    private String firstName;
    private String lastName;
    private int sumaNote;
    private int nrNote;

    public Profesor(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSumaNote() {
        return sumaNote;
    }

    public void setSumaNote(int sumaNote) {
        this.sumaNote = sumaNote;
    }

    public int getNrNote() {
        return nrNote;
    }

    public void setNrNote(int nrNote) {
        this.nrNote = nrNote;
    }


    
    public String toString() {
        return "Profesor [firstName=" + firstName + ", lastName=" + lastName + ", sumaNote=" + sumaNote + ", nrNote=" + nrNote + "]";
    }

    
    public int compareTo(Profesor o) {
        if (sumaNote / nrNote > o.getSumaNote() / o.getNrNote())
            return 1;
        if (sumaNote / nrNote < o.getSumaNote() / o.getNrNote())
            return -1;
        return 0;
    }

}

