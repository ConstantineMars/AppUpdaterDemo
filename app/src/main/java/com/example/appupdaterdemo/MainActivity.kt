package com.example.appupdaterdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.javiersantos.appupdater.AppUpdater
import com.github.javiersantos.appupdater.enums.Display
import com.github.javiersantos.appupdater.enums.UpdateFrom
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        version.text = "Current version: ${BuildConfig.VERSION_NAME}"

        val appUpdater = AppUpdater(this)
                .setDisplay(Display.DIALOG)
                .setUpdateFrom(UpdateFrom.JSON)
                .setUpdateJSON("https://raw.githubusercontent.com/ConstantineMars/AppUpdaterDemo/1.2.2/app/update.json")
                .setIcon(R.drawable.ic_system_update_black_24dp)
        appUpdater.start()
    }
}
