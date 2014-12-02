package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivilegedAction;

/**
 * Created by Andres on 02/12/2014.
 */
public class Escenario14 extends Activity implements View.OnClickListener {
    private Button btninfo;
    private Button btnobserv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escena14);
        btninfo=(Button)findViewById(R.id.btninfor14);
        btninfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Escenario15.class));

    }
}
