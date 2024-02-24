package com.myself223.govnodlyaneadekvatov

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.myself223.govnodlyaneadekvatov.Data.Injector
import com.myself223.govnodlyaneadekvatov.Presenter.CounterPresenter
import com.myself223.govnodlyaneadekvatov.Presenter.PreseterContracts
import com.myself223.govnodlyaneadekvatov.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),PreseterContracts.counterView {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var presenter: CounterPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        presenter = Injector.getPresenter()
        presenter.attachView(this)
        initListners()

    }
    private fun initListners(){
        binding.btnPilus.setOnClickListener{
            presenter.increments()
            presenter.toast()
            presenter.changeColor()
            presenter.underChangeColor()
        }
        binding.btnMinus.setOnClickListener{
            presenter.decrement()
            presenter.changeColor()
            presenter.toast()
            presenter.underChangeColor()

        }
    }
     override fun updateCounter(counter:Int){
        binding.pockazatel.text = counter.toString()
    }

    override fun stopper() {
        Toast.makeText(this,"Урааа я гей",Toast.LENGTH_SHORT).show()
    }

    override fun color() {
        binding.pockazatel.setTextColor(Color.RED)
        binding.poloska.setColorFilter(Color.RED)
    }

    override fun underColor() {
        binding.pockazatel.setTextColor(Color.BLACK)
        binding.poloska.setColorFilter(Color.BLACK)

    }
}