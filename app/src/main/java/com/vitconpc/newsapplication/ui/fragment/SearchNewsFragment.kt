package com.vitconpc.newsapplication.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vitconpc.newsapplication.R

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("viet","onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e("viet","onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("viet","onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onAttach(context: Context) {
        Log.e("viet","onAttach")
        super.onAttach(context)
    }

    override fun onResume() {
        Log.e("viet","onResume")
        super.onResume()
    }

    override fun onStart() {
        Log.e("viet","onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.e("viet","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("viet","onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("viet","onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("viet","onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("viet","onDetach")
        super.onDetach()
    }
}