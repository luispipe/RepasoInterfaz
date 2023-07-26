package com.example.apprepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capturo el boton de la interfaz o del layout
        Button categorys= findViewById(R.id.btCategory);
        //Capturo el evento o la acción del click del boton
        categorys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Definir navegación forzada por medio de intenciones
                Intent category= new Intent(getApplicationContext(), CategoryActivity.class);
                //Activamos la navegación
                startActivity(category);
            }
        });

    }
}