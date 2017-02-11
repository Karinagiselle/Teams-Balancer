package com.teamsbalancer.kari.teamsbalancer.activities;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.teamsbalancer.kari.teamsbalancer.R;
import com.teamsbalancer.kari.teamsbalancer.entidades.Jugador;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregarJugador(View view) {
        EditText nombreJugador = (EditText) findViewById(R.id.nombre_jugador);

        TextView textView = new TextView(this);
        textView.setTextSize(10);
        textView.setText(nombreJugador.getText().toString());

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.activity_main);
        viewGroup.addView(textView);

        nombreJugador.getText().clear();
    }

}
