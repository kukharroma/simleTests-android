package instrumentation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cook.simpleunittestandroid.R;

/**
 * Created by roma on 07.10.15.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
