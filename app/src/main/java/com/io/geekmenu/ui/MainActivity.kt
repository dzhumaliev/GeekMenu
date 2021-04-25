package com.io.geekmenu.ui

import android.os.Bundle
import com.io.geekmenu.R
import com.io.geekmenu.base.activity.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}