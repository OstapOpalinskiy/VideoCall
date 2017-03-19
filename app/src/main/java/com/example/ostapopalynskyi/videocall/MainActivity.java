package com.example.ostapopalynskyi.videocall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.quickblox.auth.session.QBSettings;

public class MainActivity extends AppCompatActivity {
    private static final String APP_ID = "55020";
    private static final String AUTH_KEY = "SA2EU8jW93fmfem";
    private static final String AUTH_SECRET = "uykpkKrHMTghNFN";
    private static final String ACCOUNT_KEY = "55020";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QBSettings.getInstance().init(getApplicationContext(), APP_ID, AUTH_KEY, AUTH_SECRET);
        QBSettings.getInstance().setAccountKey(ACCOUNT_KEY);
    }
}
