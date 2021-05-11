package com.example.exe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txtnome1;
    EditText txtnome2;
    TextView resultado;

    public void executar(View view) {

        txtnome1 = findViewById(R.id.txtnome1);
        txtnome2 = findViewById(R.id.txtnome2);
        resultado = findViewById(R.id.r);

        String str1 = txtnome1.getText().toString();
        String str2 = txtnome2.getText().toString();
        String str3 = str1 + " " + str2;

        if(str1.isEmpty() || str2.isEmpty()){
            resultado.setText("Nome não inserido");

        }else{
            resultado.setText("Olá " + str3  );
        }
    }
}