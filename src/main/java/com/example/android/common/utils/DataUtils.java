package com.example.android.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.nio.ByteBuffer;
import java.util.Date;
import java.util.UUID;

/**
 * @author Chris
 * @version 1.0.0
 * @date 2/17/21
 */
public class DataUtils {

    private static final String URL_PREFIX = "https://springboot.net.cn/";
    private static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 传入base64编码后的字符串，返回解码后的byte[]
     *
     * @param data base64编码
     * @return byte[]
     */
    public static byte[] base64Decode(String data) {
        return Base64.decode(data, Base64.NO_WRAP);
    }

    public static String base64Encode(byte[] data) {
        return Base64.encodeToString(data, Base64.NO_WRAP);
    }

    /**
     * 将 int 转换为 byte[]，一个 int 对应 4 个 byte
     *
     * @param data int 型数据
     * @return byte[]
     */
    public static byte[] int2Byte(int data) {
        // int 是4个字节
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.putInt(data);
        return buffer.array();
    }

    public static int byte2Int(byte[] data) {
        ByteBuffer buffer = ByteBuffer.wrap(data);
        return buffer.getInt();
    }

    public static String fillUrl(String uri) {
        if (StringUtils.isNotBlank(uri)) {
            if (StringUtils.startsWith(uri, "/")) {
                uri = StringUtils.substring(uri, 1);
            }
            return URL_PREFIX + uri;
        }
        return StringUtils.EMPTY;
    }

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String formatDate() {
        return formatDate(DATE_PATTERN);
    }

    public static String formatDate(Date date) {
        return formatDate(date, DATE_PATTERN);
    }

    public static String formatDate(String pattern) {
        return FastDateFormat.getInstance(pattern).format(new Date());
    }

    public static String formatDate(Date date, String pattern) {
        return FastDateFormat.getInstance(pattern).format(date);
    }
}
