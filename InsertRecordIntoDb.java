package com.company;

import java.sql.*;

public class InsertRecordIntoDb {
    public static void main(String[] args) {
        try {

            Connection conn = null;
            Statement stmt = null;

            conn = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful!");

            stmt = conn.createStatement(); // Create Statement

            String query0 = "INSERT INTO MyMovies values ('KGF:Chapter 2','Yash','Srinidhi',2022,'Prashanth Neel');";
            stmt.executeUpdate(query0); // Create Query-0

            String query1 = "INSERT INTO MyMovies values ('MS Dhoni','Sushant','Kiara',2016,'Neeraj Pandey');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO MyMovies values ('Top Gun:Maverick','Tom Cruise','Jennifer',2022,'Joseph');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO MyMovies values ('Pelli Choopulu','Vijay','Ritu',2016,'Tharun');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO MyMovies values ('Jersey','Nani','Shradda',2018,'Gowtham');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO MyMovies values ('Bhool Bhulaiyaa 2','Kartik','Kiara',2022,'Anees');";
            stmt.executeUpdate(query5); // Create Query-5
            stmt.close();

            conn.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records Insertion Successful!");
    }
}