package br.com.etecia.menupersonagens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MewtwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mewtwo_layout);
    }
    public void abrirMenu(View view){
        Intent intentMenu = new Intent (this, MenuPersonagensActivity.class);
        startActivity(intentMenu);
    }
}
