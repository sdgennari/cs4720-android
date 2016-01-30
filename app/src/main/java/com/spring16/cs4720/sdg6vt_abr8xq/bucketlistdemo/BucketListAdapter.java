package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.List;

/**
 * Created by alexramey on 1/30/16.
 */
public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.ViewHolder> {
    private List<ListItem> mDataset;

    // Wrapper for the cell
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mNumberView;
        public TextView mNameView;
        public ToggleButton mToggleButton;
        public ViewHolder(View v) {
            super(v);
            mNumberView = (TextView)(v.findViewById(R.id.item_number));
            mNameView = (TextView)(v.findViewById(R.id.item_name));
            mToggleButton = (ToggleButton)(v.findViewById(R.id.item_toggle));
        }
    }

    // constructor
    public BucketListAdapter(List<ListItem> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public BucketListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bucket_list_cell, parent, false);

        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mNumberView.setText(String.valueOf(position));
        holder.mNameView.setText(mDataset.get(position).name);
        holder.mToggleButton.setChecked(mDataset.get(position).isComplete);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
