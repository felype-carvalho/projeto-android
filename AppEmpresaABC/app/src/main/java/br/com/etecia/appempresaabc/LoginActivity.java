package br.com.etecia.appempresaabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtUser, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        txtUser = (EditText)findViewById(R.id.edtUser);
        txtPassword = (EditText)findViewById(R.id.edtPassword);
    }

    public void closeApp(View view) {
        finish();
    }

    public void loginApp(View view) {
        String user = txtUser.getText().toString();
        String password = txtPassword.getText().toString();
        if (user.equals("etecia")&& password.equals("etecia")) {
            Toast.makeText(getApplicationContext(),"Welcome!!!",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"Connection failure, check your username or password.",Toast.LENGTH_SHORT).show();
        }
    }
}
