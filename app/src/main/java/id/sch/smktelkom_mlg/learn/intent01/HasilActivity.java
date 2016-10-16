package id.sch.smktelkom_mlg.learn.intent01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Calendar;

public class HasilActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String nama = getIntent().getStringExtra(MainActivity.NAMA);
        int umur = getIntent().getIntExtra(MainActivity.UMUR, 0);

        int yearsnow = Calendar.getInstance().get(Calendar.YEAR);
        int tahunlahir = yearsnow - umur;

        setTitle("Hasil");

        TextView tvhasil = (TextView) findViewById(R.id.textview);
        tvhasil.setText(nama + " lahir pada tahun " + tahunlahir);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

