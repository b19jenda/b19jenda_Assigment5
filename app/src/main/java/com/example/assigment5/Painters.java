package com.example.assigment5;

public class Painters {
    private String name;
    private String location;
    private String category;
    private int birthdate;
    private int deathdate;

    public Painters(String n, String l, String c, int b, int d){
        name=n;
        location=l;
        category=c;
        birthdate=b;
        deathdate=d;
    }
    public String info(){
        String info=new String();
        info+=name+" kommer från "+location;
        return info;
    }
}

