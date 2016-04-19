package com.epicodus.madlibs;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText(){
        onView(withId(R.id.nameInput)).perform(typeText("Jamal"))
                .check(matches(withText("Jamal")));
    }
    @Test
    public void inputNameSentToStoryActivity(){
        String name = "Jamal";
        onView(withId(R.id.nameInput)).perform(typeText(name));
        Espresso.closeSoftKeyboard();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.submit)).perform(click());
        onView(withId(R.id.storyText)).check(matches(withText("Jamal went to  on a  day. A   was  in front of all of the  people")));

    }
}
