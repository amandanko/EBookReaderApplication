package edu.utsa.cs3443.ebookreaderapplication;

import androidx.appcompat.app.AppCompatActivity;
import edu.utsa.cs3443.ebookreaderapplication.controller.LibraryController;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect the button to the listener (controller)
        LibraryController libraryController = new LibraryController( this );  // init the controller
        Button button1 = findViewById( R.id.button1 );                  // get access to the button
        button1.setOnClickListener( libraryController );                // connect them!
    }
}