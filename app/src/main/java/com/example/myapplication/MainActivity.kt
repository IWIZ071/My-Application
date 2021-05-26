package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.crashlytics.CustomKeysAndValues
import com.google.firebase.crashlytics.FirebaseCrashlytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val keysAndValues = CustomKeysAndValues.Builder()
            .putString("string key", "Test")
            .putString("string key 2", "string  value 2")
            .putBoolean("boolean key", true)
            .putBoolean("boolean key 2", false)
            .putFloat("float key", 1.01f)
            .putFloat("float key 2", 2.02f)
            .build()

        FirebaseCrashlytics.getInstance().setCustomKeys(keysAndValues)
        FirebaseCrashlytics.getInstance().setUserId("12345")

//        crash()
//        try {
//            crash()
//        } catch (e: Exception) {
//            FirebaseCrashlytics.getInstance().recordException(e)
//            // ...handle the exception.
//        }
    }

    private fun crash(){
        throw IllegalAccessException("Crash")
    }
}