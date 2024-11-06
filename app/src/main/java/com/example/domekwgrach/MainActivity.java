package com.example.domekwgrach;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int liczbaPolubien = 0;
    private TextView textViewliczbaPolubien;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewliczbaPolubien = findViewById(R.id.liczbaPolubien);

        Button buttonPolub = findViewById(R.id.buttonPolub);
        Button buttonUsun = findViewById(R.id.buttonUsun);

        buttonPolub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczbaPolubien++;
                aktualizujLicznik();
            }
        });
        buttonUsun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (liczbaPolubien > 0) {
                    liczbaPolubien--;
                }
                aktualizujLicznik();
            }
        });
    }

    private void aktualizujLicznik() {
        String tekst = liczbaPolubien + " polubień";
        textViewliczbaPolubien.setText(tekst);
    }
}

