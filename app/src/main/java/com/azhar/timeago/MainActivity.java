package com.azhar.timeago;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String strDetik, strMenit, strJam, strHari, strMinggu, strBulan, strTahun;
    TextView tvTimeAgo;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set tanggal & waktu
        strDetik = Utils.covertTimeAgo("29-05-2023 15:57");
        strMenit = Utils.covertTimeAgo("29-05-2023 15:15");
        strJam = Utils.covertTimeAgo("29-05-2023 12:46");
        strHari = Utils.covertTimeAgo("25-05-2023 15:46");
        strMinggu = Utils.covertTimeAgo("29-04-2023 15:46");
        strBulan = Utils.covertTimeAgo("29-03-2023 15:46");
        strTahun = Utils.covertTimeAgo("29-03-2022 15:46");

        tvTimeAgo = findViewById(R.id.tvTimeAgo);

        tvTimeAgo.setText(strDetik + "\n" + strMenit + "\n" +
                strJam + "\n" + strHari + "\n" +
                strMinggu + "\n" + strBulan + "\n" + strTahun);
    }

}