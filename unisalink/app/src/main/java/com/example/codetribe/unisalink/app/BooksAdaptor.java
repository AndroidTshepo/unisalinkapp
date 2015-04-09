package com.example.codetribe.unisalink.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Codetribe on 4/7/2015.
 */
public class BooksAdaptor extends BaseAdapter {

    Context mCtx;
    List<String> mList;
    List<BooksDTO>booksList;

    public BooksAdaptor(Context mCtx, List<BooksDTO> booksList) {
        this.mCtx = mCtx;
        this.booksList = booksList;
    }

    @Override
    public int getCount() {
        return booksList.size();
    }

    @Override
    public Object getItem(int position) {
        return booksList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        holder h;
        if(convertView==null){
            h= new holder();
            LayoutInflater inflater = (LayoutInflater) mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.item, parent, false);

            h.title = (TextView) convertView.findViewById(R.id.title);
            h.ISBN = (TextView) convertView.findViewById(R.id.ISBN);
            h.price = (TextView) convertView.findViewById(R.id.price);
            h.imageView = (ImageView) convertView.findViewById(R.id.bookImage);
            convertView.setTag(h);
        }else{
            h = (holder) convertView.getTag();
        }
        String title = booksList.get(position).getTitle();
        String ISBN = booksList.get(position).getISBN();
        String price = booksList.get(position).getPrice();

        h.title.setText(title);
        h.ISBN.setText(ISBN);
        h.price.setText(price);



       // animateView(convertView);

        return convertView;
    }
    class holder{
        ImageView imageView;
        TextView title;
        TextView ISBN;
        TextView price;
    }

//    public void animateView(final View view) {
//        Animation a = AnimationUtils.loadAnimation(mCtx, R.anim.grow_fade_in_center);
//        a.setDuration(500);
//        if (view == null)
//            return;
//        view.startAnimation(a);
//    }
}
