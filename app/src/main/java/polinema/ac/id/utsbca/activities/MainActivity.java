package polinema.ac.id.utsbca.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import polinema.ac.id.utsbca.R;
import polinema.ac.id.utsbca.fragments.AdminFragment;
import polinema.ac.id.utsbca.fragments.CommerceFragment;
import polinema.ac.id.utsbca.fragments.HomeFragment;
import polinema.ac.id.utsbca.fragments.InfoFragment;
import polinema.ac.id.utsbca.fragments.TransferFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new AdminFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_home:
                fragment = new HomeFragment();
                break;
            case R.id.action_info:
                fragment = new InfoFragment();
                break;
            case R.id.action_transfer:
                fragment = new TransferFragment();
                break;
            case R.id.action_commerce:
                fragment = new CommerceFragment();
                break;
        }
        return loadFragment(fragment);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }


}
