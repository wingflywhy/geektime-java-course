package com.mina.threeweek.netty.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @Author: Xt
 * @Date: 2021-07-11
 * @Time: 11:18
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public class HeaderHttpRequestFilter implements HttpRequestFilter{
    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        fullRequest.headers().set("mao", "http-request-filter-add");
    }
}
