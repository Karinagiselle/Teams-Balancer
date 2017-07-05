package com.teamsbalancer.kari.teamsbalancer.activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.teamsbalancer.kari.teamsbalancer.R;
import com.teamsbalancer.kari.teamsbalancer.entidades.Jugador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Jugador> listaDeJugadores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAgregarJugador = (Button) findViewById(R.id.agregar_jugador);
        buttonAgregarJugador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarJugador(v);
            }
        });

        Button buttonGenerarEquipos = (Button) findViewById(R.id.generar_equipos);
        buttonGenerarEquipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generarEquipos(v);
            }
        });
    }

    public void agregarJugador(View view) {
        EditText nombreJugador = (EditText) findViewById(R.id.nombre_jugador);
        Jugador jugador = new Jugador();
        jugador.setNombre(nombreJugador.getText().toString());
        listaDeJugadores.add(jugador);

        TextView textView = new TextView(this);
        textView.setTextSize(10);
        textView.setText(nombreJugador.getText().toString());

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.activity_main);
        viewGroup.addView(textView);

        nombreJugador.getText().clear();
    }

    public void generarEquipos(View view) {
        Intent intent = new Intent(this, EquiposArmadosActivity.class);
        startActivity(intent);
    }
}
