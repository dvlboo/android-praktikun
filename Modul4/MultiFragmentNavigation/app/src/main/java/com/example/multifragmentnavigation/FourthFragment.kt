package com.example.multifragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.multifragmentnavigation.databinding.FragmentFourthBinding

class FourthFragment() : Fragment() {

    private var getBinding: FragmentFourthBinding? = null
    private val binding get() = getBinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_fourth, container, false)

        val bundle = arguments
        if (bundle != null) {
            val teks = bundle.getString("teks")
            binding.tvHasil.text = teks
        }

            getBinding = FragmentFourthBinding.inflate(inflater, container, false)
            return binding.root
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            binding.btToFragmentKetiga.setOnClickListener {
                Navigation.createNavigateOnClickListener(R.id.action_fourthFragment_to_thirdFragment)
            }

        }

    override fun onDestroy() {
        super.onDestroy()
        getBinding = null
    }

}
