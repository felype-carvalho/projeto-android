package br.com.etecia.appempresaabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuprincipal_layout);

        back = (Button)findViewById(R.id.btnVoltar);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarLogin();
            }
        });
    }

    public void voltarLogin(){
        Intent intent = new Intent(MenuPrincipalActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}


