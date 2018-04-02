package gokhanaliccii.firebasearch.datasource.repository.user

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import gokhanaliccii.firebasearch.datasource.model.User
import gokhanaliccii.firebasearch.datasource.repository.core.DataIndentListener
import gokhanaliccii.firebasearch.datasource.repository.core.DataLoadListener
import gokhanaliccii.firebasearch.datasource.repository.core.Repository

/**
 * Created by gokhan on 02/04/18.
 */
class UserRepository(dbRef: DatabaseReference) : Repository<User> {

    private var dbReference: DatabaseReference = dbRef

    override fun loadData(dataLoadListener: DataLoadListener<User>) {
        dbReference.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError?) {

            }

            override fun onDataChange(p0: DataSnapshot?) {

                dataLoadListener.onDataListLoaded(emptyList())
            }

        })
    }

    override fun saveData(data: User, indentListener: DataIndentListener) {
        dbReference.setValue(data) { error, dbRef ->
            if (error == null)
                indentListener.onIndentSucceed()
            else
                indentListener.onIndentFailed()
        }
    }

    override fun deleteData(data: User, indentListener: DataIndentListener) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateData(data: User, indentListener: DataIndentListener) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}