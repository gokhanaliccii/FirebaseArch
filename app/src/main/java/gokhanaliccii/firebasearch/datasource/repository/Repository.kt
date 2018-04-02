package gokhanaliccii.firebasearch.datasource.repository

import gokhanaliccii.firebasearch.datasource.base.FirebaseModel

/**
 * Created by gokhan on 02/04/18.
 */
interface Repository<T : FirebaseModel> {

    fun loadData(dataLoadListener: DataLoadListener<T>)

    fun saveData(data: T)

    fun deleteData(data: T)

    fun updateData(data: T)
}