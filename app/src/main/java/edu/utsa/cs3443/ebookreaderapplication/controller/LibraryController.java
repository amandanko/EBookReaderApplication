package edu.utsa.cs3443.ebookreaderapplication.controller;

import android.view.View;
import android.content.Intent;

import edu.utsa.cs3443.ebookreaderapplication.MainActivity;
import edu.utsa.cs3443.ebookreaderapplication.PageActivity;

public class LibraryController implements View.OnClickListener {

    MainActivity mainActivity;

    public LibraryController(MainActivity activity){
        mainActivity = activity;
    }

    @Override
    public void onClick(View v) {
        // TODO: Upon click, get the book info based on the button pushed

        // TODO: Load the book?

        // move the user to the next view
        Intent intent = new Intent( mainActivity, PageActivity.class );
        mainActivity.startActivity( intent );
    }
}
