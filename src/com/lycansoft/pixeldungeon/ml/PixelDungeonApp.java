package com.lycansoft.pixeldungeon.ml;

import android.app.Application;

public class PixelDungeonApp extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		try {
			Class.forName("android.os.AsyncTask");
		} catch (Throwable ignore) {
		}
	}
}
