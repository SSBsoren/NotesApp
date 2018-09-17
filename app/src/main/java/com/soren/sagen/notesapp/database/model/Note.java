package com.soren.sagen.notesapp.database.model;

public class Note
{
    public static final String TABLE_NAME = "notes";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOTE = "note";
    public static final String COLUMN_TIMESTAMP = "timestamp";


    private int  id;
    private String note;
    private String timestamp;

    //Create table SQL query

    public static final String CREATE_TABLE =
            "CREATE TABLE" + TABLE_NAME + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COLUMN_NOTE + "TEXT ,"
                    + COLUMN_TIMESTAMP +" DATETIME DEFAULT CURRENT_TIMESTAMP"
                    +")";


    public Note(){

    }

    public Note(int anInt, String string, String string1) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public static String getCreateTable() {
        return CREATE_TABLE;
    }
}
