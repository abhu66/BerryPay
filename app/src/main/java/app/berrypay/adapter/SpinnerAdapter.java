package app.berrypay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import app.berrypay.R;

public class SpinnerAdapter  extends BaseAdapter {
    private Integer images[];
    private String[] countryCode;
    private LayoutInflater inflter;

    public SpinnerAdapter(Context applicationContext, Integer[] flags, String[] fruit) {
        this.images = flags;
        this.countryCode = fruit;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items, null);
        ImageView icon =  view.findViewById(R.id.flag_icon);
        TextView names = view.findViewById(R.id.code_country);
        icon.setImageResource(images[i]);
        names.setText(countryCode[i]);
        return view;
    }
}