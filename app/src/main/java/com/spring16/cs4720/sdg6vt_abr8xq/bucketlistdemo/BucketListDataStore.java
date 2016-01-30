package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexramey on 1/30/16.
 *
 * Singleton class to handle data storage
 */
public class BucketListDataStore {

    private List<ListItem> mData;
    private static BucketListDataStore sInstance;

    /**
     * Returns static instance of the BuckListDataStore singleton
     * @return Singleton instance of the BucketListDataStore
     */
    public static BucketListDataStore getInstance() {
        if (sInstance == null) {
            sInstance = new BucketListDataStore();
        }
        return sInstance;
    }

    /**
     * Private constructor to initialize data. Made private so other classes can only access the
     * singleton constructor.
     */
    private BucketListDataStore() {
        mData = getMockData();
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
        itemList.add(new ListItem(0, "See a movie at the Virginia Film Festival", "Short Description", "Long Description", false));
        itemList.add(new ListItem(1, "Pick fruit at Carter Mountain", "Short Description", "Long Description", false));
        itemList.add(new ListItem(2, "Streak the Lawn", "Short Description", "Long Description", false));
        itemList.add(new ListItem(3, "Remove yourself from facebook for 24 hours", "Short Description", "Long Description", false));
        itemList.add(new ListItem(4, "View U.Va. from the roof of a building", "Short Description", "Long Description", false));
        itemList.add(new ListItem(5, "Look for ghosts in the U.Va. cemetery", "Short Description", "Long Description", false));
        itemList.add(new ListItem(6, "Read a book in your favorite garden", "Short Description", "Long Description", false));
        itemList.add(new ListItem(7, "Run or support a Charlottesville road race", "Short Description", "Long Description", false));
        itemList.add(new ListItem(8, "See a horse at Foxfield", "Short Description", "Long Description", false));
        itemList.add(new ListItem(9, "Go to an international party", "Short Description", "Long Description", false));
        itemList.add(new ListItem(10, "Watch a U.Va. sporting event to which you’ve never been", "Short Description", "Long Description", false));
        itemList.add(new ListItem(11, "Visit Starbucks at the South Lawn", "Short Description", "Long Description", false));
        itemList.add(new ListItem(12, "Visit the Farmer’s Market Downtown", "Short Description", "Long Description", false));
        itemList.add(new ListItem(13, "Go out of your way to help a stranger", "Short Description", "Long Description", false));
        itemList.add(new ListItem(14, "Rent a movie from Clemons", "Short Description", "Long Description", false));
        itemList.add(new ListItem(15, "Support something that’s important to you", "Short Description", "Long Description", false));
        itemList.add(new ListItem(16, "Dress for the day at home football games - Orange out, Blue out, etc.", "Short Description", "Long Description", false));
        itemList.add(new ListItem(17, "Study in the Music Library", "Short Description", "Long Description", false));
        itemList.add(new ListItem(18, "Study in the Fine Arts Café", "Short Description", "Long Description", false));
        itemList.add(new ListItem(19, "Hang out with a professor outside the classroom", "Short Description", "Long Description", false));
        itemList.add(new ListItem(20, "See a movie at Newcomb Theater", "Short Description", "Long Description", false));
        itemList.add(new ListItem(21, "Donate blood (or support a friend’s donation)", "Short Description", "Long Description", false));
        itemList.add(new ListItem(22, "Attend an event at John Paul Jones Arena", "Short Description", "Long Description", false));
        itemList.add(new ListItem(23, "Volunteer in the Charlottesville community", "Short Description", "Long Description", false));
        itemList.add(new ListItem(24, "See the “river” on the Lawn", "Short Description", "Long Description", false));
        itemList.add(new ListItem(25, "Read in the McGregor Room", "Short Description", "Long Description", false));
        itemList.add(new ListItem(26, "Study in the Dome Room of the Rotunda", "Short Description", "Long Description", false));
        itemList.add(new ListItem(27, "Hang out at a Final Friday reception at the U.Va. Art Museum", "Short Description", "Long Description", false));
        itemList.add(new ListItem(28, "Visit Edgar Allen Poe’s room", "Short Description", "Long Description", false));
        itemList.add(new ListItem(29, "Have a Sunday Funday", "Short Description", "Long Description", false));
        itemList.add(new ListItem(30, "Get an A on an exam or paper", "Short Description", "Long Description", false));
        itemList.add(new ListItem(31, "See a concert at the Charlottesville Pavilion", "Short Description", "Long Description", false));
        itemList.add(new ListItem(32, "Take a historical tour of U.Va.", "Short Description", "Long Description", false));
        itemList.add(new ListItem(33, "Take a drive up skyline", "Short Description", "Long Description", false));
        itemList.add(new ListItem(34, "Stargaze at Open Observatory Night on O-Hill", "Short Description", "Long Description", false));
        itemList.add(new ListItem(35, "Befriend a first-year", "Short Description", "Long Description", false));
        itemList.add(new ListItem(36, "Rope swing at Blue Hole", "Short Description", "Long Description", false));
        itemList.add(new ListItem(37, "Witness the Purple Shadows on Jefferson’s Birthday", "Short Description", "Long Description", false));
        itemList.add(new ListItem(38, "Pull an all-nighter in Clemons", "Short Description", "Long Description", false));
        itemList.add(new ListItem(39, "Have a dorm reunion", "Short Description", "Long Description", false));
        itemList.add(new ListItem(40, "Get a free sample at Arch’s", "Short Description", "Long Description", false));
        itemList.add(new ListItem(41, "Check out an event in the Kaleidoscope room", "Short Description", "Long Description", false));
        itemList.add(new ListItem(42, "Chow down at the Tavern", "Short Description", "Long Description", false));
        itemList.add(new ListItem(43, "Survive at the Biltmore", "Short Description", "Long Description", false));
        itemList.add(new ListItem(44, "Take a different route to class", "Short Description", "Long Description", false));
        itemList.add(new ListItem(45, "Eat a picnic on the Lawn", "Short Description", "Long Description", false));
        itemList.add(new ListItem(46, "Attend an AFC drop-in class", "Short Description", "Long Description", false));
        itemList.add(new ListItem(47, "Ride the Wahooptie", "Short Description", "Long Description", false));
        itemList.add(new ListItem(48, "Make an appointment at UCS", "Short Description", "Long Description", false));
        itemList.add(new ListItem(49, "Take Back the Night", "Short Description", "Long Description", false));
        itemList.add(new ListItem(50, "High-five CavMan", "Short Description", "Long Description", false));
        itemList.add(new ListItem(51, "Check out a book from the library", "Short Description", "Long Description", false));
        itemList.add(new ListItem(52, "Groove to jazz at Miller’s", "Short Description", "Long Description", false));
        itemList.add(new ListItem(53, "Explore the Alderman stacks", "Short Description", "Long Description", false));
        itemList.add(new ListItem(54, "Play an IM sport", "Short Description", "Long Description", false));
        itemList.add(new ListItem(55, "Feed your soul at Mel’s Diner", "Short Description", "Long Description", false));
        itemList.add(new ListItem(56, "Attend office hours", "Short Description", "Long Description", false));
        itemList.add(new ListItem(57, "Experience Drag Bingo", "Short Description", "Long Description", false));
        itemList.add(new ListItem(58, "Sing your heart out at Baja Bean Karaoke", "Short Description", "Long Description", false));
        itemList.add(new ListItem(59, "Attend a class in which you’re not enrolled", "Short Description", "Long Description", false));
        itemList.add(new ListItem(60, "Go wine tasting", "Short Description", "Long Description", false));
        itemList.add(new ListItem(61, "Make the trek up Observatory Hill", "Short Description", "Long Description", false));
        itemList.add(new ListItem(62, "Enjoy a Charlottesville exclusive: Spudnuts", "Short Description", "Long Description", false));
        itemList.add(new ListItem(63, "Make an impulse buy in the U.Va. Bookstore checkout line", "Short Description", "Long Description", false));
        itemList.add(new ListItem(64, "Vote in the U.Va. student elections", "Short Description", "Long Description", false));
        itemList.add(new ListItem(65, "Get some Bellair Market to go", "Short Description", "Long Description", false));
        itemList.add(new ListItem(66, "Attend a student theater production", "Short Description", "Long Description", false));
        itemList.add(new ListItem(67, "Say “thank you” to a university employee", "Short Description", "Long Description", false));
        itemList.add(new ListItem(68, "Paint Beta Bridge", "Short Description", "Long Description", false));
        itemList.add(new ListItem(69, "See the Declaration in Special Collections", "Short Description", "Long Description", false));
        itemList.add(new ListItem(70, "Watch an improv show", "Short Description", "Long Description", false));
        itemList.add(new ListItem(71, "Get your art on at First Fridays downtown", "Short Description", "Long Description", false));
        itemList.add(new ListItem(72, "Tube down the James", "Short Description", "Long Description", false));
        itemList.add(new ListItem(73, "Listen to an a cappella group perform", "Short Description", "Long Description", false));
        itemList.add(new ListItem(74, "Sport some 2011 gear", "Short Description", "Long Description", false));
        itemList.add(new ListItem(75, "Nab the No. 1 ticket at Bodo’s", "Short Description", "Long Description", false));
        itemList.add(new ListItem(76, "Use the 21 box on the Lawn", "Short Description", "Long Description", false));
        itemList.add(new ListItem(77, "Bounce on Ruffner Bridge", "Short Description", "Long Description", false));
        itemList.add(new ListItem(78, "Watch the sunrise from Humpback Rock", "Short Description", "Long Description", false));
        itemList.add(new ListItem(79, "Participate in a Sustained Dialouge event", "Short Description", "Long Description", false));
        itemList.add(new ListItem(80, "Witness a probate", "Short Description", "Long Description", false));
        itemList.add(new ListItem(81, "Grab some BBQ in Belmont", "Short Description", "Long Description", false));
        itemList.add(new ListItem(82, "Check out a Black History Month event", "Short Description", "Long Description", false));
        itemList.add(new ListItem(83, "Visit Monticello", "Short Description", "Long Description", false));
        itemList.add(new ListItem(84, "Relive O-Hill brunch", "Short Description", "Long Description", false));
        itemList.add(new ListItem(85, "Go beyond the corner to South Street Brewery", "Short Description", "Long Description", false));
        itemList.add(new ListItem(86, "Test your intelligence at Mellow Trivia", "Short Description", "Long Description", false));
        itemList.add(new ListItem(87, "High-five Dean Groves", "Short Description", "Long Description", false));
        itemList.add(new ListItem(88, "Chalk for your favorite CIO", "Short Description", "Long Description", false));
        itemList.add(new ListItem(89, "Spotlight a streaker", "Short Description", "Long Description", false));
        itemList.add(new ListItem(90, "Sing the Good Old Song", "Short Description", "Long Description", false));
        itemList.add(new ListItem(91, "Spelunk the steam tunnels", "Short Description", "Long Description", false));
        itemList.add(new ListItem(92, "Eat a pancake for Parkinsons", "Short Description", "Long Description", false));
        itemList.add(new ListItem(93, "Be a part of the U.Va. Green Challenge", "Short Description", "Long Description", false));
        itemList.add(new ListItem(94, "Participate in Trick-or-Treat on the Lawn", "Short Description", "Long Description", false));
        itemList.add(new ListItem(95, "Leave your legacy and make a fourth-year gift to something that’s important to you", "Short Description", "Long Description", false));
        itemList.add(new ListItem(96, "Go to a CIO’s cultural event", "Short Description", "Long Description", false));
        itemList.add(new ListItem(97, "Volunteer at the U.Va. community garden", "Short Description", "Long Description", false));
        itemList.add(new ListItem(98, "See the Lighting of the Lawn", "Short Description", "Long Description", false));
        itemList.add(new ListItem(99, "Make a 2 a.m. Harris Teeter run", "Short Description", "Long Description", false));
        itemList.add(new ListItem(100, "Complete the Dining Hall Marathon - 3 dining halls, 1 day", "Short Description", "Long Description", false));
        itemList.add(new ListItem(101, "Nom nom on a Gusburger", "Short Description", "Long Description", false));
        itemList.add(new ListItem(102, "Be a crazy Hoo Crew member", "Short Description", "Long Description", false));
        itemList.add(new ListItem(103, "See a show at Old Cabel Hall", "Short Description", "Long Description", false));
        itemList.add(new ListItem(104, "Branch out to the Twisted Branch Tea Bazaar", "Short Description", "Long Description", false));
        itemList.add(new ListItem(105, "Join the Alumni Association", "Short Description", "Long Description", false));
        itemList.add(new ListItem(106, "Ride a UTS bus", "Short Description", "Long Description", false));
        itemList.add(new ListItem(107, "Revisit your first-year dorm", "Short Description", "Long Description", false));
        itemList.add(new ListItem(108, "Listen to an entire song played on the chapel bells", "Short Description", "Long Description", false));
        itemList.add(new ListItem(109, "Watch the halftime show at a football game", "Short Description", "Long Description", false));
        itemList.add(new ListItem(110, "Wear the honors of Honor", "Short Description", "Long Description", false));
        return itemList;
    }
}
