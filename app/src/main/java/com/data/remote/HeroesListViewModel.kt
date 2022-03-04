package com.data.remote

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class HeroesListViewModel(application: Application): AndroidViewModel(application) {
    private val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun fetchHeroesList(heroesApi: HeroesApi?) {
        heroesApi?.let {
            compositeDisposable.add(
                heroesApi.getHeroesList()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        Log.d("kek", "kek")
                    }, {

                    })
            )
        }
    }
}