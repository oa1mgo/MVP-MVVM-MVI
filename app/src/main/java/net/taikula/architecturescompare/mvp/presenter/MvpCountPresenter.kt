package net.taikula.architecturescompare.mvp.presenter

import net.taikula.architecturescompare.mvp.model.ICountModel
import net.taikula.architecturescompare.mvp.model.MvpCountModel
import net.taikula.architecturescompare.mvp.view.ICountView
import kotlin.random.Random

class MvpCountPresenter(private val iCountView: ICountView) : ICountPresenter {

    private var iCountModel: ICountModel = MvpCountModel(this)

    override fun addRandom() {
        iCountModel.setCount(iCountModel.getCount() + Random.nextInt(10))
    }

    override fun reset() {
        iCountModel.setCount(0)
    }

    override fun countChanged() {
        iCountView.refreshCount(iCountModel.getCount())
    }

}