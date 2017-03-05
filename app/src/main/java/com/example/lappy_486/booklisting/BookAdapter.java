package com.example.lappy_486.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lappy-486 on 3/5/2017.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        //Start constructing the list
        Book currentBook = getItem(position);

        //Attach title to current book
        TextView titleView = (TextView) listItemView.findViewById(R.id.book_title);
        titleView.setText(currentBook.getTitle());

        //Attach author to current book
        TextView authorView = (TextView) listItemView.findViewById(R.id.book_author);
        authorView.setText(currentBook.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
