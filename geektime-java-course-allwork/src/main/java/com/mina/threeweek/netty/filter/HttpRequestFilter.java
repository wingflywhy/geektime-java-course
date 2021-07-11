package com.mina.threeweek.netty.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @Author: Xt
 * @Date: 2021-07-11
 * @Time: 11:18
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public interface HttpRequestFilter {
    void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx);

}
