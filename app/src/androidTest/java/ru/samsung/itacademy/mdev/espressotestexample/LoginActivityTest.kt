package ru.samsung.itacademy.mdev.espressotestexample

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class LoginActivityTest{
    @Rule
    @JvmField
    var activityRule = ActivityTestRule<LoginActivity>(
        LoginActivity::class.java
    )

    private val username = "emityakov"
    private val password = "password"

    @Test
    fun clickLoginButton() {
        onView(withId(R.id.et_username)).perform(ViewActions.typeText(username))
        onView(withId(R.id.et_password)).perform(ViewActions.typeText(password))

        onView(withId(R.id.btn_submit)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tv_login))
            .check(matches(withText("Success")))
    }

}