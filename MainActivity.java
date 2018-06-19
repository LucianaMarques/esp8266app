package com.example.barluc12.app_nodemcu;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnLed1, btnLed2, btnLed3, btnTodos;
    TextView txtLdr;
    EditText txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLed1 = (Button) findViewById(R.id.btnLed1);
        btnLed2 = (Button) findViewById(R.id.btnLed2);
        btnLed3 = (Button) findViewById(R.id.btnLed3);
        btnTodos = (Button) findViewById(R.id.btnTodos);

        txtLdr = (TextView) findViewById(R.id.txtLdr);

        txtResultado = (EditText) findViewById(R.id.txtResultado);

        btnLed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectivityManager connMgr = (ConnectivityManager)
                        getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

                if (networkInfo!=null && networkInfo.isConnected()){
                    String url = "";

                    new SolicitaDados().execute(url);
                } else {
                    Toast.makeText(MainActivity.this, "Nenhuma conexao foi detectada", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private class SolicitaDados extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... url) {

            return Conexao.getDados(url[0]);
        }

        @Override
        protected void onPostExecute(String resultado) {
            if (resultado!=null)
            {
                txtResultado.setText(resultado);

            } else {
                Toast.makeText(MainActivity.this, "Ocorreu um erro", Toast.LENGTH_LONG).show();
            }
        }
    }
}
