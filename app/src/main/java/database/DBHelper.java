package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 9/15/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_QUESTION="db_question";
    public static final String TABLE_NAME="question";
    public static final String KEY_ID="_id";
    public static final String KEY_QUESTION = "questions";
    public static final String KEY_A = "a";
    public static final String KEY_B = "b";
    public static final String KEY_C = "c";
    public static final String KEY_D = "d";
    public static final String KEY_KQUA="ketqua";


    public DBHelper(Context context) {
        super(context,DATABASE_QUESTION,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUESTION = "CREATE TABLE " + TABLE_NAME + " ("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_QUESTION + " TEXT,"
                + KEY_A + " TEXT,"
                + KEY_B + "TEXT,"
                + KEY_C + " TEXT"
                + KEY_D + "TEXT"
                + KEY_KQUA +"TEXT)";
        db.execSQL(CREATE_TABLE_QUESTION);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXITS"+TABLE_NAME);
        onCreate(db);
    }
}
