package com.example.gmailpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ListView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar2)
        setSupportActionBar(toolbar)

        val items = arrayListOf<ItemModel>()
        repeat(28) {
            val index = it + 1
            items.add(ItemModel(
                "Test ",
                "This week we launched the ability for any bot creator on Poe to generate revenue. This is a major step forward for the platform, and we are very excited to see what it encourages everyone to create! ",
                "18:50 PM",
                    resources.getIdentifier("account","drawable",packageName)
            ))
        }

        findViewById<ListView>(R.id.list_view).adapter = ItemAdapter(items)
    }

}