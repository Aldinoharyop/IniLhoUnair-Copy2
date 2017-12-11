package com.example.aldino.inilhounair;

import android.support.test.rule.ActivityTestRule;
import android.widget.SearchView;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

/**
 * Created by Aldino on 21/11/2017.
 */
public class ListProdiTest {

    @Rule
    public ActivityTestRule<ListProdi> listProdiActivityTestRule = new ActivityTestRule<ListProdi>(ListProdi.class);

    private ListProdi listProdi = null;

    @Before
    public void setUp() throws Exception {
        listProdi = listProdiActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
       SearchView searchView = (SearchView) listProdi.findViewById(R.id.searchProdi);
       assertNotNull(searchView);
    }

    @After
    public void tearDown() throws Exception {
        listProdi = null;
    }

}