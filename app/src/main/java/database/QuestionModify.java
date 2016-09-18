package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Admin on 9/15/2016.
 */
public class QuestionModify {
    private DBHelper dbHelper;

    public QuestionModify(Context context) {
        dbHelper = new DBHelper(context);
    }

    //thêm
    public void insert(ArrayList<Questions> questions) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();


        values.put(DBHelper.KEY_QUESTION, questions.toString());
        values.put(DBHelper.KEY_A, questions.toString());
        values.put(DBHelper.KEY_B, questions.toString());
        values.put(DBHelper.KEY_C, questions.toString());
        values.put(DBHelper.KEY_D, questions.toString());
        values.put(DBHelper.KEY_KQUA, questions.toString());

        db.insert(DBHelper.TABLE_NAME, null, values);
        db.close();

    }

    //lấy tất cả dữ liệu trong bảng
    public Cursor getStudentList() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(DBHelper.TABLE_NAME, new String[]{DBHelper.KEY_ID, DBHelper.KEY_QUESTION, DBHelper.KEY_A, DBHelper.KEY_B, DBHelper.KEY_C, DBHelper.KEY_D, DBHelper.KEY_KQUA}, null, null, null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();

        }
        return cursor;
    }

    //lấy 1 dữ liệu trong bảng
    public Questions fetchStudentByID(int student_id) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.query(DBHelper.KEY_QUESTION, new String[]{
                DBHelper.KEY_ID, DBHelper.KEY_QUESTION, DBHelper.KEY_A, DBHelper.KEY_B, DBHelper.KEY_C, DBHelper.KEY_D, DBHelper.KEY_KQUA}, DBHelper.KEY_ID + "=?", new String[]{String.valueOf(student_id)}, null, null, null);
        if (cursor != null) {

            cursor.moveToFirst();

        }
        return new Questions(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4),cursor.getString(5),cursor.getString(6));
    }

}
