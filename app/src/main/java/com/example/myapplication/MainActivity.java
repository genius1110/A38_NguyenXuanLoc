package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Fragment_Login fragment_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragment(fragment_login.newInstance());
    }

    private void getFragment(Fragment fragment) {
            try{
                getSupportFragmentManager().beginTransaction().replace(R.id.contaier,fragment).commit();

            }catch (Exception e)
            {
                e.printStackTrace();
                Log.d(TAG, "getFragment: " + e.getMessage());
            }
    }
}
