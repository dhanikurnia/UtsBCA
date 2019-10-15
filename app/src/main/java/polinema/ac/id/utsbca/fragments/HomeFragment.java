package polinema.ac.id.utsbca.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import polinema.ac.id.utsbca.R;
import polinema.ac.id.utsbca.activities.AboutActivity;
import polinema.ac.id.utsbca.activities.KlikbcaActivity;
import polinema.ac.id.utsbca.activities.MbcaActivity;


public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button button_mbca = (Button) view.findViewById(R.id.button_mbca);
        button_mbca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), MbcaActivity.class );
                in.putExtra("Halo","Sam");
                startActivity(in);
            }
        });

        Button button_klikbca = (Button) view.findViewById(R.id.button_klikbca);
        button_klikbca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), KlikbcaActivity.class );
                in.putExtra("Halo","Bro");
                startActivity(in);
            }
        });

        Button button_about = (Button) view.findViewById(R.id.button_about);
        button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), AboutActivity.class );
                startActivity(in);
            }
        });

        return view;
    }


}
