package com.example.project.spring_boot_project.Controller;

public class Course {
    private int id;
    private String cname;
    private String professor;

    
    public Course(int id, String cname, String professor) {
        this.id = id;
        this.cname = cname;
        this.professor = professor;
    }


    //setter methods
    public int getId() {
        return id;
    }
    public String getCname() {
        return cname;
    }
    public String getProfessor() {
        return professor;
    }
}
