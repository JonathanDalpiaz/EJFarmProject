package ejfarm.ejfarm.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ejfarm.ejfarm.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plantioTempoReal(View v){

        Intent intent = new Intent(this, PlantioTempoReal.class);
        startActivity(intent);

    }

    public void plantiosAntigos(View v){

        Intent intent = new Intent(this, PlantiosAntigos.class);
        startActivity(intent);

    }

    public void exibirRelatorio(View v){

        Intent intent = new Intent(this, Relatorios.class);
        startActivity(intent);

    }

    private AlertDialog alerta;

    private void mensagemSobre() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("EJFarm");

        builder.setMessage("Projeto de Trabalho de Conclusão de Curso apresentado à Universidade do Oeste de Santa Catarina – Unoesc, Campus de São Miguel do Oeste como requisito parcial à obtenção do grau de Bacharel em Ciência da Computação. O aplicativo tem como objetivo fornecer ao agricultor as informações coletadas durante o plantio como quantia de sementes cultivadas e a metragem de área plantada.");

        builder.setPositiveButton("Fechar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        alerta = builder.create();
        alerta.show();
    }
    public void sobreAplicativo(View v){
        mensagemSobre();
    }
}
