package com.example.app;

import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class InstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test() throws Exception {
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(2));
        assertTrue(true);
    }

}
