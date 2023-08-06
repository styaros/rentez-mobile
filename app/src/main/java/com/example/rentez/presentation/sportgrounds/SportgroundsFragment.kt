package com.example.rentez.presentation.sportgrounds

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.rentez.databinding.FragmentSportgroundsBinding

class SportgroundsFragment : Fragment() {

    private lateinit var binding: FragmentSportgroundsBinding

    private val viewModel: SportgroundsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSportgroundsBinding.inflate(inflater, container, false)
        return binding.root
    }
}