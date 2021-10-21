package com.seungmin.instagram.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
