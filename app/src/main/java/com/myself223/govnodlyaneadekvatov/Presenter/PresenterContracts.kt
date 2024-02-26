package com.myself223.govnodlyaneadekvatov.Presenter

import com.myself223.govnodlyaneadekvatov.MainActivity

class PresenterContracts {
    interface  counterView{
        fun updateCounter(counter:Int)
        fun stopper()
        fun color()
        fun underColor()
        fun getVisible()
        fun getInvisible()

    }
    interface counterPresenter{
        fun visible()
        fun invisible()

        fun changeColor()
        fun underChangeColor()
        fun toast()
        fun increments()
        fun decrement()
        fun attachView(view: MainActivity)
    }
}