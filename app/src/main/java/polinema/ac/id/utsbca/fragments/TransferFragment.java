package polinema.ac.id.utsbca.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import polinema.ac.id.utsbca.R;


public class TransferFragment extends Fragment{

    public TransferFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_payment, container, false);

        Button button_antar_rekening = (Button) view.findViewById(R.id.button_antar_rekening);
        button_antar_rekening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(),Antar_RekeningActivity.class );
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
        return view;

    }

}
