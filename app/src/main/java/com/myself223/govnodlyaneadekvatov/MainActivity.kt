package com.myself223.govnodlyaneadekvatov

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.core.view.ViewCompat
import com.myself223.govnodlyaneadekvatov.Data.Injector
import com.myself223.govnodlyaneadekvatov.Presenter.CounterPresenter
import com.myself223.govnodlyaneadekvatov.Presenter.PresenterContracts
import com.myself223.govnodlyaneadekvatov.databinding.ActivityMainBinding
import java.util.concurrent.CompletableFuture

class MainActivity : AppCompatActivity(),PresenterContracts.counterView {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var presenter: CounterPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val fadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in)
        val fadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out)
        val blink = AnimationUtils.loadAnimation(this,R.anim.blink)
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
            presenter.invisible()
            presenter.visible()


        }
        binding.btnMinus.setOnClickListener{
            presenter.decrement()
            presenter.changeColor()
            presenter.toast()
            presenter.underChangeColor()
            presenter.invisible()
            presenter.visible()



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

    override fun getVisible() {
        binding.gCGY.visibility = View.VISIBLE
    }

    override fun getInvisible() {
        binding.gCGY.visibility = View.GONE

    }
}