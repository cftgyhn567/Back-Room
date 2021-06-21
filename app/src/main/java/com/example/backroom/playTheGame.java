package com.example.backroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class playTheGame extends AppCompatActivity {
    private ImageView point;
    private TextView rank;
    private ProgressBar exc;
    private int rankInt=1;
    private RelativeLayout body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_the_game);
        point = findViewById(R.id.point);
        rank = findViewById(R.id.rank);
        exc = findViewById(R.id.experience);
        body = findViewById(R.id.body);
    }

    public void Click(View view) {
        if(exc.getProgress()>=exc.getMax()){
            Log.v("text", "on click");
            exc.setProgress(0);
            rankInt++;
            Log.v("text", "on click on click");
            rank.setText(String.format("%03d", rankInt));
        }else{
            exc.setProgress(exc.getProgress()+10);
        }
    }
}