package com.mina.threeweek.netty.router;

import java.util.List;
import java.util.Random;

/**
 * @Author: Xt
 * @Date: 2021-07-11
 * @Time: 11:20
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public class RandomHttpEndpointRouter implements HttpEndpointRouter {

    @Override
    public String route(List<String> urls) {
        int size = urls.size();
        Random random = new Random(System.currentTimeMillis());
        return urls.get(random.nextInt(size));
    }
}
