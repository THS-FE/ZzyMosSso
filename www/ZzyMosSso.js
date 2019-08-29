var exec = require('cordova/exec');
/**
 * 单点中获取对应key的值
 * @param mos_username  mos空间单点用户名
 * @param mos_token   mos空间单点token
 * @param mos_password    mos空间单点密码 
 */
exports.pullFromGlobal = function (key, success, error) {
    exec(success, error, 'ZzyMosSso', 'pullFromGlobal', [key]);
};
