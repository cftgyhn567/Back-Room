package com.example.backroom;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    private EditText inputEmail,inpurPassword;
    private SharedPreferences sp;
    private SharedPreferences.Editor ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        sp = getSharedPreferences("Account secret", MODE_PRIVATE);
        ed = sp.edit();

        String Email = sp.getString("Email", "123");
        Log.v("test", "email:"+Email);
        String password = sp.getString("password", "123");
        Log.v("test", "password:"+password);
        if(Email.equals("aaaa") && password.equals("0000")){
            ToNext();
        }else {
            inputEmail = findViewById(R.id.EmailAddress);
            inpurPassword = findViewById((R.id.password));
        }
    }

    public void SignIn(View view) {
        TextView errorMessage;

        String Email = inputEmail.getText().toString();
        String password = inpurPassword.getText().toString();
        if(!Email.isEmpty() && !password.isEmpty()) {

            /*
            Intent intent = new Intent(this, successSignIn.class);
            intent.putExtra("Email", Email);
            intent.putExtra("password", password);
            startActivity(intent);*/

            errorMessage = findViewById(R.id.errorMessage);
            if(Email.equals("aaaa") && password.equals("0000")){
                ed.putString("Email", Email);
                ed.putString("password", password);
                ed.commit();
                ToNext();
            }else{
                errorMessage.setText("帳號或密碼錯誤");
            }

        }else{
            Toast.makeText(this, "請輸入帳號密碼", Toast.LENGTH_SHORT).show();
        }
    }

    private void ToNext(){
        Intent toPlay = new Intent(this, playTheGame.class);
        startActivity(toPlay);
        finish();
    }
}