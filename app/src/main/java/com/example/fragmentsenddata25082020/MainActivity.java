package com.example.fragmentsenddata25082020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTvCount;
    FragmentManager mFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvCount = findViewById(R.id.textViewCount);

        mFragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        CongFragment congFragment = new CongFragment();
        Bundle bundle = new Bundle();
        bundle.putString("string","Hello Fragment Cong");
        congFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.linearContainer,congFragment);
        fragmentTransaction.commit();

    }
}