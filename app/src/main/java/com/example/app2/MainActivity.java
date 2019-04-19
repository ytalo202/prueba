package com.example.app2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText javaUser, javaPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        javaUser = findViewById(R.id.edUser);
        javaPassword = findViewById(R.id.edPassword);
    }

    public String UserName() {
        String name = javaUser.getText().toString();
        return name;
    }

    public String UserPassword() {
        String password = javaPassword.getText().toString();
        return password;
    }

    public void Login(View view) {
        if (UserName().equals("lol@gmail.com") && UserPassword().equals("123")) {
            Intent i = new Intent(this,CaluladoraActivity.class);
            startActivity(i);

            Toast.makeText(this, "Bienvenido Ytalo", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
        }

    }
}
