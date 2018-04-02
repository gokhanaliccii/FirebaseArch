package gokhanaliccii.firebasearch.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import gokhanaliccii.firebasearch.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firebaseDB = FirebaseDatabase.getInstance()
        val userTableRef = firebaseDB.getReference("user")

        userTableRef.setValue("sample", "sdsdds")
    }
}