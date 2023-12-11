package adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragmentArray = new ArrayList<Fragment>();

    public void addFragment (Fragment fragment) {
        fragmentArray.add(fragment);
    }

    public VPAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentArray.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArray.size();
    }
}
