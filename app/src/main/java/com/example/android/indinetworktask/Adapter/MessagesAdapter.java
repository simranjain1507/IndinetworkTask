package com.example.android.indinetworktask.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.indinetworktask.Utils.Message;
import com.example.android.indinetworktask.R;

import java.util.List;

/**
 * Created by simranjain1507 on 13/09/17.
 */

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.MyiewHolder> {
    List<Message> messageList;
    Context context;
    public MessagesAdapter(List<Message> messageList, Context context){
        this.messageList=messageList;
        this.context=context;
    }
    @Override
    public MyiewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new MyiewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyiewHolder holder, int position) {
        holder.sender.setText(messageList.get(position).getSender());
        holder.message.setText(messageList.get(position).getMessage());
        holder.date.setText(messageList.get(position).getDate());
        holder.profile.setImageResource(messageList.get(position).getImageID());
    }


    @Override
    public int getItemCount() {
        return messageList.size();
    }

    class MyiewHolder extends RecyclerView.ViewHolder{
        TextView sender, message, date;
        ImageView profile;
        public MyiewHolder(View itemView) {
            super(itemView);
            sender=(TextView) itemView.findViewById(R.id.tv_sender);
            message=(TextView) itemView.findViewById(R.id.tv_message);
            date=(TextView) itemView.findViewById(R.id.tv_date);
            profile=(ImageView) itemView.findViewById(R.id.iv_profile_pic);
        }
    }
}
