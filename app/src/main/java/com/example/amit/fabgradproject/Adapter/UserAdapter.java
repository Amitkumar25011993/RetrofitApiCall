package com.example.amit.fabgradproject.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amit.fabgradproject.MainActivity;
import com.example.amit.fabgradproject.Model.User;
import com.example.amit.fabgradproject.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 2/15/2018.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder>{
        private List<User> itemsEntities;




    public UserAdapter(List<User> itemsEntities, MainActivity mainActivity) {
        this.itemsEntities = itemsEntities;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserAdapter.MyViewHolder holder, int position) {

        final UserAdapter.MyViewHolder holder1 = holder;

        holder1.id.setText(itemsEntities.get(position).getUs_id());
        holder1.title.setText(itemsEntities.get(position).getUs_title());
        holder1.topic_count.setText(itemsEntities.get(position).getUs_topics_count());
        holder1.result.setText(itemsEntities.get(position).getResult());
        holder1.subtopics_count.setText(itemsEntities.get(position).getUs_subtopics_count());

    }

    @Override
    public int getItemCount() {
        return itemsEntities.size();
    }



    public void setfilter(List<User> listitem)
    {
        itemsEntities =new ArrayList<>();
        itemsEntities.addAll(listitem);
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView id, title, topic_count, result, subtopics_count;

        public MyViewHolder(View view) {
            super(view);
            id = (TextView) view.findViewById(R.id.tv_us_id);
            title = (TextView) view.findViewById(R.id.tv_us_title);
            topic_count = (TextView) view.findViewById(R.id.tv_topic_count);
            result = (TextView) view.findViewById(R.id.tv_result);
            subtopics_count = (TextView) view.findViewById(R.id.tv_us_subtopics_count);

        }
    }

}
