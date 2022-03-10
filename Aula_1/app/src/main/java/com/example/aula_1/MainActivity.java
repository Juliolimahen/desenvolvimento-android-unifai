package com.example.aula_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtTexto;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnOkClick(View v){
        txtTexto.setText("Clicou");
        Toast.makeText(this, "Mensagem Curta", Toast.LENGTH_SHORT).show();
    }
    private void bootStrap(){
        txtTexto = findViewById(R.id.txtTexto);
        btnOK = findViewById(R.id.btnOK);
        txtTexto.setText("Julio");
    }
}