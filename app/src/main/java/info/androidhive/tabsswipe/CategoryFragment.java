package info.androidhive.tabsswipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import java.util.ArrayList;
import android.app.Activity;
import android.app.ListActivity;
import android.widget.ListView;


public class CategoryFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_category, container, false);

        // 1. pass context and data to the custom adapter
        categoryListAdapter adapter = new categoryListAdapter(getActivity(), generateData());

        // if extending Activity 2. Get ListView from activity_main.xml
        ListView listView = (ListView) rootView.findViewById(R.id.categoryListView);

        // 3. setListAdapter
        listView.setAdapter(adapter);
        //setListAdapter(adapter);

        return rootView;
    }

    private ArrayList<categoryListModal> generateData(){
        ArrayList<categoryListModal> models = new ArrayList<categoryListModal>();
        models.add(new categoryListModal(R.drawable.ic_action_gamepad,"Games"));
        models.add(new categoryListModal(R.drawable.ic_action_cloud,"Utilities"));
        models.add(new categoryListModal(R.drawable.ic_action_headphones,"Music & Movies"));
        models.add(new categoryListModal(R.drawable.ic_action_chat,"Social Networking"));
        models.add(new categoryListModal(R.drawable.ic_action_storage,"Books"));
        models.add(new categoryListModal(R.drawable.ic_action_computer,"Education"));
        models.add(new categoryListModal(R.drawable.ic_action_go_to_today,"Productivity"));
        models.add(new categoryListModal(R.drawable.ic_action_labels,"Shopping"));
        models.add(new categoryListModal(R.drawable.ic_action_map,"Lifestyle"));
        models.add(new categoryListModal(R.drawable.ic_action_place,"Travel"));
        models.add(new categoryListModal(R.drawable.ic_action_picture,"Photo & Video"));
        models.add(new categoryListModal(R.drawable.ic_action_important,"Entertainment"));
        models.add(new categoryListModal(R.drawable.ic_action_view_as_list,"News"));
        return models;
    }





}
