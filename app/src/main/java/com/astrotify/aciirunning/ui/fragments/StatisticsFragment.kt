package com.astrotify.aciirunning.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.astrotify.aciirunning.R
import com.astrotify.aciirunning.ui.viewmodels.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_statistics) {
    private val viewModel: StatisticViewModel by viewModels()
}