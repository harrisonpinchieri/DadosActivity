package dadosactivity.cursoandroid.com.dadosactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //envia dados para outra activity
                Intent intent = new Intent(MainActivity.this,SegundaActivity.class);

                intent.putExtra("nome","Harrison Pinchieri");

                startActivity(intent);



            }
        });
    }
}
