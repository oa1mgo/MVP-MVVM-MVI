package net.taikula.architecturescompare.mvvm

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import net.taikula.architecturescompare.R

class MvvmActivity : AppCompatActivity() {

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)

        viewModel.getCount().observe(this) {
            findViewById<TextView>(R.id.mvvm_count).text = it.toString()
        }

        findViewById<Button>(R.id.mvvm_add_random).setOnClickListener {
            viewModel.addRandom()
        }

        findViewById<Button>(R.id.mvvm_reset).setOnClickListener {
            viewModel.reset()
        }

    }
}