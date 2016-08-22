package com.example.xichen.databasetest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Xi Chen on 2016/8/22.
 */
public class MyDatabastHelper extends SQLiteOpenHelper {
    public static final String CREAT_BOOK = "create table Book ("
            + "id integer primary key autoincrement, "
            + "author text, "
            + "price real, "
            + "pages integer, "
            + "name text)";

    public static final String CREAT_CATAGORY = "create table Catagory ("
            + "id integer primary key autoincrement, "
            + "catagory_name text, "
            + "catagory_name integer)";

    private Context mContext;
    public MyDatabastHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAT_BOOK);
        db.execSQL(CREAT_CATAGORY);
//        Toast
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion){
            case 1:
                db.execSQL(CREAT_CATAGORY);
            default:

        }
    }
}
