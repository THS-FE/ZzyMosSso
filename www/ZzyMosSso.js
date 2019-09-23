var exec = require('cordova/exec');
/**
 * 单点中获取对应key的值
 * @param key mos_user_name  mos空间单点用户名  mos_token   mos空间单点token  mos_password    mos空间单点密码 
 * @param success 成功调用回调
 * @param error  成功失败调用回调
 */
exports.pullFromGlobal = function (key, success, error) {
    exec(success, error, 'ZzyMosSso', 'pullFromGlobal', [key]);
};
