package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexramey on 1/30/16.
 *
 * Singleton class to handle data storage
 */
public class BucketListDataStore {

    private List<ListItem> mData;
    private final String KEY_SHARED_PREFS_DATA_STORE = "KEY_SHARED_PREFS_DATA_STORE";
    private final String KEY_SHARED_PREFS_PROGRESS_STRING = "KEY_SHARED_PREFS_PROGRESS_STRING";
    private SharedPreferences mPrefs;
    private static BucketListDataStore sInstance;

    /**
     * Returns static instance of the BuckListDataStore singleton
     * @return Singleton instance of the BucketListDataStore
     */
    public static BucketListDataStore getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new BucketListDataStore(context);
        }
        return sInstance;
    }

    /**
     * Private constructor to initialize data. Made private so other classes can only access the
     * singleton constructor.
     */
    private BucketListDataStore(Context context) {
        mPrefs = context.getSharedPreferences(KEY_SHARED_PREFS_DATA_STORE, 0);
        mData = getMockData();
    }

    /**
     * Private default constructor to adhere to Singleton design pattern.
     */
    private BucketListDataStore() {
        // empty constructor
    }


    /**
     * Returns a list of items on the bucket list
     * @return List of items in the bucket list items
     */
    public List<ListItem> getData() {
        return mData;
    }

    /**
     * Simulates getting data from an external data source.
     * Data from:http://giving.virginia.edu/hoosonline/wp-content/uploads/sites/6/2013/06/111_Things_To_Do_Before_You_Graduate.pdf
     * @return List of ListItems with mock data for the app
     */
    private List<ListItem> getMockData() {
        List<ListItem> itemList = new ArrayList<>();
        itemList.add(new ListItem(0, "See a movie at the Virginia Film Festival", "Choose a moive you haven't seen before!", "Long Description", false));
        itemList.add(new ListItem(1, "Pick fruit at Carter Mountain", "It must not be from the ground!", "Long Description", false));
        itemList.add(new ListItem(2, "Streak the Lawn", "Socks aren't allowed.", "Long Description", false));
        itemList.add(new ListItem(3, "Remove yourself from facebook for 24 hours", "Permanently delete your account and lose all your friends.", "Long Description", false));
        itemList.add(new ListItem(4, "View U.Va. from the roof of a building", "Try Montecello's roof.", "Long Description", false));
        itemList.add(new ListItem(5, "Look for ghosts in the U.Va. cemetery", "Corner of alderman and mccormick is a good spot.", "Long Description", false));
        itemList.add(new ListItem(6, "Read a book in your favorite garden", "Notice the serpentine walls.", "Long Description", false));
        itemList.add(new ListItem(7, "Run or support a Charlottesville road race", "5ks are everywhere, and there's a half marathon in the spring.", "Long Description", false));
        itemList.add(new ListItem(8, "See a horse at Foxfield", " and remember it the next day . . .", "Long Description", false));
        itemList.add(new ListItem(9, "Go to an international party", "Where you can't speak the language.", "Long Description", false));
        itemList.add(new ListItem(10, "Watch a U.Va. sporting event to which you’ve never been", "Must attend in person.", "Long Description", false));
        itemList.add(new ListItem(11, "Visit Starbucks at the South Lawn", "And order a cup of water.", "Long Description", false));
        itemList.add(new ListItem(12, "Visit the Farmer’s Market Downtown", "And sell your own fruit that you got at Harris Teeter.", "Long Description", false));
        itemList.add(new ListItem(13, "Go out of your way to help a stranger", "\"Homeless\" people outside CVS don't count.", "Long Description", false));
        itemList.add(new ListItem(14, "Rent a movie from Clemons", "and watch it before returning it.", "Long Description", false));
        itemList.add(new ListItem(15, "Support something that’s important to you", "This is a good thing to do.", "Long Description", false));
        itemList.add(new ListItem(16, "Dress for the day at home football games - Orange out, Blue out, etc.", "Body paint is a must.", "Long Description", false));
        itemList.add(new ListItem(17, "Study in the Music Library", "But DON'T LISTEN TO ANY MUSIC.", "Long Description", false));
        itemList.add(new ListItem(18, "Study in the Fine Arts Café", "BUT DON'T LOOK AT ANY ARTS", "Long Description", false));
        itemList.add(new ListItem(19, "Hang out with a professor outside the classroom", "Revolutionary.", "Long Description", false));
        itemList.add(new ListItem(20, "See a movie at Newcomb Theater", "And do a standing ovation at the end.", "Long Description", false));
        itemList.add(new ListItem(21, "Donate blood (or support a friend’s donation)", "Pro Tip: Supporting a friend is much easier.", "Long Description", false));
        itemList.add(new ListItem(22, "Attend an event at John Paul Jones Arena", "Basketball team is $.", "Long Description", false));
        itemList.add(new ListItem(23, "Volunteer in the Charlottesville community", "And don't put it on your resume.", "Long Description", false));
        itemList.add(new ListItem(24, "See the “river” on the Lawn", "Helps to be at least buzzed.", "Long Description", false));
        itemList.add(new ListItem(25, "Read in the McGregor Room", "Avoid jellyfish man at all cost.", "Long Description", false));
        recallCompletionState(itemList);
        return itemList;
    }

    /**
     *
     * @param list A list of ListItems on which this method seeks to update the
     *             isCompleted field using the information stored in the progress
     *             string in shared preferences. This progress string is of the form
     *             x,x,x,x,x,x,x where x may either be 0 or 1.
     */
    private void recallCompletionState(List<ListItem> list) {
        String savedString = mPrefs.getString(KEY_SHARED_PREFS_PROGRESS_STRING, "");
        if (savedString.equals("")){
            // No saved string
            String progressString = "";
            int limit = list.size() - 1;
            for (int i = 0; i < limit; i++) {
                progressString += "0,";
            }
            progressString+="0";
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString(KEY_SHARED_PREFS_PROGRESS_STRING, progressString);
            editor.commit();
        }
        else {
            String[] progressIndicators = savedString.split(",");
            if (list.size() != progressIndicators.length) {
                if (list.size() > progressIndicators.length)
                {
                    // lengthen the current progress string
                    String progressString = "";
                    // copy existing progress values
                    for (int i = 0; i < progressIndicators.length; i++)
                    {
                        progressString += (progressIndicators[i] + ",");
                    }
                    int limit = list.size() - 1;
                    // append 0s for new tasks (mark as incomplete)
                    for (int i = progressIndicators.length; i < limit; i++)
                    {
                        progressString  += "0,";
                    }
                    progressString += "0";
                    SharedPreferences.Editor editor = mPrefs.edit();
                    editor.putString(KEY_SHARED_PREFS_PROGRESS_STRING, progressString);
                    editor.commit();
                    progressIndicators = progressString.split(",");
                }
                else{
                    // ignore this case (it's okay to save a string that's a little too long)
                }
            }
            int size = progressIndicators.length;
            for (int i = 0; i < size; i++) {
                list.get(i).isComplete = (progressIndicators[i].equals("1"));
            }
        }
    }


    /**
     * We toggle the appropriate progress indicator in the SharedPrefs String
     * @param itemNumber the id of the item that was toggled
     */
    public void recordCheckToggle(int itemNumber)
    {
        String savedString = mPrefs.getString(KEY_SHARED_PREFS_PROGRESS_STRING, "");
        char c = savedString.charAt(itemNumber * 2);
        c = (c == '1' ? '0' : '1');
        // update local item
        mData.get(itemNumber).isComplete = ((c == '1' ? true : false));
        StringBuilder builder = new StringBuilder(savedString);
        builder.setCharAt(itemNumber*2, c);
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString(KEY_SHARED_PREFS_PROGRESS_STRING, builder.toString());
        editor.commit();
    }

    public ListItem getItemAtIndex(int index)
    {
        if (index < mData.size()) {
            return mData.get(index);
        }
        return null;
    }

}
