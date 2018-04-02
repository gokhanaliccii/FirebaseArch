package gokhanaliccii.firebasearch.datasource.repository.core

import gokhanaliccii.firebasearch.datasource.model.FirebaseModel

/**
 * Created by gokhan on 02/04/18.
 */
interface DataLoadListener<in T : FirebaseModel> {

    fun onDataLoaded(data: T)

    fun onDataListLoaded(data: List<T>)
}