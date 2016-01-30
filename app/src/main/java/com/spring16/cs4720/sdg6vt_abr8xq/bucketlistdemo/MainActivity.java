package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
        trans.add(R.id.fragment_container, new BucketListFragment());
        trans.commit();
    }
}
