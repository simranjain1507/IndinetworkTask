package com.example.android.indinetworktask.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.indinetworktask.Fragments.ManagementFragment;
import com.example.android.indinetworktask.Fragments.TeacherFragment;

/**
 * Created by simranjain1507 on 13/09/17.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    Context context;
    public FragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.context=context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ManagementFragment();
        }else{
            return new TeacherFragment();
        }

    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return "MANAGEMENT";
        else
            return "TEACHERS";
    }
}
