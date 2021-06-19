package com.a360vrsh.library.util;

import com.tencent.mmkv.MMKV;

/**
 * @author: wxj
 * @date: 2020/9/21
 * @description:
 */
public class MMKVUtil {
    public static final String TOKEN = "TOKEN";
    public static final String PHONE = "phone";
    public static final String PWD = "pwd";
    public static final String REMEMBER_PWD = "remember_pwd";
    public static final String SHOW_BALANCE = "show_balance";
    public static final String USER_ID = "user_id";
    public static final String UNIQUE_ID = "unique_id";

    //仅wifi下自动上传
    public static final String AUTO_UPLOAD_WIFI = "auto_upload_only_wifi";
    //所有网络自动上传
    public static final String AUTO_UPLOAD_ALL = "auto_upload_all";

    public static void putString(String key, String value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    public static String getString(String key) {
        return MMKV.defaultMMKV().decodeString(key, "");
    }

    public static String getString(String key, String defaultValue) {
        return MMKV.defaultMMKV().decodeString(key, defaultValue);
    }

    public static void putInt(String key, int value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    public static int getInt(String key) {
        return MMKV.defaultMMKV().decodeInt(key, 0);
    }

    public static int getInt(String key, int defaultValue) {
        return MMKV.defaultMMKV().decodeInt(key, defaultValue);
    }

    public static void putBool(String key, Boolean value) {
        MMKV.defaultMMKV().encode(key, value);
    }

    public static boolean getBool(String key) {
        return MMKV.defaultMMKV().decodeBool(key, false);
    }

    public static boolean getBool(String key, Boolean defaultValue) {
        return MMKV.defaultMMKV().decodeBool(key, defaultValue);
    }

    public static void clearLoginInfo() {
        MMKV.defaultMMKV().remove(MMKVUtil.TOKEN);
    }

    public static void saveToken(String token) {
        putString(MMKVUtil.TOKEN, token);
    }

    public static String getToken() {
        return getString(TOKEN, "");
    }

    public static String getPhone() {
        return getString(PHONE, "");
    }

    public static void saveUserId(String userid) {
        putString(USER_ID, userid);
    }

    public static String getUserId() {
        return getString(USER_ID, "");
    }


    public static void saveAutoUploadWifi(boolean isAuto) {
        putBool(AUTO_UPLOAD_WIFI, isAuto);
    }

    public static boolean getAutoUploadWifi() {
        return getBool(AUTO_UPLOAD_WIFI, false);
    }

    public static void saveAutoUploadAll(boolean isAuto) {
        putBool(AUTO_UPLOAD_ALL, isAuto);
    }

    public static boolean getAutoUploadAll() {
        return getBool(AUTO_UPLOAD_ALL, false);
    }

    public static void saveUniqueId(String value) {
        putString(UNIQUE_ID, value);
    }

    public static String getUniqueId() {
       return  getString(UNIQUE_ID, "");
    }
}

