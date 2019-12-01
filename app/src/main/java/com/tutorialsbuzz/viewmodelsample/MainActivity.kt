package com.tutorialsbuzz.viewmodelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mainActivityViewModel =
            ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        
        mainActivityViewModel.myRandomNumber.observe(this, Observer {
            tvNumber.text = it
        })

        update.setOnClickListener({
            mainActivityViewModel.createRandomNumber()
        })

    }
}
