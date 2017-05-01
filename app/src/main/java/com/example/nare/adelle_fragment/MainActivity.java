package com.example.nare.adelle_fragment;

import android.app.FragmentTransaction;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "tag";
    FragmentTransaction fragmentTransaction;
    Fragment_home fragment_one;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Log.d(TAG, "MainActivity: onCreate()");

        fragment_one = new Fragment_home();
        fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment_one);
        fragmentTransaction.commit();

        // MediaPlayer player = MediaPlayer.create(this,R.raw.mus);
        // player.start();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame, fragment_one);
            fragmentTransaction.commit();

        }
        return super.onOptionsItemSelected(item);
    }

}
