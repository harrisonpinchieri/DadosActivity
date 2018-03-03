package dadosactivity.cursoandroid.com.dadosactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = findViewById(R.id.textoId);

        //recupera os dados do activity main
        Bundle extra = getIntent().getExtras();

        if(extra !=  null){

            String textoPassado = extra.getString("nome");

            texto.setText(textoPassado);

        }


    }
}
