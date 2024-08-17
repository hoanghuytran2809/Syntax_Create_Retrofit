package com.example.syntax_create_retrofit

import android.app.Application

class DemoApplication : Application() {
    companion object {
        lateinit var instance: DemoApplication
            private set
    }
}