package info.androidhive.tabsswipe.adapter;

import info.androidhive.tabsswipe.CategoryFragment;
import info.androidhive.tabsswipe.FeaturedFragment;
import info.androidhive.tabsswipe.TopAppFragment;
import info.androidhive.tabsswipe.TrendingFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new CategoryFragment();
		case 1:
			return new FeaturedFragment();
		case 2:
			return new TopAppFragment();
        case 3:
            return new TrendingFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4;
	}

}
