package addam.bootstrapaac.ui.main

import addam.bootstrapaac.R
import addam.bootstrapaac.databinding.MainActivityBinding
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var viewModel =  MainViewModel()
    lateinit var mBinding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this,R.layout.main_activity)
        mBinding.viewModel = viewModel
    }

}
