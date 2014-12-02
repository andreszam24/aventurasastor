package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Andres on 29/11/2014.
 */
public class MenuActivity extends Activity implements View.OnClickListener {
    private Button btnPlay;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        btnPlay=(Button)findViewById(R.id.btnplay);
        btnPlay.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        startActivity (new Intent(getApplicationContext(), MapaActivity.class));
    }
}
