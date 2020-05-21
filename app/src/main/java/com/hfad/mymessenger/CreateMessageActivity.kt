package com.hfad.mymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_message.*
import org.jetbrains.anko.email
import org.jetbrains.anko.sendSMS
import org.jetbrains.anko.share
import org.jetbrains.anko.startActivity
import splitties.activities.start
import splitties.views.onClick
import com.hfad.mymessenger.ReceiveMessageActivity as ReceiveMessageActivity
import android.widget.EditText


class CreateMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)

        // 버튼을 클릭하면build onClick 호출
        send.onClick {
            val sendMessage = messageEditText.text.toString()
            start<ReceiveMessageActivity>   {
                putExtra("message",sendMessage)
            }
        }
    }
}
