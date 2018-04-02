package gokhanaliccii.firebasearch.datasource.repository

import gokhanaliccii.firebasearch.datasource.base.FirebaseModel

/**
 * Created by gokhan on 02/04/18.
 */
interface DataLoadListener<in T : FirebaseModel> {

    fun onDataLoaded(data: T)

    fun onDataListLoaded(data: List<T>)
}