package com.ahmadtalat.allaalosool2.title

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.ahmadtalat.allaalosool2.Constants
import com.ahmadtalat.allaalosool2.R
import com.ahmadtalat.allaalosool2.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_title.*


class TitleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
            R.layout.fragment_title,container,false)

        binding.btnStart.setOnClickListener {view: View ->
            if (edit_text_e0.text.toString().isEmpty()){
                Toast.makeText(activity, "فضلاً أدخل رقمك الوظيفي", Toast.LENGTH_SHORT).show()
            }else{
                val user = binding.editTextE0.text.toString()
                view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToQuizFragment(user))
            }
        }

//        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
//        btn_start.setOnClickListener {
//            if (edit_text_e0.text.toString().isEmpty()){
//                Toast.makeText(activity, "فضلاً أدخل رقمك الوظيفي", Toast.LENGTH_SHORT).show()
//            }//else {
////                val intent = Intent(activity, TitleFragment::class.java)
////                intent.putExtra(Constants.USER_NAME, edit_text_e0.text.toString())
////                startActivity(intent)
//                //finish()
//          //  }
//        }
        return binding.root
    }


}