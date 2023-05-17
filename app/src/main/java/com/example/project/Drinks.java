package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Drinks {

    @SerializedName("ID")
    private String id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    @SerializedName("cost")
    private int dollars;

    Drinks (String name, String company, String category, int cost){ //is it correct w dollars n cost?
        this.name = name;
        this.company = company;
        this.category=category;
        this.dollars= cost;
    }

    public String getName(){
        return name;
    }

    public String getCompany() {return company;}

    public String getCategory() {return category;}

    public int getDollars() {return dollars;}

    @Override
    public String toString() {
        return name;
    }

}
