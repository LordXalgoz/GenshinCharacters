package com.example.genshincharacter;

import com.example.genshincharacter.models.tables.TableCharacters;

public class DbManager {
    private static DbManager instance = null;

    public static DbManager getInstance()
    {
        if(instance==null)
        {
            instance = new DbManager();
        }
        return instance;
    }

    private String URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=genshin";
    private String LOGIN = "postgres";
    private String PASSWORD = "P!ssword12345";

    public TableCharacters tableCharacters;

    public DbManager(){
        tableCharacters = new TableCharacters(URL, LOGIN, PASSWORD);
    }
}
