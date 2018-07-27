package com.adrian_971029.libandroidpiadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.adrian_971029.libjavapiadas.Piadas;

public class PiadaActivity extends AppCompatActivity {

    private static final String PIADA = "piada";

    private TextView tvPiada;
    private TextView tvPiadaApi;
    private Piadas mPiadas;
    private String piada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piada);

        tvPiada = (TextView) findViewById(R.id.tv_piada);
        tvPiadaApi = (TextView) findViewById(R.id.tv_piada_api);

        mPiadas = new Piadas();

        if (getIntent().getExtras().getString(PIADA) != null) {
            piada = getIntent().getExtras().getString(PIADA);
        }

        tvPiada.setText(mPiadas.ruimPiada1());
        tvPiadaApi.setText(piada);

    }
}
