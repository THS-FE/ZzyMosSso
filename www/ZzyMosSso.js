var exec = require('cordova/exec');

exports.pullFromGlobal = function (key, success, error) {
    exec(success, error, 'ZzyMosSso', 'pullFromGlobal', [key]);
};
