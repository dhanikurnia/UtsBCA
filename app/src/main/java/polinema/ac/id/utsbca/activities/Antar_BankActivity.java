package polinema.ac.id.utsbca.activities;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import polinema.ac.id.utsbca.R;

public class Antar_BankActivity extends AppCompatActivity {
    EditText input_bank1;
    EditText input_rekening_tujuan1;
    EditText input_jum_uang;
    Button kirim;
    TextView text_output3;
    TextView text_output4;
    TextView text_output5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antar__bank);
        Toolbar toolbar = findViewById(R.id.toolbar);

        input_bank1 = findViewById(R.id.input_bank1);
        input_rekening_tujuan1 = findViewById(R.id.input_rekening_tujuan1);
        input_jum_uang = findViewById(R.id.input_jum_uang);
        kirim = findViewById(R.id.kirim);
        text_output3 = findViewById(R.id.text_output3);
        text_output4 = findViewById(R.id.text_output4);
        text_output5 = findViewById(R.id.text_output5);
        setSupportActionBar(toolbar);
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_output3.setText(input_bank1.getText().toString());
                text_output4.setText(input_rekening_tujuan1.getText().toString());
                text_output5.setText(input_jum_uang.getText().toString());
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getIntent().getExtras();
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if (bundle.getString("some") != null){
                Toast.makeText(getApplicationContext(),
                        "data:" +bundle.getString("some"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

}
