package instrumentation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cook.simpleunittestandroid.R;

/**
 * Created by roma on 07.10.15.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btShowTextView;
    private Button btShowActivity;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btShowTextView = (Button) findViewById(R.id.bt_show_text_view);
        btShowActivity = (Button) findViewById(R.id.bt_show_activity);
        textView = (TextView) findViewById(R.id.textView);

        btShowTextView.setOnClickListener(this);
        btShowActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_show_text_view: {
                textView.setText(getString(R.string.hello_word));
                break;
            }
            case R.id.bt_show_activity: {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
