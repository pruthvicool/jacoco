package com.example.test.facade;

import com.example.test.inner.CommsService;

/**
 * Created by e050010 on 7/16/2018.
 */

class WalletSDKImpl {
    public String getData() {

        CommsService commsService = new CommsService();
        return commsService.getData();
    }
}
