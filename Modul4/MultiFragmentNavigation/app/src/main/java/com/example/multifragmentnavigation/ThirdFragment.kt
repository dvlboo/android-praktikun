package com.example.multifragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.multifragmentnavigation.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private var getBinding: FragmentThirdBinding? = null
    private val binding get() = getBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_third, container, false)

        getBinding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btFirstFragment.setOnClickListener{
            Navigation.createNavigateOnClickListener(R.id.action_thirdFragment_to_firstFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        getBinding = null
    }

}