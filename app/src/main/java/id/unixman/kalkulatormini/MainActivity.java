package id.unixman.kalkulatormini;

import android.os.Bundle;
import android.renderscript.Double2;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double hasilakhir = 0.0;
    private String angka1 = "";
    private String angka2 = "";

    TextView hasil ;
    Button btTambah, btKurang;
    EditText edAngka1, edAngka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        edAngka1 = (EditText) findViewById(R.id.editAngka1);
        edAngka2 = (EditText) findViewById(R.id.editAngka2);
        btTambah = (Button) findViewById(R.id.TombolTambah);
        btKurang = (Button) findViewById(R.id.TombolKurang);
        hasil = (TextView) findViewById(R.id.Hasil);

    }

    public void klikTambah(View V){
        angka1 = edAngka1.getText().toString();
        angka2 = edAngka2.getText().toString();


            double angkaA = Double.parseDouble(angka1);
            double angkaB = Double.parseDouble(angka2);
            hasilakhir = angkaA + angkaB;
            String hasilstring = String.valueOf(hasilakhir);
            hasil.setText(hasilstring);

    }



    public void klikKurang(View W){
        angka1 = edAngka1.getText().toString();
        angka2 = edAngka2.getText().toString();


            double angkaA = Double.parseDouble(angka1);
            double angkaB = Double.parseDouble(angka2);

            hasilakhir = angkaA - angkaB;
            String hasilstring = String.valueOf(hasilakhir);
            hasil.setText(hasilstring);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
