package com.example.backroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class successSignIn extends AppCompatActivity {
    TextView printData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_sign_in);

        printData = findViewById(R.id.print);

        Intent intent = getIntent();
        String Email = intent.getStringExtra("Email");
        String password = intent.getStringExtra("password");
        Log.v("asdf", Email);
        Log.v("asdf", password);
        if(Email.equals("aaaa") && password.equals("0000")){
            printData.setText("登入成功");
            Intent toPlay = new Intent(this, playTheGame.class);
            startActivity(toPlay);
            finish();
        }else{
            printData.setText("登入失敗");
        }
    }
}