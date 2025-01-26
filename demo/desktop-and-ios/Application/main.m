#import <UIKit/UIKit.h>
#import <TargetConditionals.h>
#import <Availability.h>
#import <WgpuApp/WgpuApp.h>

@interface AppDelegate : UIResponder <UIApplicationDelegate>

@property (strong, nonatomic) WgpuAppAppDelegate *appAppDelegate;

@end


int main(int argc, char * argv[]) {
    @autoreleasepool {
        return UIApplicationMain(argc, argv, nil, NSStringFromClass([AppDelegate class]));
    }
}

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)options {
    self.appAppDelegate = [WgpuAppAppDelegate new];
    [self.appAppDelegate applicationApplication:application didFinishLaunchingWithOptions:options];
    return YES;
}

@end
