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

public class Antar_RekeningActivity extends AppCompatActivity {
    EditText input_name;
    EditText input_bank;
    EditText input_rekening_tujuan;
    Button submit;
    TextView text_output;
    TextView text_output1;
    TextView text_output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antar__rekening);
        Toolbar toolbar = findViewById(R.id.toolbar);
        input_name = findViewById(R.id.input_name);
        input_bank = findViewById(R.id.input_bank);
        input_rekening_tujuan = findViewById(R.id.input_rekening_tujuan);
        submit = findViewById(R.id.submit);
        text_output = findViewById(R.id.text_output);
        text_output1 = findViewById(R.id.text_output1);
        text_output2 = findViewById(R.id.text_output2);
        setSupportActionBar(toolbar);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_output.setText(input_name.getText().toString());
                text_output1.setText(input_bank.getText().toString());
                text_output2.setText(input_rekening_tujuan.getText().toString());
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
