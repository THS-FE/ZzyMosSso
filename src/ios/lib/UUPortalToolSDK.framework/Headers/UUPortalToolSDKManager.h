//
//  UUPortalToolSDKManager.h
//  UUPortalToolSDK
//
//  Created by feng on 2018/8/21.
//  Copyright © 2018年 feng. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface UUPortalToolSDKManager : NSObject

/**
 * @zpi
 * @description
 * 安装安全卫士
 * 需要在集成的项目TARGETS -> Capabilities -> Keychain Sharing 开启keychain并且添加Keychain Groups: "com.uusafe.portal"
 * @return 为空的时候返回值为:@"" ，非沙箱应用无权限获取返回值为"no_permission"
 * @example
 *  // TODO
    NSString *name = [UUPortalToolSDKManager userName];
 */
+ (NSString *)userName;

+ (NSString *)password;

+ (NSString *)companyCode;

+ (NSString *)token;

@end
