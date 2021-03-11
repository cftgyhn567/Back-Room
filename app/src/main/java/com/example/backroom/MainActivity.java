package com.example.backroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private  TextView signInText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad", "onCreate");
    }

    @Override
    public void finish() {
        Toast.makeText(this, "滾啦～", Toast.LENGTH_SHORT).show();
        super.finish();
    }

    public void toSignIn(View view) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}