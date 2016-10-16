package id.sch.smktelkom_mlg.learn.intent01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String NAMA = "Nama = ";
    public static final String UMUR = "Umur = ";
    EditText etnama;
    EditText etumur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = (EditText) findViewById(R.id.editTextnama);
        etumur = (EditText) findViewById(R.id.editTextumur);

        setTitle("Input");


        findViewById(R.id.buttonhitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gohasil();

            }
        });


    }

    private void gohasil() {

        String nama = etnama.getText().toString();
        String umurstr = etumur.getText().toString();

        int umur = umurstr.
                isEmpty() ? 0 : Integer.parseInt(umurstr);

        Intent intent = new Intent(MainActivity.this, HasilActivity.class);
        intent.putExtra(NAMA, nama);
        intent.putExtra(UMUR, umur);

        startActivity(intent);
    }
}