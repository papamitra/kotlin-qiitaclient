package sample.qiitaclient

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.view.View
import org.hamcrest.Matcher
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by maueki on 17/07/14.
 */

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @JvmField
    @Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java)


    @Test
    fun 各ビューが表示されていること_ただしプログレスバーは非表示() {
        onView(withId(R.id.listView)).check(matches(isDisplayed()))
        onView(withId(R.id.queryEditText)).check(matches(isDisplayed()))
        onView(withId(R.id.searchButton)).check(matches(isDisplayed()))
        onView(withId(R.id.prograssBar)).check((matches(isNotDisplayed())))

    }

    fun isNotDisplayed(): Matcher<View> = not(isDisplayed())

}