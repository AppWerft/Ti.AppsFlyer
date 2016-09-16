#Ti.AppsFlyer

This TitaniumModule supports AppsFlyer.  It is o project of Eric <img src="http://i.imgur.com/MUQN5dC.png" width=100 /> and Rainer.

##Common marketing blahblah
AppsFlyer is the market leader in mobile advertising attribution & analytics, helping marketers to pinpoint their targeting, optimize their ad spend and boost their ROI.

<img src="https://www.appsflyer.com/wp-content/uploads/2014/11/New-HP2-new-dashboard.png" width=600 />


##Usage


In tiapp.xml you need three entries:
```xml
<property name="APPSFLYER_APPID" type="string">dp</property>
<property name="APPSFLYER_DEVKEY" type="string">dp</property>
```


```javascript
var AppsFlyer = require("ti.appsflyer");

AppsFlyer.trackAppLaunch();

AppsFlyer.trackAction("actionName",{
    key : value
});





```
