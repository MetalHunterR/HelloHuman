package com.dreambigstudios.hellohuman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstName, lastName;
    Button hiButton;
    TextView hiText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);

        hiText = (TextView) findViewById(R.id.greet);

        hiButton = (Button) findViewById(R.id.sayHi);
        hiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstName.getText().toString().equalsIgnoreCase("")) {
                    if(!lastName.getText().toString().equalsIgnoreCase("")) {
                        hiText.setText("Hi " + firstName.getText().toString() + " " + lastName.getText().toString());
                    } else {
                        hiText.setText("Last Name is Missing!");
                    }
                } else {
                    hiText.setText("First Name is Missing!");
                }
            }
        });
    }
}
