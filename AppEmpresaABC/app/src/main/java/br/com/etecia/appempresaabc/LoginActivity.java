package br.com.etecia.appempresaabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtUser, txtPassword;
    Button sairSistema, entrarSistema;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        txtUser = (EditText)findViewById(R.id.edtUser);
        txtPassword = (EditText)findViewById(R.id.edtPassword);
        entrarSistema = (Button)findViewById(R.id.btnSignIn);
        sairSistema = (Button)findViewById(R.id.btnSignOut);

        entrarSistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginApp();
            }
        });

        sairSistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SairSistema();
            }
        });
    }

    public void SairSistema(){
        finish();
    }


    public void loginApp() {
        String user = txtUser.getText().toString();
        String password = txtPassword.getText().toString();
        if (user.equals("etecia")&& password.equals("etecia")) {
            Toast.makeText(getApplicationContext(),"Welcome!!!",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, MenuPrincipalActivity.class);
            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(),"Connection failure, check your username or password.",Toast.LENGTH_SHORT).show();
        }
    }
}
