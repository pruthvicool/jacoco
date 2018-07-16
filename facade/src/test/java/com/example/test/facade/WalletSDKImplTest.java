package com.example.test.facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletSDKImplTest {
    @Test
    public void test() throws Exception {

        assertEquals("From comms", new WalletSDKImpl().getData());
    }
}