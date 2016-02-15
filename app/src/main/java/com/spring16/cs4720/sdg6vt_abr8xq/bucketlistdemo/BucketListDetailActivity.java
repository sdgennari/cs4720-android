package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;
import android.widget.ToggleButton;

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
                ToggleButton statusToggleButton = (ToggleButton) this.findViewById(R.id.toggle_button_status);
                statusToggleButton.setChecked(item.isComplete);
            }
        }
    }

    @Override
    public void onBackPressed() {
        setActivtyResult();
        super.onBackPressed();
    }

    public void toggleProgress(View v) {
        BucketListDataStore.getInstance(this).recordCheckToggle(mSelection);
        this.updateUI();
    }

    private void setActivtyResult() {
        Intent data = new Intent();
        data.putExtra(BucketListFragment.EXTRA_TOGGLE_INDEX, mSelection);
        setResult(RESULT_OK, data);
    }

}
