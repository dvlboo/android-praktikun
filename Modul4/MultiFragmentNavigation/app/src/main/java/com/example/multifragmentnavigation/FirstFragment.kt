package com.example.multifragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.multifragmentnavigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var getBinding : FragmentFirstBinding? = null
    private val binding get() = getBinding!!

    //punya mas david ada !!nya, itu buat apa??

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_first, container, false)
        getBinding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSecondFragment.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment)
        )
        binding.btnThirdFragment.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_fourthFragment)
        )

        // !! dan ? itu apa?? untuk apa??
    }

    override fun onDestroy() {
        super.onDestroy()
        getBinding = null
    }

}