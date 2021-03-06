package com.mina.classLoader;

import java.util.Base64;

/**
 * @Author: Xt
 * @Date: 2021-06-26
 * @Time: 15:40
 * Copyright © BaiJiaHuLian All Rights Reserved.
 */
public class HelloClassLoader extends ClassLoader {
    public static void main(String... args) throws Exception {
        new HelloClassLoader().findClass("com.mina.classLoader.Hello").newInstance();
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String helloBase64 = "yv66vgAAADQASAoAFgAiBkAAAAAAAAAABQAAAAAAAAADCAAjCgAkACUJACYAJwcAKAoACQAiCAApCgAJACoKAAkAKwoACQAsCgAJAC0KAC4ALwgAMAoALgAxCgAuADIIADMHADQHADUBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQAEbWFpbgEAFihbTGphdmEvbGFuZy9TdHJpbmc7KVYBAA1TdGFja01hcFRhYmxlBwA2AQAIPGNsaW5pdD4BAApTb3VyY2VGaWxlAQAKSGVsbG8uamF2YQwAFwAYAQAABwA3DAA4ADkHADoMADsAPAEAF2phdmEvbGFuZy9TdHJpbmdCdWlsZGVyAQAc6ZSZ6K+v55So5rOVOiBudW0yICsgbnVtMyA9IAwAPQA+DAA9AD8MAD0AQAwAQQBCBwBDDABEAEUBABzlm5vliJnov5Dnrpc6IG51bTEgKiBudW00ID0gDABGAEUMAEQARwEAF0hlbGxvIGNsYXNzIEluaXRpYWxpemVkAQAaY29tL21pbmEvY2xhc3NMb2FkZXIvSGVsbG8BABBqYXZhL2xhbmcvT2JqZWN0AQATW0xqYXZhL2xhbmcvU3RyaW5nOwEAEGphdmEvbGFuZy9TdHJpbmcBAAZsZW5ndGgBAAMoKUkBABBqYXZhL2xhbmcvU3lzdGVtAQADb3V0AQAVTGphdmEvaW8vUHJpbnRTdHJlYW07AQAGYXBwZW5kAQAtKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1N0cmluZ0J1aWxkZXI7AQAcKEQpTGphdmEvbGFuZy9TdHJpbmdCdWlsZGVyOwEAHChKKUxqYXZhL2xhbmcvU3RyaW5nQnVpbGRlcjsBAAh0b1N0cmluZwEAFCgpTGphdmEvbGFuZy9TdHJpbmc7AQATamF2YS9pby9QcmludFN0cmVhbQEAB3ByaW50bG4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYBAAVwcmludAEABChJKVYAIQAVABYAAAAAAAMAAQAXABgAAQAZAAAAHQABAAEAAAAFKrcAAbEAAAABABoAAAAGAAEAAAAJAAkAGwAcAAEAGQAAALUABAAIAAAAWAQ8FAACSRQABDcEBzYGEga2AAcQCqIAIbIACLsACVm3AAoSC7YADCi2AA0WBLYADrYAD7YAEAM2BxUHG6IAG7IACBIRtgASsgAIGxUGaLYAE4QHAaf/5bEAAAACABoAAAAuAAsAAAAOAAIADwAGABAACwARAA4AEgAYABQANgAWAD8AGABHABkAUQAWAFcAGwAdAAAAFwAD/wA2AAUHAB4BAwQBAAD8AAIB+gAdAAgAHwAYAAEAGQAAACUAAgAAAAAACbIACBIUtgAQsQAAAAEAGgAAAAoAAgAAAAsACAAMAAEAIAAAAAIAIQ==";
        byte[] bytes = decode(helloBase64);
        return defineClass(name, bytes, 0, bytes.length);
    }

    public byte[] decode(String base64) {
        return Base64.getDecoder().decode(base64);
    }

}
