package ru.samsung.itacademy.mdev.espressotestexample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(
        MainActivity::class.java
    )

    @Test
    @Throws(Exception::class)
    fun clickLoginButton() {
        onView(withId(R.id.btn_login))
        onView(withId(R.id.btn_login)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_login)).perform(click())
    }
}