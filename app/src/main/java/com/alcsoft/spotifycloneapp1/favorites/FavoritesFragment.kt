package com.alcsoft.spotifycloneapp1.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alcsoft.spotifycloneapp1.R

class FavoritesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites,container,false)
    }

    companion object{
        fun newInstance() : Fragment{
            return FavoritesFragment()
        }
    }
}