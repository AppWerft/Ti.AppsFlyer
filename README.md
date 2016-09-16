#Ti.AppsFlyer

This TitaniumModule supports AppsFlyer.  It is o project of Eric <img src="http://i.imgur.com/MUQN5dC.png" width=100 /> and Rainer.

##Common marketing blahblah
AppsFlyer is the market leader in mobile advertising attribution & analytics, helping marketers to pinpoint their targeting, optimize their ad spend and boost their ROI.

<img src="https://www.appsflyer.com/wp-content/uploads/2014/11/New-HP2-new-dashboard.png" width=600 />


<img src="https://p4.zdassets.com/hc/settings_assets/245528/200043866/aWa5hxlb4xgSr0OYtvjxKQ-AppsFlyer_-_Logo.png">

##Usage


In tiapp.xml you need three entries:
```xml
<property name="APPSFLYER_APPID" type="string">dp</property>
<property name="APPSFLYER_DEVKEY" type="string">dp</property>
```
The AndroidManifest.xml should include the following permissions:

```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" /> 
```
* READ_PHONE_STATE permission is optional.

```xml
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
```

Adding this permission enables carrier tracking of IMEI (required for tracking outside of Google Play).


```javascript
var AppsFlyer = require("ti.appsflyer");

AppsFlyer.trackAppLaunch();

AppsFlyer.trackAction("actionName",{
    key : value
});





```
