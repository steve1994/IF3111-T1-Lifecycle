package com.example.steve.comvogellaandroidintentexplicit;

/**
 * Created by steve on 07/02/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("yourKey");
        if (value != null) {
            TextView view = (TextView) findViewById(R.id.displayintentextra);
            view.setText(value);
        }
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        EditText text = (EditText) findViewById(R.id.returnValue);
        String convert_text = text.getText().toString();
        intent.putExtra("returnkey", convert_text);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
