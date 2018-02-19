package com.androidtutorialshub.recyclerviewtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.androidtutorialshub.recyclerviewtutorial.Adapter.BookAdapter;
import com.androidtutorialshub.recyclerviewtutorial.Helper.ItemDividerDecoration;
import com.androidtutorialshub.recyclerviewtutorial.Helper.RecyclerViewClickListener;
import com.androidtutorialshub.recyclerviewtutorial.Helper.RecyclerViewTouchListener;
import com.androidtutorialshub.recyclerviewtutorial.Model.Book;
import com.androidtutorialshub.recyclerviewtutorial.result.ResultActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Book> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BookAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BookAdapter(bookList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        // recyclerView.addItemDecoration(new ItemDividerDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerViewTouchListener(getApplicationContext(), recyclerView, new RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("Title", bookList.get(position).getTitle());
                intent.putExtra("Author", bookList.get(position).getAuthor());
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), bookList.get(position).getTitle() + " is clicked!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(getApplicationContext(), bookList.get(position).getTitle() + " is long pressed!", Toast.LENGTH_SHORT).show();

            }
        }));

        initBookData();
    }

    private void initBookData() {
        Book book = new Book("Cnu Android", "Ed Burnette");
        bookList.add(book);

        book = new Book("Beginning Android 3", "Mark Murphy");
        bookList.add(book);

        book = new Book("Unlocking Android", " W. Frank Ableson");
        bookList.add(book);

        book = new Book("Android Tablet Development", "Wei Meng Lee");
        bookList.add(book);

        book = new Book("Android Apps Security", "Sheran Gunasekera");
        bookList.add(book);
        Book bookone = new Book("Cnu Android", "Ed Burnette");
        bookList.add(bookone);

        bookone = new Book("Beginning Android 3", "Mark Murphy");
        bookList.add(bookone);

        bookone = new Book("Unlocking Android", " W. Frank Ableson");
        bookList.add(bookone);

        bookone = new Book("Android Tablet Development", "Wei Meng Lee");
        bookList.add(bookone);

        bookone = new Book("Android Apps Security", "Sheran Gunasekera");
        bookList.add(bookone);

        Book bookonetwo = new Book("Cnu Android", "Ed Burnette");
        bookList.add(bookonetwo);

        bookonetwo = new Book("Beginning Android 3", "Mark Murphy");
        bookList.add(bookonetwo);

        bookonetwo = new Book("Unlocking Android", " W. Frank Ableson");
        bookList.add(bookonetwo);

        bookonetwo = new Book("Android Tablet Development", "Wei Meng Lee");
        bookList.add(bookonetwo);

        bookonetwo = new Book("Android Apps Security", "Sheran Gunasekera");
        bookList.add(bookonetwo);

        Book bookonethree = new Book("Cnu Android", "Ed Burnette");
        bookList.add(bookonethree);

        bookonethree = new Book("Beginning Android 3", "Mark Murphy");
        bookList.add(bookonethree);

        bookonethree = new Book("Unlocking Android", " W. Frank Ableson");
        bookList.add(bookonethree);

        bookonethree = new Book("Android Tablet Development", "Wei Meng Lee");
        bookList.add(bookonethree);

        bookonethree = new Book("Android Apps Security", "Sheran Gunasekera");
        bookList.add(bookonethree);

        mAdapter.notifyDataSetChanged();
    }
}
