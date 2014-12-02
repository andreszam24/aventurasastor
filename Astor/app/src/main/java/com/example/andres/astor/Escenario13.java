package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andres on 02/12/2014.
 */
public class Escenario13 extends Activity implements View.OnClickListener {
    private Button btnaccept;
    private Button btncancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escena13);
        btnaccept=(Button)findViewById(R.id.btnaccept13);
        btncancel=(Button)findViewById(R.id.btncancel13);
        btnaccept.setOnClickListener(this);
        btncancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==btnaccept.getId())
        {
            startActivity(new Intent(getApplicationContext(),Escenario14.class));
        }
        else{
            startActivity(new Intent(getApplicationContext(),MapaActivity.class));

        }
    }
}
