package com.example.andres.astor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Andres on 02/12/2014.
 */
public class Correcto extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correcto);
        Handler HANDLER = new Handler();
        HANDLER.postDelayed(new Runnable() {
            public void run() {
                finish();
                startActivity(new Intent(getApplicationContext(), MapaActivity.class));
                //startActivity (new Intent(getApplicationContext(), MyActivity.class));
                overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
            }
        }, 2000);
    }
}
