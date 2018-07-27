package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.utils.EndpointTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;


@RunWith(AndroidJUnit4.class)
public class EndpointAndroidTest {

    @Test
    public void testVerifyEndpointResponse() throws Exception {
        EndpointTest test =  new EndpointTest();
        test.execute(InstrumentationRegistry.getContext());

        String piada = test.get(8, TimeUnit.SECONDS);
        int i = piada.length();
        Assert.assertEquals(92,piada.length());
    }

}
