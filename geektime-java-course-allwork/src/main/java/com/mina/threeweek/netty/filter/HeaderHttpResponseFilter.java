package com.mina.threeweek.netty.filter;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @Author: Xt
 * @Date: 2021-07-11
 * @Time: 11:12
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public class HeaderHttpResponseFilter implements HttpResponseFilter {

    @Override
    public void filter(FullHttpResponse response) {
        response.headers().set("kk", "java-response-filter-add");
    }
}
