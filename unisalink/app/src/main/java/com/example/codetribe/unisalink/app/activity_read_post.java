package com.example.codetribe.unisalink.app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class activity_read_post extends ActionBarActivity {
    Button btnAdd;
    ListView booklist;
    BooksAdaptor BooksAdaptor;
    Context ctx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_post);

        btnAdd = (Button) findViewById(R.id.L_addBook);
        booklist = (ListView) findViewById(R.id.booklist);
        ctx = getApplicationContext();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_add_book.class);
                startActivity(intent);
            }
        });

        List<BooksDTO> Books = new ArrayList<>();
        BooksDTO book = new BooksDTO("Operating System Practise","ISBN:126564646","R 400.00");
        Books.add(book);
        Books.add(book);
        Books.add(book);
        Books.add(book);
        Books.add(book);
        Books.add(book);
        Books.add(book);
        BooksAdaptor = new BooksAdaptor(ctx,Books);
        booklist.setAdapter(BooksAdaptor);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_read_post, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
