package com.example.backroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class playTheGame extends AppCompatActivity {
    private ImageView point;
    private TextView rank;
    private ProgressBar exc;
    private int excInt, rankInt=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_the_game);
        point = findViewById(R.id.point);
        rank = findViewById(R.id.rank);
        exc = findViewById(R.id.experience);
    }

    public void Click(View view) {
        if(excInt>=100){
            excInt = 0;
            rankInt++;
            rank.setText(String.format("  %03d", rankInt));
        }else{
            excInt += 10;
        }
        exc.setProgress(excInt);
    }
}