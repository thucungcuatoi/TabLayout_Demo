package website.thucungcuatoi.tabdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by thucu on 2017-10-26.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {
    private String listtab[] = {"Tab 1","Tab 2","Tab3"};
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return fragment1;
        }
        if (position == 1){
            return fragment2;
        }
        if (position == 2){
            return fragment3;
        }

        return null;
    }

    @Override
    public int getCount() {
        return listtab.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listtab[position];
    }
}
