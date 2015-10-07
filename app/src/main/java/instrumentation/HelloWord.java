package instrumentation;

import android.content.Context;

import com.cook.simpleunittestandroid.R;

/**
 * Created by roma on 07.10.15.
 */
public class HelloWord {

    private Context context;

    public HelloWord(Context context) {
        this.context = context;
    }

    public String getHelloWord() {
        return context.getString(R.string.hello_word);
    }
}
