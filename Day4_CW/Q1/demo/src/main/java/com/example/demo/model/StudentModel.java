package com.example.demo.model;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class StudentModel {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int regno;
    private String studentname;
    private String studentmarks;
    private String app;
    private String meetingtime;

    StudentModel(){
        
    }


    public StudentModel(int regno, String studentname, String studentmarks, String app, String meetingtime) {
        this.regno = regno;
        this.studentname = studentname;
        this.studentmarks = studentmarks;
        this.app = app;
        this.meetingtime = meetingtime;
    }
    public String getapp()
    {
        return app;
    }
    public void setapp(String app)
    {
        this.app=app;
    }
    public String gettime()
    {
        return meetingtime;
    }
    public void settime(String meetingtime)
    {
        this.meetingtime=meetingtime;
    }
   
    
    
    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentmarks() {
        return studentmarks;
    }

    public void setStudentmarks(String studentmarks) {
        this.studentmarks = studentmarks;
    }
   

}