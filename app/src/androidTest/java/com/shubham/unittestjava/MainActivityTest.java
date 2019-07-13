package com.shubham.unittestjava;

import android.widget.EditText;
import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    private MainActivity mainActivity;
    private TextView textView;
    private EditText editText;

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
        mainActivity = activityActivityTestRule.getActivity();
        textView = mainActivity.findViewById(R.id.tv_text_view);
        editText = mainActivity.findViewById(R.id.et_edit_text);

    }

    @Test
    public void testAct() {
//        assertEquals("Text View", textView.getText().toString().trim());

        assertFalse(mainActivity.isValidEmail("aa"));
    }

    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}