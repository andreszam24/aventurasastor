package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andres on 02/12/2014.
 */
public class Escenario12 extends Activity implements View.OnClickListener {
    private Button btnplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escena12);
        btnplay=(Button)findViewById(R.id.btnplayescena12);
        btnplay.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Escenario13.class));
    }
}
