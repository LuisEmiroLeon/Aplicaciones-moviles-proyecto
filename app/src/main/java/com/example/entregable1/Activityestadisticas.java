package com.example.entregable1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activityestadisticas extends AppCompatActivity {

    private TableLayout tableLayout;
    private Button buttonClear;
    private ImageButton buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityestadisticas);

        tableLayout = findViewById(R.id.myTableLayout);
        buttonClear = findViewById(R.id.buttonClear);
        buttonBack = findViewById(R.id.buttonBack);

        loadData();

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearData();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra esta actividad y vuelve a la anterior
            }
        });
    }

    private void loadData() {
        SharedPreferences plasticPrefs = getSharedPreferences("PlasticData", MODE_PRIVATE);
        SharedPreferences glassPrefs = getSharedPreferences("GlassData", MODE_PRIVATE);
        SharedPreferences paperPrefs = getSharedPreferences("PaperData", MODE_PRIVATE);
        SharedPreferences metalPrefs = getSharedPreferences("MetalData", MODE_PRIVATE);

        int plasticIndex = plasticPrefs.getInt("index", 0);
        int glassIndex = glassPrefs.getInt("index", 0);
        int paperIndex = paperPrefs.getInt("index", 0);
        int metalIndex = metalPrefs.getInt("index", 0);

        for (int i = 0; i < plasticIndex; i++) {
            String month = plasticPrefs.getString("month_" + i, "");
            String material = "Plástico";
            String weight = plasticPrefs.getString("volume_" + i, "");
            String price = plasticPrefs.getString("price_" + i, "");

            TableRow tableRow = new TableRow(this);

            TextView textViewMonth = new TextView(this);
            textViewMonth.setText(month);
            textViewMonth.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMonth);

            TextView textViewMaterial = new TextView(this);
            textViewMaterial.setText(material);
            textViewMaterial.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMaterial);

            TextView textViewWeight = new TextView(this);
            textViewWeight.setText(weight);
            textViewWeight.setBackgroundResource(R.color.white);
            tableRow.addView(textViewWeight);

            TextView textViewPrice = new TextView(this);
            textViewPrice.setText(price);
            textViewPrice.setBackgroundResource(R.color.white);
            tableRow.addView(textViewPrice);

            tableLayout.addView(tableRow);
        }

        for (int i = 0; i < glassIndex; i++) {
            String month = glassPrefs.getString("month_" + i, "");
            String material = "Vidrio";
            String weight = glassPrefs.getString("volume_" + i, "");
            String price = glassPrefs.getString("price_" + i, "");

            TableRow tableRow = new TableRow(this);

            TextView textViewMonth = new TextView(this);
            textViewMonth.setText(month);
            textViewMonth.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMonth);

            TextView textViewMaterial = new TextView(this);
            textViewMaterial.setText(material);
            textViewMaterial.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMaterial);

            TextView textViewWeight = new TextView(this);
            textViewWeight.setText(weight);
            textViewWeight.setBackgroundResource(R.color.white);
            tableRow.addView(textViewWeight);

            TextView textViewPrice = new TextView(this);
            textViewPrice.setText(price);
            textViewPrice.setBackgroundResource(R.color.white);
            tableRow.addView(textViewPrice);

            tableLayout.addView(tableRow);
        }

        for (int i = 0; i < paperIndex; i++) {
            String month = paperPrefs.getString("month_" + i, "");
            String material = "Papel y Cartón";
            String weight = paperPrefs.getString("volume_" + i, "");
            String price = paperPrefs.getString("price_" + i, "");

            TableRow tableRow = new TableRow(this);

            TextView textViewMonth = new TextView(this);
            textViewMonth.setText(month);
            textViewMonth.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMonth);

            TextView textViewMaterial = new TextView(this);
            textViewMaterial.setText(material);
            textViewMaterial.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMaterial);

            TextView textViewWeight = new TextView(this);
            textViewWeight.setText(weight);
            textViewWeight.setBackgroundResource(R.color.white);
            tableRow.addView(textViewWeight);

            TextView textViewPrice = new TextView(this);
            textViewPrice.setText(price);
            textViewPrice.setBackgroundResource(R.color.white);
            tableRow.addView(textViewPrice);

            tableLayout.addView(tableRow);
        }
        for (int i = 0; i < metalIndex; i++) {
            String month = metalPrefs.getString("month_" + i, "");
            String material = "Metales";
            String weight = metalPrefs.getString("volume_" + i, "");
            String price = metalPrefs.getString("price_" + i, "");

            TableRow tableRow = new TableRow(this);

            TextView textViewMonth = new TextView(this);
            textViewMonth.setText(month);
            textViewMonth.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMonth);

            TextView textViewMaterial = new TextView(this);
            textViewMaterial.setText(material);
            textViewMaterial.setBackgroundResource(R.color.white);
            tableRow.addView(textViewMaterial);

            TextView textViewWeight = new TextView(this);
            textViewWeight.setText(weight);
            textViewWeight.setBackgroundResource(R.color.white);
            tableRow.addView(textViewWeight);

            TextView textViewPrice = new TextView(this);
            textViewPrice.setText(price);
            textViewPrice.setBackgroundResource(R.color.white);
            tableRow.addView(textViewPrice);

            tableLayout.addView(tableRow);
        }
    }

    private void clearData() {
        SharedPreferences plasticPrefs = getSharedPreferences("PlasticData", MODE_PRIVATE);
        SharedPreferences glassPrefs = getSharedPreferences("GlassData", MODE_PRIVATE);
        SharedPreferences paperPrefs = getSharedPreferences("PaperData", MODE_PRIVATE);
        SharedPreferences metalPrefs = getSharedPreferences("MetalData", MODE_PRIVATE);

        SharedPreferences.Editor plasticEditor = plasticPrefs.edit();
        SharedPreferences.Editor glassEditor = glassPrefs.edit();
        SharedPreferences.Editor paperEditor = paperPrefs.edit();
        SharedPreferences.Editor metalEditor = metalPrefs.edit();

        plasticEditor.clear();
        glassEditor.clear();
        paperEditor.clear();
        metalEditor.clear();

        plasticEditor.apply();
        glassEditor.apply();
        paperEditor.apply();
        metalEditor.apply();

        tableLayout.removeAllViews();

        Toast.makeText(this, "Datos borrados", Toast.LENGTH_SHORT).show();
    }
}