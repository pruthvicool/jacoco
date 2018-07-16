package com.example.test.inner;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class InnerTest {
    @Test
    public void test() throws Exception {
        assertEquals("From comms" , new CommsService().getData());
    }
}