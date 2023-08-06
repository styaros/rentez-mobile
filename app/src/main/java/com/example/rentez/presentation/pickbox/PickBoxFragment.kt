package com.example.rentez.presentation.pickbox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.rentez.databinding.FragmentPickBoxBinding

class PickBoxFragment : Fragment() {

    private lateinit var binding: FragmentPickBoxBinding

    private val viewModel: PickBoxViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPickBoxBinding.inflate(inflater, container, false)
        return binding.root
    }
}