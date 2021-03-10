package com.example.backroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
    private EditText inputEmail,inpurPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        inputEmail = findViewById(R.id.EmailAddress);
        inpurPassword = findViewById((R.id.password));
    }

    public void SignIn(View view) {
        String Email = inputEmail.getText().toString();
        String password = inpurPassword.getText().toString();
        Intent intent = new Intent(this, successSignIn.class);
        intent.putExtra("Email", Email);
        intent.putExtra("password", password);
        startActivity(intent);
    }
}