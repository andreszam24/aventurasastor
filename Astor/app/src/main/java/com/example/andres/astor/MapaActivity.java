package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andres on 01/12/2014.
 */
public class MapaActivity extends Activity implements View.OnClickListener {
    private Button btnp1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa);
        btnp1=(Button)findViewById(R.id.btnp1);
        btnp1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        startActivity (new Intent(getApplicationContext(), Escenario1.class));
    }
}
