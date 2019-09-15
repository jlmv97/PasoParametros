package com.example.pasoobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private EditText t1,t2,t3,t4,t5;
    Contactos cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        t1=(EditText)findViewById(R.id.txtUsuario);
        t2=(EditText)findViewById((R.id.txtEmail));
        t3=(EditText)findViewById(R.id.txtTwitter);
        t4=(EditText)findViewById((R.id.txtTelefono));
        t5=(EditText)findViewById(R.id.txtFecha);
    }

    public void captura(View view){
        String tU=t1.getText().toString();
        String tE=t2.getText().toString();
        String tTw=t3.getText().toString();
        String tTe=t4.getText().toString();
        String tF=t5.getText().toString();
        cont = new Contactos(tU,tE,tTw,tTe,tF);

        Intent bendicion= new Intent(this,MainActivity.class);
        bendicion.putExtra("Contactos",cont);
        setResult(MainActivity.RESULT_OK,bendicion);
        finish();
    }

    public void cancelar(View view){
        Intent cancel= new Intent(this,MainActivity.class);
        startActivity(cancel);
        finish();
    }
}
