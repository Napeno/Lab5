package com.example.exercise2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class PowerStateChangeReceiver extends BroadcastReceiver {
    private static final String TAG = "PowerStateChangeReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (context == null) return;

        Log.d(TAG, "onReceive: " + intent.getAction());

        if (intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)) {
            Toast.makeText(context, context.getString(R.string.power_connected), Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equals(Intent.ACTION_POWER_DISCONNECTED)) {
            Toast.makeText(context, context.getString(R.string.power_disconnected), Toast.LENGTH_LONG).show();
        }
    }
}
