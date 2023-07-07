package net.taikula.architecturescompare.mvp.model

import net.taikula.architecturescompare.mvp.presenter.ICountPresenter

class MvpCountModel(private val iCountPresenter: ICountPresenter): ICountModel {

    private var count = 0
    override fun setCount(count: Int) {
        this.count = count
        iCountPresenter.countChanged()
    }

    override fun getCount(): Int {
        return count
    }

}