package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andres on 02/12/2014.
 */
public class Escenario15 extends Activity implements View.OnClickListener {
    private Button btnaccept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escena15);
        btnaccept=(Button)findViewById(R.id.btnaccept15);
        btnaccept.setOnClickListener(this);
    }

    @Override
        public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Correcto.class));

    }
}
