package com.example.lappy_486.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Lappy-486 on 3/5/2017.
 */

public class BookLoader extends AsyncTaskLoader<List<Book>> {
    private String mUrl;

    public BookLoader(Context context, String url) {
        super(context);
        this.mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Book> earthquakes = QueryUtils.fetchBookData(mUrl);
        return earthquakes;
    }
}
