package com.example.studyspringboot.util.nio;


import java.nio.*;

/**
 * Nio 基础知识：
 * 重点：io 和 nio 区别
 * io ：同步，阻塞
 * nio:new io ,同步，非阻塞 （ 通道[传输]，缓冲区[数据存储]）
 * aio:异步，非阻塞
 */
public class NioUtils {

    public static void main(String[] args) {
        /**
         * 了解 buffer
         */
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put("abcd".getBytes());
        // 开启读取模式
        byteBuffer.flip();
        byte[] a = new byte[byteBuffer.limit()];
        byteBuffer.get(a,0,byteBuffer.limit());
        System.out.println(byteBuffer.position());
    }


}
