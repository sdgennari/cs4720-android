package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;

/**
 * A simple {@link Fragment} subclass.
 */
public class BucketListFragment extends Fragment {

    public static final int REQUEST_CODE_TOGGLE = 1;
    public static final String EXTRA_TOGGLE_INDEX = "EXTRA_TOGGLE_INDEX";

    private RecyclerView mBucketListRecyclerView;
    private RecyclerView.LayoutManager mBucketListLayoutManager;
    private BucketListAdapter mBucketListAdapter;

    private BucketListDataStore mBucketListDataStore;

    public BucketListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        System.out.println("Fragment OnCreateView!");
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_bucket_list, container, false);
        mBucketListRecyclerView = (RecyclerView)root.findViewById(R.id.bucket_list_recycler_view);

        // Boosts performance by guaranteeing that all the cells are the same size
        mBucketListRecyclerView.setHasFixedSize(true);

        // Set recycler view layout manager
        mBucketListLayoutManager = new LinearLayoutManager(this.getActivity());
        mBucketListRecyclerView.setLayoutManager(mBucketListLayoutManager);

        // Setup data store
        mBucketListDataStore = BucketListDataStore.getInstance(this.getContext());

        // Set recycler view adapter
        mBucketListAdapter = new BucketListAdapter(mBucketListDataStore.getData());
        mBucketListRecyclerView.setAdapter(mBucketListAdapter);

        return root;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Check for the toggle request code
        if (requestCode == REQUEST_CODE_TOGGLE && data != null) {

            // Get the position of the item that was changed
            int position = data.getIntExtra(EXTRA_TOGGLE_INDEX, -1);

            // If the position is valid, update the item in the list
            if (position != -1) {
                mBucketListAdapter.notifyItemChanged(position);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("tag", "onResume!");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("tag", "onPause!");
    }

}
