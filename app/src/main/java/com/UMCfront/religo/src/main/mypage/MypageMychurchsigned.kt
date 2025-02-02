package com.UMCfront.religo.src.main.mypage

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.UMCfront.religo.R

class MypageMychurchsigned: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_mypage_churchtry, container, false)
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        Log.d("p101test","1")
        var MypageMychurchAdapter= mutableListOf<String>()
        var MypageMychurchAdapter2= mutableListOf<String>()

        MypageMychurchAdapter.add("church1")
        MypageMychurchAdapter.add("church2")

        MypageMychurchAdapter2.add("서울시 동작구 흑석동 중앙본로 13-1")
        MypageMychurchAdapter2.add("서울시 동작구 상도동 상도로 13-2")


        val mychurchsignup= view.findViewById<RecyclerView>(R.id.mypage_churchtry_recyclerview)
        val mychurchsignupAdapter= MypageMychurchAdapter(MypageMychurchAdapter,MypageMychurchAdapter2)
        mychurchsignup.adapter=mychurchsignupAdapter
        mychurchsignup.layoutManager= LinearLayoutManager(this.context)
        Log.d("p101test","1011")

    }


}