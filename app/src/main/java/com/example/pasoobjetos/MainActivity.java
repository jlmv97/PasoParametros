package com.example.pasoobjetos;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable {

    Contactos cont;
    ArrayList<Contactos> agendados;
    private ListView vista;
    private TextView lol;
    private ArrayList<String> mvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agendados=new ArrayList<>();
        vista=(ListView)findViewById(R.id.Agenda);
        lol=(TextView)findViewById(R.id.textView);
    }

    public void registro(View view){
    Intent add= new Intent(this,Registro.class);
    startActivityForResult(add,0);
    }

    public void llenar(){
    vista=(ListView)findViewById(R.id.Agenda);
    mvp=new ArrayList<>();
    int paso=agendados.size();
    for(int i=0;i<paso;i++){
        mvp.add(agendados.get(i).getUsuario() + "\n" +agendados.get(i).getEmail());
    }
        ArrayAdapter<String>porfin=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mvp);
        vista.setAdapter(porfin);
        lol.setText("Numero de Contactos: "+agendados.get(0));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        cont=(Contactos) data.getSerializableExtra("Contactos");
        agendados.add(cont);
        llenar();
    }
}
