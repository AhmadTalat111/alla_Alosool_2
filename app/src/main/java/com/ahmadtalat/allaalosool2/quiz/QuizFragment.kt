package com.ahmadtalat.allaalosool2.quiz

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavArgs
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.ahmadtalat.allaalosool2.Constants
import com.ahmadtalat.allaalosool2.Question
import com.ahmadtalat.allaalosool2.R
import com.ahmadtalat.allaalosool2.databinding.FragmentQuizBinding
import kotlinx.android.synthetic.main.fragment_quiz.*


class QuizFragment : Fragment() , OnClickListener {
    private lateinit var binding: FragmentQuizBinding
    private var currentPosition = 1
    private var questionsList: ArrayList<Question>? = null
    private var selectedOptionPosition = 0
    private var score: Int = 0
    val args: QuizFragmentArgs by navArgs()
    //val userName ="Ahmad"
    //private var userName: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

          binding = DataBindingUtil.inflate<FragmentQuizBinding>(inflater,
            R.layout.fragment_quiz,container,false)

        questionsList = Constants.getQuestion()
        setQuestion()
        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)



        return binding.root
    }
    private fun setQuestion(){

        val question = questionsList!![currentPosition - 1]
        defaultOptionsView()
        if (currentPosition == questionsList!!.size){
            binding.btnSubmit.text = "إنهاء المسابقة"
        }else{
            binding.btnSubmit.text = "تأكيد"
        }
        binding.progressBar.progress = currentPosition
        if(progressBar != null) binding.tvProgress.text = "$currentPosition" + "/" + "${progressBar.max}"


        binding.tvQuestion.text = question.question
        binding.tvOptionOne.text =question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour
    }
    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, binding.tvOptionOne)
        options.add(1, binding.tvOptionTwo)
        options.add(2, binding.tvOptionThree)
        options.add(3, binding.tvOptionFour)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(activity?.applicationContext!!, R.drawable.default_option_border_bg)
        }

    }
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        selectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.typeface = Typeface.DEFAULT_BOLD
        tv.background = ContextCompat.getDrawable(activity?.applicationContext!!, R.drawable.selected_option_border_bg)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one -> selectedOptionView(tv_option_one, 1)
            R.id.tv_option_two -> selectedOptionView(tv_option_two, 2)
            R.id.tv_option_three -> selectedOptionView(tv_option_three, 3)
            R.id.tv_option_four -> selectedOptionView(tv_option_four, 4)
            R.id.btn_submit -> {
                if (selectedOptionPosition == 0) {
                    currentPosition++
                    when {
                        currentPosition <= questionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            var user = args.userName
                            view?.findNavController()?.navigate(QuizFragmentDirections.actionQuizFragmentToResultFragment(score, questionsList!!.size, user ))
//                            val intent = Intent(this, Result::class.java)
//                            intent.putExtra(Constants.USER_NAME, userName)
//                            intent.putExtra(Constants.CORRECT_ANSWERS, score)
//                            intent.putExtra(Constants.TOTAL_QUESTIONS, questionsList!!.size)
//                            startActivity(intent)
//                            finish()
                        }
                    }
                }else{
                    val question = questionsList?.get(currentPosition - 1)
                    if (question!!.correctAnswer != selectedOptionPosition) {
                        score = score
                    }
                    else {
                        score++
                    }
                    if (currentPosition == questionsList!!.size){
                        binding.btnSubmit.text = "إنهاء المسابقة"

                    }else{
                        binding.btnSubmit.text = "السؤال التالي"
                    }
                    selectedOptionPosition = 0
                }
            }
        }
    }


}