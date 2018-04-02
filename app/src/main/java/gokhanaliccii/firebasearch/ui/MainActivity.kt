package gokhanaliccii.firebasearch.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import gokhanaliccii.firebasearch.R
import gokhanaliccii.firebasearch.datasource.model.User
import gokhanaliccii.firebasearch.datasource.repository.core.DataIndentListener
import gokhanaliccii.firebasearch.datasource.repository.user.UserRepository

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firebaseDB = FirebaseDatabase.getInstance()
        val userModelRef = firebaseDB.getReference("user")

        val user = User("begum", "alıcı", 25)

        val userRepository = UserRepository(userModelRef)
        userRepository.saveData(user, object : DataIndentListener {

            override fun onIndentSucceed() {
                Log.i(TAG, "onIndentSucceed")
            }

            override fun onIndentFailed() {
                Log.i(TAG, "onIndentFailed")
            }
        })

    }
}