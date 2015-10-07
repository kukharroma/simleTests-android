package instrumentation;

import android.content.Context;

import com.cook.simpleunittestandroid.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by roma on 07.10.15.
 */

@RunWith(MockitoJUnitRunner.class)
public class SimpleMockitoTest {

    private static final String FAKE_STRING = "Hello Word";

    @Mock
    private Context context;

    @Test
    public void readStringFromContext_LocalizedString() {
        when(context.getString(R.string.hello_word)).thenReturn(FAKE_STRING);
        HelloWord myObjectUnderTest = new HelloWord(context);
        String result = myObjectUnderTest.getHelloWord();
        assertThat(result, is(FAKE_STRING));
    }

}
