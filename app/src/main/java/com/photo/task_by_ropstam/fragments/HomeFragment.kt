package com.photo.task_by_ropstam.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.photo.task_by_ropstam.R
import com.photo.task_by_ropstam.adapters.TrendingPostAdapter
import com.photo.task_by_ropstam.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

  lateinit var bindingHome:FragmentHomeBinding
  lateinit var trendpingPostAdapter: TrendingPostAdapter
    lateinit var list:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingHome = FragmentHomeBinding.inflate(inflater, container, false);
//        return inflater.inflate(R.layout.fragment_home, container, false)
        list= ArrayList()

        trendingPostFetching()
        recentPostFetching()


        return bindingHome.root
    }

    private fun trendingPostFetching() {
        bindingHome.recyclerTrendingPost.layoutManager=LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)
        list.add("")
        list.add("")
        list.add("")
        list.add("")
        list.add("")
        list.add("")
        list.add("")

        trendpingPostAdapter= TrendingPostAdapter(requireContext(),list)
        bindingHome.recyclerTrendingPost.adapter=trendpingPostAdapter


    }



    private fun recentPostFetching() {
        bindingHome.recyclerRecentViewdPost.layoutManager=LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)
        list.add("")
        list.add("")
        list.add("")
        list.add("")
        list.add("")
        list.add("")
        list.add("")

        trendpingPostAdapter= TrendingPostAdapter(requireContext(),list)
        bindingHome.recyclerRecentViewdPost.adapter=trendpingPostAdapter


    }


}