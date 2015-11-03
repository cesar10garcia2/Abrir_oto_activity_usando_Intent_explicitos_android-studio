package com.codigojavalibre.cesargarcia.abrirotoactivityusandointentexplicitos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnA,btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA=(Button)findViewById(R.id.btnMain1);
        btnB=(Button)findViewById(R.id.btnMain2);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;//Declaro el Intent

        switch (v.getId()){//Obtengo el ID del boton precionado

            case R.id.btnMain1://Si el ID es btnMain1

                //Instanciamos el Intent dandole:
                // el contexto y la clase a la cual nos deseamos dirigir
                explicit_intent = new Intent(this,VentanaA_Activity.class);

                //lo iniciamos pasandole la intencion
                startActivity(explicit_intent);
                break;

            case R.id.btnMain2://Si el ID es btnMain2
                explicit_intent = new Intent(this, VentanaB_Activity.class);
                startActivity(explicit_intent);
                break;
        }
    }
}
