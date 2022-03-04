package com.example.marvelherous

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.data.remote.HeroesApp
import com.data.remote.HeroesListViewModel

class HeroesListFragment: Fragment(R.layout.fragment_heroes_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val heroesListViewModel = ViewModelProvider(this).get(HeroesListViewModel::class.java)
        heroesListViewModel.fetchHeroesList((activity?.application as? HeroesApp)?.heroesApi)
        Log.d("kek", "lol")
    }
}