package com.myself223.govnodlyaneadekvatov.Presenter

import com.myself223.govnodlyaneadekvatov.MainActivity

class PreseterContracts {
    interface  counterView{
        fun updateCounter(counter:Int)
        fun stopper()
        fun color()
        fun underColor()

    }
    interface counterPresenter{
        fun changeColor()
        fun underChangeColor()
        fun toast()
        fun increments()
        fun decrement()
        fun attachView(view: MainActivity)
    }
}