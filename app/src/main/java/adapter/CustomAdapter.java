package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import database.Questions;
import luanz.nguyenthanhluan.myapplication.R;

/**
 * Created by Admin on 9/17/2016.
 */
public class CustomAdapter extends ArrayAdapter<Questions> {
    TextView tvID, tvQuestion, tvA, tvB, tvD, tvC;
    public CustomAdapter(Context context, ArrayList<Questions> objects) {
        super(context,0 , objects);
    }



    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.iteam_list,parent,false);
            tvID = (TextView)convertView.findViewById(R.id._id);
            tvQuestion = (TextView)convertView.findViewById(R.id.tvquestion);
            tvA = (TextView)convertView.findViewById(R.id.tvA);
            tvB = (TextView)convertView.findViewById(R.id.tvB);
            tvC = (TextView)convertView.findViewById(R.id.tvC);
            tvD = (TextView)convertView.findViewById(R.id.tvD);

            Questions q = getItem(position);
            if(q == null){
                tvID.setText(q.getQuestion_id().toString());
                tvQuestion.setText(q.getQuestion().toString());
                tvA.setText(q.getA().toString());
                tvB.setText(q.getB().toString());
                tvC.setText(q.getC().toString());
                tvD.setText(q.getD().toString());
            }
        }

        return convertView;
    }
}
