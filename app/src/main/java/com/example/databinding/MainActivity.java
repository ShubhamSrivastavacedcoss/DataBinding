package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    BookModel bookModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        bookModel = new BookModel();
        bookModel.setBook("yes");
        bookModel.setAuthor("Moorne");
        activityMainBinding.setBooks(bookModel);

      //  bookModel = activityMainBinding.getBooks();
      /*  activityMainBinding.book.setText("how abt a sin tonight");
        activityMainBinding.author.setText("David Moorne");*/


    }
}