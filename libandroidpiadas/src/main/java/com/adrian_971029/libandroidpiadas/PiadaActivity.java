package com.adrian_971029.libandroidpiadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.adrian_971029.libjavapiadas.Piadas;

public class PiadaActivity extends AppCompatActivity {

    private TextView tvPiada;
    private Piadas mPiadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piada);

        tvPiada = (TextView) findViewById(R.id.tv_piada);

        mPiadas = new Piadas();

        tvPiada.setText(mPiadas.boaPiada1());

    }
}
