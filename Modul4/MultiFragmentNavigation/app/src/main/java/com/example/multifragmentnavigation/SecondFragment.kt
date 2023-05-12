package com.example.multifragmentnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.multifragmentnavigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var getBinding : FragmentSecondBinding? = null
    private val binding get() = getBinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_second, container, false)

        getBinding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFourthFragment.setOnClickListener{v->

            val toFourthFragment = SecondFragmentDirections.

//            Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_fourthFragment)


//            Bundle().putString("teks", binding.etTextData.text.toString())
//            FourthFragment().arguments = Bundle()

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        getBinding = null
    }

}