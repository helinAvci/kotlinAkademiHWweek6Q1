package com.helinavci.kotlinakademihwweek6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.helinavci.kotlinakademihwweek6.databinding.FragmentSingInBinding


class SingInFragment : Fragment() {
private lateinit var tasarim : FragmentSingInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       tasarim = FragmentSingInBinding.inflate(inflater , container , false)
        tasarim.buttonGecis.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.gecis)
        }
        return tasarim.root
    }



}