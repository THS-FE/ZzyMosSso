/********* ZzyMosSso.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>
#import <UUPortalToolSDK/UUPortalToolSDK.h>
@interface ZzyMosSso : CDVPlugin {
  // Member variables go here.
}

- (void)pullFromGlobal:(CDVInvokedUrlCommand*)command;
@end

@implementation ZzyMosSso

- (void)pullFromGlobal:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];
    // get mos data
    // 定义获取数据key
    NSString* mos_username = [NSString stringWithFormat:@"mos_username"];
    NSString* mos_token = [NSString stringWithFormat:@"mos_token"];
    NSString* mos_password = [NSString stringWithFormat:@"mos_password"];
    // 判断传入的key值是否有效
    if (echo != nil && [echo length] > 0) {
        // 默认返回为Return a empty result
        NSString *result = @"Return a empty result";
        if ([echo isEqualToString:mos_username]) {
           //通過ＳＤＫ 獲取username
           result = [UUPortalToolSDKManager userName];
           NSLog(@"mos_username");
        }else if ([echo isEqualToString:mos_token]){
            //通過ＳＤＫ 獲取token
           result = [UUPortalToolSDKManager token];
           NSLog(@"mos_token");
        }else if ([echo isEqualToString:mos_password]){
            //通過ＳＤＫ 獲取password
           result = [UUPortalToolSDKManager password];
           NSLog(@"mos_password");
        }
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:result];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
