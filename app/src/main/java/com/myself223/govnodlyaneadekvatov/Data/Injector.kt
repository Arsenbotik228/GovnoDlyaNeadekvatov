package com.myself223.govnodlyaneadekvatov.Data

import com.myself223.govnodlyaneadekvatov.Presenter.CounterPresenter

class Injector {

    companion object {
        fun getPresenter():CounterPresenter{
            return CounterPresenter(CounterModel())
        }
    }
}