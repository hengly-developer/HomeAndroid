package com.example.xxxxxx.homeandroid;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListview extends ArrayAdapter<String> {


    private String[] storyName;
    private String[] storyDesc;
    private Integer[] imageid;
    private Activity context;
    public CustomListview(@NonNull Activity context, String[] storyName,String[] storyDesc,Integer[] imageid) {
        super(context, R.layout.listview_layout,storyName);
        this.context=context;
        this.storyName=storyName;
        this.storyDesc=storyDesc;
        this.imageid=imageid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        ViewHolder viewHolder =null;
        if (v==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            v=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder= new ViewHolder(v);
            v.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) v.getTag();
        }

        viewHolder.image.setImageResource(imageid[position]);
        viewHolder.textViewTitle.setText(storyName[position]);
        viewHolder.textViewDescription.setText(storyDesc[position]);

        return v;
    }

    class ViewHolder{
        TextView textViewTitle;
        TextView textViewDescription;
        ImageView image;

        public ViewHolder(View view) {

            textViewTitle = view.findViewById(R.id.textViewtitle);
            textViewDescription = view.findViewById(R.id.textViewDescription);
            image = view.findViewById(R.id.imageView);
        }


    }
}
