package net.taikula.architecturescompare.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import net.taikula.architecturescompare.R
import net.taikula.architecturescompare.mvp.presenter.ICountPresenter
import net.taikula.architecturescompare.mvp.presenter.MvpCountPresenter

class MvpActivity : AppCompatActivity(), ICountView {

    private val iCountPresenter: ICountPresenter = MvpCountPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        findViewById<View>(R.id.mvp_add_random).setOnClickListener {
            iCountPresenter.addRandom()
        }

        findViewById<View>(R.id.mvp_reset).setOnClickListener {
            iCountPresenter.reset()
        }
    }

    override fun refreshCount(count: Int) {
        findViewById<TextView>(R.id.mvp_count).text = count.toString()
    }


}