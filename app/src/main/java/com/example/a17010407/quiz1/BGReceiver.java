package com.example.a17010407.quiz1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BGReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context,"You have change the wallpaper",Toast.LENGTH_LONG);
        my_toast.show();
    }
}
