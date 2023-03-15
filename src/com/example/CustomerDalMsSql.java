package com.example;


import org.springframework.beans.factory.annotation.Value;



public class CustomerDalMsSql implements ICustomerDal{

    private String databaseName = "MsSql";
    @Value("${local.author}")
    private String author;
    @Value("${local.email}")
    private String email;
    @Value("${database.connection}")
    private String connectionUrl;

    public String getAuthor() {
        return author;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void add() {
        System.out.println(getDatabaseName() +" connection success. Connection Url: " + getConnectionUrl());
        System.out.println("Author: "+getAuthor()+" E-mail: "+getEmail());
    }
}
