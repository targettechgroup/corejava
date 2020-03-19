package com.techtarget.corejava;

public class DBConnection {

    private static DBConnection dbConnection = null;

    private DBConnection() {
    }

    public static DBConnection getDBConnection() {
        if(dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
