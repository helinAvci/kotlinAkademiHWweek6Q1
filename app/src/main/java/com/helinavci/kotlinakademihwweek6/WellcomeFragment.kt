package com.helinavci.kotlinakademihwweek6

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.helinavci.kotlinakademihwweek6.databinding.FragmentWellcomeBinding


class WellcomeFragment : Fragment() {
private lateinit var tasarim : FragmentWellcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       tasarim = FragmentWellcomeBinding.inflate(inflater , container , false)
        val bundle : WellcomeFragmentArgs by navArgs()
        Log.d("deneme" , bundle.name)
        val text = "${bundle.name}     HOŞGELDİNİZ "
        tasarim.textView.text = text
        return tasarim.root
    }


}