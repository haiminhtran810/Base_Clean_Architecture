package com.htm.base_clean_architecture.ui

import android.os.Bundle
import com.htm.base_clean_architecture.R
import com.htm.base_clean_architecture.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}