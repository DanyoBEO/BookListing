package com.example.lappy_486.booklisting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BookActivity extends AppCompatActivity  {

    private static final String GOOGLE_URL_REQUEST = "https://www.googleapis.com/books/v1/volumes?q=android&maxResults=1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
