package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class BucketListDetailActivity extends AppCompatActivity {

    private int mSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_list_detail);

        Intent intent = getIntent();
        mSelection = intent.getIntExtra("index", -1);
        this.updateUI();
    }

    private void updateUI() {
        if (mSelection != -1) {
            ListItem item = BucketListDataStore.getInstance(this).getItemAtIndex(mSelection);
            if (item != null) {
                TextView titleView = (TextView)this.findViewById(R.id.title_view);
                titleView.setText(item.name);
                TextView shortDescriptionView = (TextView)this.findViewById(R.id.short_desc_view);
                shortDescriptionView.setText(item.shortDescription);
                TextView progressView = (TextView)this.findViewById(R.id.progress_view);
                progressView.setText(item.isComplete ? "TASK COMPLETE" : "TASK NOT COMPLETE");
            }
        }
    }

    public void toggleProgress(View v) {
        BucketListDataStore.getInstance(this).recordCheckToggle(mSelection);
        this.updateUI();
    }

}
