package pamtech.com.implicitintentreceiver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TextView intentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentText = findViewById(R.id.text_uri_message);
        Intent intent = getIntent();

        Uri uri = intent.getData();

        if(uri != null){
            String uriString = "URI: " + uri.toString();
            intentText.setText(uriString);
        }


    }
}
