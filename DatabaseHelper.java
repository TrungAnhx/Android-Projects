package com.example.quanlisinhvien;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "lop.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_LOP = "tbllop";
    public static final String COLUMN_MALOP = "malop";
    public static final String COLUMN_TENLOP = "tenlop";
    public static final String COLUMN_SISO = "siso";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_LOP + " (" +
                    COLUMN_MALOP + " TEXT PRIMARY KEY, " +
                    COLUMN_TENLOP + " TEXT, " +
                    COLUMN_SISO + " INTEGER " +
                    ");";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LOP);
        onCreate(db);
    }
}
