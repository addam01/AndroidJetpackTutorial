package addam.bootstrapaac.ui.main

import addam.bootstrapaac.util.ObservableString
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    var username = ObservableString("")
    var password = ObservableString("")

    fun onLoginClicked(){

    }
}
