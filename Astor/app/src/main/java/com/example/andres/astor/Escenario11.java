package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andres on 01/12/2014.
 */
public class Escenario11 extends Activity implements View.OnClickListener {
    private Button btnplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escena11);
        btnplay=(Button)findViewById(R.id.btnplayescena11);
        btnplay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Escenario12.class));

    }
}
