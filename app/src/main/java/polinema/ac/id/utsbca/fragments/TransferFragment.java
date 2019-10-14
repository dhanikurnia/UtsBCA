package polinema.ac.id.utsbca.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import polinema.ac.id.utsbca.R;
import polinema.ac.id.utsbca.activities.Antar_BankActivity;
import polinema.ac.id.utsbca.activities.Antar_RekeningActivity;
import polinema.ac.id.utsbca.activities.SakukuActivity;


public class TransferFragment extends Fragment{

    public TransferFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_transfer, container, false);

        Button button_antar_rekening = (Button) view.findViewById(R.id.button_antar_rekening);
        button_antar_rekening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Antar_RekeningActivity.class );
                in.putExtra("some","some data");
                startActivity(in);
            }
        });

        Button button_antar_bank = (Button) view.findViewById(R.id.button_antar_bank);
        button_antar_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Antar_BankActivity.class );
                in.putExtra("some","some data");
                startActivity(in);
            }
        });

        Button button_sakuku = (Button) view.findViewById(R.id.button_sakuku);
        button_sakuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), SakukuActivity.class );
                startActivity(in);
            }
        });
        return view;

    }

}
