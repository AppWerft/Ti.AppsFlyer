/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.appsflyer;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;

import com.appsflyer.AppsFlyerLib;

@Kroll.module(name = "Tiappsflyer", id = "ti.appsflyer")
public class TiappsflyerModule extends KrollModule {

	// Standard Debugging variables
	private TiProperties appProperties;
	private static final String LCAT = "AppsFlyer 🎏🎏🎏";
	String appId;
	String devKey;
	AppsFlyerLib appsFlyer;
	TiApplication ctx = TiApplication.getInstance();

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public TiappsflyerModule() {
		super();
		this.appsFlyer = AppsFlyerLib.getInstance();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
	}

	// Methods
	private void importProperties() {
		appProperties = TiApplication.getInstance().getAppProperties();
		this.appId = appProperties.getString("APPID", "");
		this.devKey = appProperties.getString("DEVKEY", "");
		if (appId.equals(""))
			Log.e(LCAT, "Don't forget appID");

	}

	@Kroll.method
	public void startTracker() {
		importProperties();
		this.appsFlyer.setAppId(appId);
		appsFlyer.trackAppLaunch(ctx, devKey);
	}

	@Kroll.method
	public void trackAction(String eventName, KrollDict dict) {
		if (dict != null) {
			appsFlyer.trackEvent(ctx, eventName, dict);
		}
	}
}