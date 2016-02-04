package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BucketListFragment extends Fragment {

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

}
