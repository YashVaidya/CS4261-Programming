package com.example.yashvaidya.cs4261;

public class Team {

    private String name;
    private String description;
    private String id;
    private String members;

    public Team(){

    }

    public Team(String name, String description, String id, String members)
    {
        this.name = name;
        this.description = description;
        this.id = id;
        this.members = members;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMembers() {
        return members;
    }
}
