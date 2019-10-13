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

import polinema.ac.id.utsbca.R;


public class TransferFragment extends AppCompatActivity {


    public void HandleAntar_RekeningFragment(View view) {

        Intent intent =  new Intent(this, Antar_RekeningFragment.class);
        startActivity(intent);
    }
}
