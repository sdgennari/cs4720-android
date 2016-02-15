package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Activity: On Create!");
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
            trans.add(R.id.fragment_container, new BucketListFragment());
            trans.commit();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Fragment frag = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        if (frag != null) {
            frag.onActivityResult(requestCode, resultCode, data);
        }
    }
}
