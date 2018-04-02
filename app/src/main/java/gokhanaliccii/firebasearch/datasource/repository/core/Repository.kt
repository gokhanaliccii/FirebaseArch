package gokhanaliccii.firebasearch.datasource.repository.core

import gokhanaliccii.firebasearch.datasource.model.FirebaseModel

/**
 * Created by gokhan on 02/04/18.
 */
interface Repository<T : FirebaseModel> {

    fun loadData(dataLoadListener: DataLoadListener<T>)

    fun saveData(indentListener: DataIndentListener, data: T)

    fun deleteData(indentListener: DataIndentListener, data: T)

    fun updateData(indentListener: DataIndentListener,   data: T)
}