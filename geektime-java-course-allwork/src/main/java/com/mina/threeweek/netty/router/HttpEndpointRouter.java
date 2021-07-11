package com.mina.threeweek.netty.router;

import java.util.List;

/**
 * @Author: Xt
 * @Date: 2021-07-11
 * @Time: 11:20
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public interface HttpEndpointRouter {
    String route(List<String> endpoints);
}
