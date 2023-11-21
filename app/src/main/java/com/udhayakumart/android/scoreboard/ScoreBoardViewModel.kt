package com.udhayakumart.android.scoreboard

import androidx.lifecycle.ViewModel
import com.udhayakumart.android.scoreboard.data.source.local.over.OverDao

class ScoreBoardViewModel(private val dao: OverDao): ViewModel() {
    val overs = dao.getAllOvers()
}