package com.hfad.mymessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_receive_message.*
import splitties.toast.toast

class ReceiveMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)

        val msg = intent.getStringExtra("message")
        messageTextView.text = msg
    }
}
