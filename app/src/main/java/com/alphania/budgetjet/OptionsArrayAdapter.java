package com.alphania.budgetjet;

import android.content.Context;
import android.widget.ArrayAdapter;

public class OptionsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mOptions;

    public OptionsArrayAdapter(Context mContext, int resource, String[] mOptions) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mOptions = mOptions;
    }
    @Override
    public Object getItem(int position) {
        String option = mOptions[position];
        return String.format(option);
    }

    @Override
    public int getCount() {
        return mOptions.length;
    }
}
