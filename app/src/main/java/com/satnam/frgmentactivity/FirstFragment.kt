package com.satnam.frgmentactivity

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment(), ActivityInterface {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var btnincrement : Button
    lateinit var btnclear : Button
    lateinit var mainActivity: MainActivity
    lateinit var    fragmentactivity : LinearLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = activity as MainActivity
        mainActivity.ActivityInterface = this
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnincrement = view.findViewById(R.id.btnincrement)
        fragmentactivity = view.findViewById(R.id.llMain)
        btnincrement.setOnClickListener {
            mainActivity.number = mainActivity.number + 1
            mainActivity.updateNumber()
        }
        btnclear = view.findViewById(R.id.btnclear)
        fragmentactivity = view.findViewById(R.id.llMain)
        btnclear.setOnClickListener {
            mainActivity.btnzero.setText("0")

        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun setRedColor() {
        fragmentactivity.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.red))
    }

    override fun setBlueColor() {
        fragmentactivity.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.blue))
    }

    override fun setGreenColor() {
        fragmentactivity.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.green))
    }


}