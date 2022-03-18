package com.example.dualpanellayouts

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private val starSign: TextView?
        get() = view?.findViewById(R.id.star_sign)
    private val symbol: TextView?
        get() = view?.findViewById(R.id.symbol)
    private val dateRange: TextView?
        get() = view?.findViewById(R.id.date_range)
    private var param1: String? = null
    private var param2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    @SuppressLint("StringFormatInvalid")
    fun setStarSignData(starSignId: Int) {
        when (starSignId) {
            R.id.aquarius -> {
                starSign?.text = getString(R.string.aquarius)
                symbol?.text = getString(R.string.symbol, "Water Carrier")
                dateRange?.text = getString(R.string.date_range, "January 20-February 18");
            }
            R.id.pisces -> {
                starSign?.text = getString(R.string.pisces)
                symbol?.text = getString(R.string.symbol, "Fish")
                dateRange?.text = getString(R.string.date_range, "February 19 - March 20");
            }
            R.id.aries -> {
                starSign?.text = getString(R.string.aries)
                symbol?.text = getString(R.string.symbol, "Arabic Hamal")
                dateRange?.text = getString(R.string.date_range, "March 21-April 20");
            }
            R.id.taurus -> {
                starSign?.text = getString(R.string.taurus)
                symbol?.text = getString(R.string.symbol, "The Bull")
                dateRange?.text = getString(R.string.date_range, "April 20-May 20");
            }
            R.id.gemini -> {
                starSign?.text = getString(R.string.gemini)
                symbol?.text = getString(R.string.symbol, "The Twins")
                dateRange?.text = getString(R.string.date_range, "May 22-June 21");
            }
            R.id.cancer -> {
                starSign?.text = getString(R.string.cancer)
                symbol?.text = getString(R.string.symbol, "The Crab")
                dateRange?.text = getString(R.string.date_range, "June 21-July 22");
            }
            R.id.leo -> {
                starSign?.text = getString(R.string.leo)
                symbol?.text = getString(R.string.symbol, "The Twins")
                dateRange?.text = getString(R.string.date_range, "May 22-June 21");
            }
            R.id.virgo -> {
                starSign?.text = getString(R.string.virgo)
                symbol?.text = getString(R.string.symbol, "The Virgin")
                dateRange?.text = getString(R.string.date_range, "May 22-June 21");
            }
            R.id.libra -> {
                starSign?.text = getString(R.string.gemini)
                symbol?.text = getString(R.string.symbol, "The Twins")
                dateRange?.text = getString(R.string.date_range, "August 23-September 22");
            }
            R.id.scorpio -> {
                starSign?.text = getString(R.string.scorpio)
                symbol?.text = getString(R.string.symbol, "The Scorpion")
                dateRange?.text = getString(R.string.date_range, "October 23-November 21");
            }
            R.id.sagittarius -> {
                starSign?.text = getString(R.string.sagittarius)
                symbol?.text = getString(R.string.symbol, "The Centaur")
                dateRange?.text = getString(R.string.date_range, "November 22-December 21");
            }
            R.id.capricorn -> {
            starSign?.text = getString(R.string.capricorn)
            symbol?.text = getString(R.string.symbol, "The Sea-Got")
            dateRange?.text = getString(R.string.date_range, "December 21-January 20");
        }
        }
    }
    companion object{
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
