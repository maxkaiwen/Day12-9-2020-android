package com.example.day12_9_2020_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.ActionBar
//import kotlinx.android.synthetic.main.content_state_change.*

class MainActivity : AppCompatActivity() {
    var d = ""
    var tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        This method is for when android first creates an activity and
        then moves to the onStart method
         */
        Log.d(tag, "======OnCreateCallBack")
        setContentView(R.layout.activity_main)


    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val name = findViewById<EditText>(R.id.myText)
        var nameText = name.text
        //Log.d(tag, "======OnSaveInstanceState")
        outState?.putCharSequence("savedText", nameText)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        var nameBox = findViewById<EditText>(R.id.myText)
        val nameText = savedInstanceState.getCharSequence("savedText")
        nameBox.setText(nameText)
    }


    override fun onStart() {
        super.onStart()
        Log.d(tag,"======OnStartCallBack")
        /*
        This makes the activity visible to the user and displays the UI then it moves
        to the Resumed state

         */

    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"======OnResumeCallBack")
        /* This is when the user interacts with an activity and stays in this state
        until something happens that will take focus away from the this activity.

         */

    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"======OnPauseCallBack")
        /*
        This is when focus is no longer on the activity but the user will come back to it
        very soon, such as being interrupted by a pop up. It goes back to resume
        when the user comes back
         */

    }

    override fun onStop(){
        super.onStop()
        Log.d(tag,"======OnStopCallBack")
        /*
        This is when the activity is not visible to the user
        such as if they go to another activity. From here it can Restart
        or be destroyed
         */
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"======OnRestartCallBack")
        /*
        Restart is the method used to bring an activity back to the onStart method after stopping
         */

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"======OnDestroyCallBack")
        /*
        This is for when an activity is destroyed to free up resources
         */
    }
}