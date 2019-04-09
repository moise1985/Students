package com.sda.school.model;

import java.util.Arrays;

public class Departament {

    private String departmentName;
    private Profesor[] profesors = new Profesor[3];
   
    
    public Departament(String departmentName) {
        super();
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Profesor[] getProfesors() {
        return profesors;
    }

    public void setProfesors(Profesor[] profesors) {
        this.profesors = profesors;
    }

  
    public String toString() {
        return "Departament [departmentName=" + departmentName + ", profesors=" + Arrays.toString(profesors) + "]";
    }

}

