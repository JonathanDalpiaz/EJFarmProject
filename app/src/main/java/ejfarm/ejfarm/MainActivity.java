package ejfarm.ejfarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AndroidException;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaOpcoes = (ListView) findViewById(R.id.ListaFuncoes);

        ArrayList<String> opcoes = selecionarOpcao();

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opcoes);

    }

    private ArrayList<String> selecionarOpcao(){
        ArrayList<String> opcao = new ArrayList<>();
        opcao.add("Plantio Em Tempo Real");
        opcao.add("Outros Plantios");
        opcao.add("Sobre o Aplicativo");
        opcao.add("Sair");
        return opcao;
    }

}
