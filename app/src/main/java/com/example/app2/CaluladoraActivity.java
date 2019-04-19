package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CaluladoraActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caluladora);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        txtResult = findViewById(R.id.txtResult);
    }

    public int Num1() {
        int num = Integer.parseInt(num1.getText().toString());
        return num;
    }

    public int Num2() {
        int num = Integer.parseInt(num2.getText().toString());
        return num;
    }

    public boolean validarValores() {
        if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void Suma(View view) {
        if (validarValores()){
            Toast.makeText(this, "Suma exitosa", Toast.LENGTH_SHORT).show();
            int resultado =Num1() +Num2();
            txtResult.setText(String.valueOf(resultado));
        } else{
            Toast.makeText(this, "LLeno los datos", Toast.LENGTH_SHORT).show();

        }
    }
}
