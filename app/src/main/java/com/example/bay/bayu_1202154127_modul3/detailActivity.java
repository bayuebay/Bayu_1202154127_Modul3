package com.example.bay.bayu_1202154127_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detailActivity extends AppCompatActivity {
    private static int counts = 0;
    private Button plus, minus;
    private TextView value;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        String descs = intent.getStringExtra("descs");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.title);
        TextView textDesc = findViewById(R.id.desc);
        ImageView imageGambar = findViewById(R.id.imageview);

        textTitle.setText(title);
        textDesc.setText(descs);
        imageGambar.setImageResource(gambar);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.txt);
        battery = findViewById(R.id.battery);

        battery.setImageResource(R.drawable.img_battery);
        value.setText(Integer.toString(counts + 1) + "L");
    }

    // Untuk button plus jika diklik maka gambar akan berubah
    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    //Toast.makeText(this, "Air sudah penuh", Toast.LENGTH_LONG).show();
                    break;
            }
        }
        if (counts > 6){
            counts = 6;
            Toast.makeText(this, "Air sudah penuh", Toast.LENGTH_LONG).show();
        }
    }

    // Untuk button minus jika diklik maka gambar akan berubah
    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    //Toast.makeText(this, "Air mau habis", Toast.LENGTH_LONG).show();
                    break;
            }
        }
        if(counts<1){
            counts=1;
            Toast.makeText(this, "Air mau habis", Toast.LENGTH_LONG).show();
        }
    }
}
