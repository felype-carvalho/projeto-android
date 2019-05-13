package br.com.etecia.menupersonagens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPersonagensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_personagens_layout);


    }

    public void abrirPersonagem(View view) {
        switch (view.getId()) {
            case R.id.idArceus:
                Intent intent1 = new Intent(MenuPersonagensActivity.this, ArceusActivity.class);
                startActivity(intent1);
                break;
            case R.id.idCelebi:
                Intent intent2 = new Intent(MenuPersonagensActivity.this,CelebiActivity.class);
                startActivity(intent2);
                break;
            case R.id.idDarkai:
                Intent intent3 = new Intent(MenuPersonagensActivity.this,DarkraiActivity.class);
                startActivity(intent3);
                break;
            case R.id.idDeoxys:
                Intent intent4 = new Intent(MenuPersonagensActivity.this,DeoxysActivity.class);
                startActivity(intent4);
                break;
            case R.id.idDialga:
                Intent intent5 = new Intent(MenuPersonagensActivity.this,DialgaActivity.class);
                startActivity(intent5);
                break;
            case R.id.idGiratina:
                Intent intent6 = new Intent(MenuPersonagensActivity.this,GiratinaActivity.class);
                startActivity(intent6);
                break;
            case R.id.idGroudon:
                Intent intent7 = new Intent(MenuPersonagensActivity.this,GroudonActivity.class);
                startActivity(intent7);
                break;
            case R.id.idJirachi:
                Intent intent8 = new Intent(MenuPersonagensActivity.this,JirachiActivity.class);
                startActivity(intent8);
                break;
            case R.id.idKyogre:
                Intent intent9 = new Intent(MenuPersonagensActivity.this,KyogreActivity.class);
                startActivity(intent9);
                break;
            case R.id.idLatias:
                Intent intent10 = new Intent(MenuPersonagensActivity.this,LatiasActivity.class);
                startActivity(intent10);
                break;
            case R.id.idLatios:
                Intent intent11 = new Intent(MenuPersonagensActivity.this,LatiosActivity.class);
                startActivity(intent11);
                break;
            case R.id.idMew:
                Intent intent12 = new Intent(MenuPersonagensActivity.this,MewActivity.class);
                startActivity(intent12);
                break;
            case R.id.idMewtwo:
                Intent intent13 = new Intent(MenuPersonagensActivity.this,MewtwoActivity.class);
                startActivity(intent13);
                break;
            case R.id.idPalkia:
                Intent intent14 = new Intent(MenuPersonagensActivity.this,PalkiaActivity.class);
                startActivity(intent14);
                break;
            case R.id.idRayquaza:
                Intent intent15 = new Intent(MenuPersonagensActivity.this,RayquazaActivity.class);
                startActivity(intent15);
                break;
            case R.id.idRegice:
                Intent intent16 = new Intent(MenuPersonagensActivity.this,RegiceActivity.class);
                startActivity(intent16);
                break;
            case R.id.idRegigagas:
                Intent intent17 = new Intent(MenuPersonagensActivity.this,RegigigasActivity.class);
                startActivity(intent17);
                break;
            case R.id.idRegirock:
                Intent intent18 = new Intent(MenuPersonagensActivity.this,RegirockActivity.class);
                startActivity(intent18);
                break;
            case R.id.idRegistell:
                Intent intent19 = new Intent(MenuPersonagensActivity.this,RegisteelActivity.class);
                startActivity(intent19);
                break;
            case R.id.idShaymin:
                Intent intent20 = new Intent(MenuPersonagensActivity.this,ShayminActivity.class);
                startActivity(intent20);
                break;
        }
    }


}
