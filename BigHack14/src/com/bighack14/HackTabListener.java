package com.bighack14;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;

import com.bighack14.R;
 
public class HackTabListener implements ActionBar.TabListener {
    Fragment fragment;
 
    public HackTabListener(Fragment leftFragment) {
        this.fragment = leftFragment;
    }
 
    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.fragment_container, fragment);
    }
 
    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        ft.remove(fragment);
    }
 
    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    	//Do nothing:
    }
}