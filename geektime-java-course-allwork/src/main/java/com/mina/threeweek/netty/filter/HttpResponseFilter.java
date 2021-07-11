package com.mina.threeweek.netty.filter;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @Author: Xt
 * @Date: 2021-07-11
 * @Time: 11:11
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public interface HttpResponseFilter {
    void filter(FullHttpResponse response);
}
