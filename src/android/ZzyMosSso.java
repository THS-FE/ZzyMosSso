package cn.com.ths.zzy.mos.sso;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cn.com.ths.zzy.mos.sso.ZConfigManager;

/**
 * This class echoes a string called from JavaScript.
 */
public class ZzyMosSso extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("pullFromGlobal")) {
            String key = args.getString(0);
            this.pullFromGlobal(key, callbackContext);
            return true;
        }
        return false;
    }

    private void pullFromGlobal(String key, CallbackContext callbackContext) {
        if (key != null && key.length() > 0) {
            String res = ZConfigManager.pullFromGlobal(key);
            if(res!=null){
                callbackContext.success(res);
            }else{
                callbackContext.error("Return a empty resoult");
            }
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
