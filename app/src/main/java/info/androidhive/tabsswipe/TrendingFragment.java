package info.androidhive.tabsswipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import info.androidhive.tabsswipe.R;

public class TrendingFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View RootView = inflater.inflate(R.layout.fragment_trending, container, false);

        ArrayList<NewsItem> image_details = getListData();
        final ListView lv1 = (ListView)RootView.findViewById(R.id.custom_list);
        lv1.setAdapter(new CustomListAdapter(getActivity(), image_details));

        lv1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                NewsItem newsData = (NewsItem) o;
                Toast.makeText(getActivity(), "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
            }
        });
        return RootView;
	}

    private ArrayList<NewsItem> getListData() {
        ArrayList<NewsItem> results = new ArrayList<NewsItem>();
        NewsItem newsData = new NewsItem();
        newsData.setHeadline("WhatsApp");
        newsData.setReporterName("Whatsapp Inc");
        newsData.setDate("Free");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Facebook");
        newsData.setReporterName("Facebook Inc");
        newsData.setDate("Free");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Twitter");
        newsData.setReporterName("Twitter Inc");
        newsData.setDate("Free");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Camera 360");
        newsData.setReporterName("Camera Solution");
        newsData.setDate("Free");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Google Plus");
        newsData.setReporterName("Google Inc");
        newsData.setDate("Rs. 50");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Google Launcher");
        newsData.setReporterName("Google Inc");
        newsData.setDate("Rs. 200");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Flipboard");
        newsData.setReporterName("Flipboard Inc");
        newsData.setDate("Free");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Rajinikanth");
        newsData.setReporterName("Xpresslabs");
        newsData.setDate("Free");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Life 360");
        newsData.setReporterName("Lifeline Solution");
        newsData.setDate("Rs. 150");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Grand Theft Auto 5");
        newsData.setReporterName("Rockstar Games");
        newsData.setDate("Rs. 135");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Indian Passport");
        newsData.setReporterName("Gov.in");
        newsData.setDate("Free");
        results.add(newsData);

        newsData = new NewsItem();
        newsData.setHeadline("Woodpecker");
        newsData.setReporterName("Sudeep Nanda");
        newsData.setDate("Free");
        results.add(newsData);

        return results;
    }
}




