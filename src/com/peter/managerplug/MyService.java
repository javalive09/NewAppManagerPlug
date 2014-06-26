package com.peter.managerplug;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Toast.makeText(this, "Plug Service onStartCommand()", Toast.LENGTH_SHORT).show();
		return START_NOT_STICKY;
	}

	@Override
	public void onCreate() {
		Toast.makeText(this, "Plug Service onCreate()", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "Plug Service onDestroy()", Toast.LENGTH_SHORT).show();
	}
}
