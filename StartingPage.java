package com.example.legol.test2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnKeyListener;

public class StartingPage extends Activity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting_page);

        editText = (EditText)findViewById(R.id.edtPassword);

        editText.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    switch (keyCode) {
                        case KeyEvent.KEYCODE_DPAD_CENTER:
                        case KeyEvent.KEYCODE_ENTER:
                            loginPage(v);
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }
        });
    }

    public void loginPage(View view)
    {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
    }

    public void ShowGreetings(View view) {
        String message = "Hey";
        textView.setText(message);


    }

        public void Show() {
            String message = "Hey";
            textView.setText(message);
        }

    }





