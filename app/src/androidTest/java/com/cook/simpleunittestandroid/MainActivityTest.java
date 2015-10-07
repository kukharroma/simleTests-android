package com.cook.simpleunittestandroid;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import instrumentation.activity.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by roma on 07.10.15.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testShowTextView() {
        onView(withId(getResourceId("bt_show_text_view"))).perform(click());
        onView(withId(getResourceId("textView"))).check(matches(withText(R.string.hello_word)));
    }

    @Test
    public void testShowActivity() {
        onView(withId(getResourceId("bt_show_activity"))).perform(click());
        onView(withId(getResourceId("resultView"))).check(matches(withText("Second Activity")));

    }

    private static int getResourceId(String s) {
        Context targetContext = InstrumentationRegistry.getTargetContext();
        String packageName = targetContext.getPackageName();
        return targetContext.getResources().getIdentifier(s, "id", packageName);
    }

}
