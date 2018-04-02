package gokhanaliccii.firebasearch.datasource.repository.core

import gokhanaliccii.firebasearch.datasource.model.FirebaseModel

/**
 * Created by gokhan on 02/04/18.
 */
interface Repository<T : FirebaseModel> {

    fun loadData(dataLoadListener: DataLoadListener<T>)

    fun saveData(data: T, indentListener: DataIndentListener)

    fun deleteData(data: T, indentListener: DataIndentListener)

    fun updateData(data: T, indentListener: DataIndentListener)
}