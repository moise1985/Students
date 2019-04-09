package com.sda.school.model;



public class Student implements Comparable<Student>{

    private String firstName;
    private String lastName;
    private int[][] noteCurs = new int[5][5];

    public Student(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
        super();
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

    public int[][] getNoteCurs() {
        return noteCurs;
    }

    public void setNoteCurs(int[][] noteCurs) {
        this.noteCurs = noteCurs;
    }


    public String toString() {
        String display = "Student [firstName=" + firstName + ", lastName=" + lastName + ", noteCurs=";
        for(int i=0; i<5; i++) 
            display = display + noteCurs[i][0] + "-" + noteCurs[i][1] + "; ";
        return display;
    }

 
    public int compareTo(Student o) {
        float medie = 0;
        int nrNote = 0;
        for (int i = 0; i < 5; i++)
            if (noteCurs[i][1] > 0) {
                medie = medie + noteCurs[i][1];
                nrNote++;
            }
        medie = medie/nrNote;
        
        float medie2 = 0;
        int nrNote2 = 0;
        for (int i = 0; i < 5; i++)
            if (o.getNoteCurs()[i][1] > 0) {
                medie2 = medie2 + o.getNoteCurs()[i][1];
                nrNote2++;
            }
        medie2 = medie2/nrNote2;
        
        if(medie > medie2) 
            return 1;
        if(medie < medie2)
            return -1;
        
        return 0;
    }

}
