package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andres on 01/12/2014.
 */
public class Escenario1 extends Activity implements View.OnClickListener {
    private Button btnescenario1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escena1);
        btnescenario1=(Button)findViewById(R.id.btnplayescena1);
        btnescenario1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Escenario11.class));

    }
}
