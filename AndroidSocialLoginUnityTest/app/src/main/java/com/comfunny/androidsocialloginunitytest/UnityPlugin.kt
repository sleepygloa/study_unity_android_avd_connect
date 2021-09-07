package com.comfunny.androidsocialloginunitytest

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import com.unity3d.player.UnityPlayerActivity

class UnityPlugin : UnityPlayerActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        Log.d(TAG, "oncreate");
    }
}