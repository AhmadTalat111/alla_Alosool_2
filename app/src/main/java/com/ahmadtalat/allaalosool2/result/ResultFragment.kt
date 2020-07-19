package com.ahmadtalat.allaalosool2.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.ahmadtalat.allaalosool2.R
import com.ahmadtalat.allaalosool2.databinding.FragmentResultBinding
import kotlinx.android.synthetic.main.fragment_result.*


class ResultFragment : Fragment() {
val args: ResultFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentResultBinding>(
            inflater, R.layout.fragment_result, container, false)
        val userName = args.userName
        val score = args.score
        val totalQuestions = args.totalQuestions
        binding.tvName.text = args.userName
        binding.tvScore.text = " نتيجتك $score من $totalQuestions"
        binding.btnFinish.setOnClickListener { view: View -> view.findNavController()
            .navigate(ResultFragmentDirections.actionResultFragmentToTitleFragment()) }

        return binding.root
    }


}