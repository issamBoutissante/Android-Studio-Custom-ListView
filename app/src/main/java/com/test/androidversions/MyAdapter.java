package com.test.androidversions;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private String title[] = { "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie", "Q", "R"};
    private String sousTitle[] = { "version: 5.0", "version: 6.0", "version: 7.0", "version: 8.0", "version: 9.0", "version: 10.0", "version: 11.0"};
    private int thumb[] = { R.drawable.lollipop, R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo, R.drawable.pie, R.drawable.q, R.drawable.r };
    private LayoutInflater layoutInflater;
    private Context context;
    MyAdapter(Context context){
        layoutInflater=LayoutInflater.from(context);
        //layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    private  Version[] versions={
            new Version("Lollipop","version:5.0",R.drawable.lollipop),
            new Version("Marshmallow","version:6.0",R.drawable.marshmallow),
            new Version("Nougat","version: 7.0",R.drawable.nougat),
            new Version("Oreo","version:8.0",R.drawable.oreo),
            new Version("Pie","version: 9.0",R.drawable.pie),
            new Version("Q","version: 10.0",R.drawable.q),
            new Version("R","version: 11.0",R.drawable.r)
    };
    @Override
    public int getCount() {
        System.out.println(versions.length);
        return versions.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View myView=view;
        if(myView==null)
            myView=layoutInflater.inflate(R.layout.listitem,null);
        ImageView image=myView.findViewById(R.id.icon);
        TextView title=myView.findViewById(R.id.title);
        TextView sousTitle=myView.findViewById(R.id.sousTitle);
        image.setBackgroundResource(versions[i].thumb);
        title.setText(versions[i].title);
        sousTitle.setText(versions[i].sousTitle);
        return myView;
    }
}
