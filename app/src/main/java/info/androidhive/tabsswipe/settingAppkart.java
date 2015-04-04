package info.androidhive.tabsswipe;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import java.util.ArrayList;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class settingAppkart extends Activity{

    public void onCreate(Bundle bundle) {
            super.onCreate(bundle);

        // if extending Activity
        setContentView(R.layout.settings_appkart);

        // 1. pass context and data to the custom adapter
        simpleListAdapter adapter = new simpleListAdapter(this, generateData());

        // if extending Activity 2. Get ListView from activity_main.xml
        ListView listView = (ListView) findViewById(R.id.settingslistview);

        // 3. setListAdapter
        listView.setAdapter(adapter);
        //setListAdapter(adapter);

        }


        private ArrayList<simpleListModal> generateData(){
            ArrayList<simpleListModal> models = new ArrayList<simpleListModal>();
            models.add(new simpleListModal("My Preference"));
            models.add(new simpleListModal(R.drawable.ic_action_person_d,"Manage Profiles","1"));
            models.add(new simpleListModal(R.drawable.ic_action_sort_by_size,"Change Payment Method","2"));
            models.add(new simpleListModal("What i do here?"));
            models.add(new simpleListModal(R.drawable.ic_action_phone,"My Apps","12"));
            models.add(new simpleListModal(R.drawable.games,"My Games","12"));
            models.add(new simpleListModal("Other Settings"));
            models.add(new simpleListModal(R.drawable.ic_action_settings_d,"Settings","12"));
            models.add(new simpleListModal(R.drawable.ic_action_remove,"Signout My Account","12"));
            models.add(new simpleListModal(R.drawable.ic_action_important,"About Appkart", ""));

            return models;
        }

}
