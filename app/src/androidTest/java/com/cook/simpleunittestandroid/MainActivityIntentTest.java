package com.cook.simpleunittestandroid;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import instrumentation.activity.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by roma on 07.10.15.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityIntentTest {

    @Rule
    public IntentsTestRule<MainActivity> rule = new IntentsTestRule(MainActivity.class);

    @Test
    public void testIntent() {
        onView(withId(R.id.bt_show_activity)).perform(click());
        intended(toPackage("com.cook.simpleunittestandroid"));
    }

}
