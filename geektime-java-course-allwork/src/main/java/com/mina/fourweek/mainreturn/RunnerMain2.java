package com.mina.fourweek.mainreturn;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Xt
 * @Date: 2021-07-18
 * @Time: 21:50
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public class RunnerMain2 {

    private ExecutorService executor;

    public static void main(String... args) {
        CompletableFuture<String> res = asyncGetUserInfo();

        try {
            res.get(100, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
        }
    }


    public CompletableFuture<String> asyncGetUserInfo() {
        CompletableFuture<String> res = CompletableFuture
                .supplyAsync(() -> getUserLabelMapInfo(), executor);
        return res;
    }


    public String getUserLabelMapInfo() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        return "success";
    }
}
