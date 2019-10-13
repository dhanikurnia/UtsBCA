package polinema.ac.id.utsbca.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import polinema.ac.id.utsbca.R;


public class Antar_RekeningFragment extends AppCompatActivity {

    EditText input_name;
    TextView text_output;

    public void handleGetData(View view) {
        text_output.setText(input_name.getText().toString());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_antar__rekening);
        input_name = input_name.findViewById(R.id.input_name);
        text_output = text_output.findViewById(R.id.text_output);
    }

}
