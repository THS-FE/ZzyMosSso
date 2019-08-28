package com.uusafe.demo;

import android.util.Log;

import com.zzy.engine.app.sdk.ZManager;
import com.zzy.engine.app.sdk.module.ZModuleConfig;

/**
 * 封装uusafe-engine-app-sdk-function-*.aar sdk的调用
 */

public class ZConfigManager {
    private static final String TAG = "ZConfigManager";

    /**
     * 获取配置信息
     *
     * @param key 获取配置信息的key
     * @return key对应用的配置信息
     */
    public static String pullFromGlobal(String key) {
        try {
            ZModuleConfig zmc = (ZModuleConfig) ZManager.getModule(ZManager.MODULE_CONFIG);
            if (null != zmc) {
                return zmc.pullFromGlobal(key);
            } else {
                Log.e(TAG,"pullFromGlobal, ZModuleConfig is null!");
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return null;
    }
}
