package br.com.etecia.appmenutwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= findViewById(R.id.idToolbar);

        getSupportActionBar().setTitle("AAA");
        getSupportActionBar().setIcon(R.drawable.ic_arrow_back_dp);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mShare:
                Toast.makeText(getApplicationContext(), "Shared", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSettings:
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mFavorite:
                Toast.makeText(getApplicationContext(), "Favorite", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mInfo:
                Toast.makeText(getApplicationContext(), "Info", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSearch:
                Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSave:
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onContextItemSelected(item);
    }
}


