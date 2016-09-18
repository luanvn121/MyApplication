package luanz.nguyenthanhluan.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import adapter.CustomAdapter;
import database.QuestionModify;
import database.Questions;

public class MainActivity extends AppCompatActivity {
    ListView lvQuestion;
    ArrayList<Questions> arrQuestion = new ArrayList<Questions>();
    CustomAdapter customAdapter;
    QuestionModify questionModify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrQuestion();
        lvQuestion = (ListView)findViewById(R.id.lvquestion);
        questionModify = new QuestionModify(this);
        questionModify.insert(arrQuestion);
        display();


    }
    public void display(){
        lvQuestion.setAdapter(customAdapter);
    }

    public void arrQuestion(){
        arrQuestion.add(new Questions("1","Con bò có mấy cái chân","A: 1","B: 2","C: 3","D: 4"));
        arrQuestion.add(new Questions("2","Con bò ăn thức ăn gì","A: cỏ","B: thịt","C: nước biển","D: đá"));
    }
}
