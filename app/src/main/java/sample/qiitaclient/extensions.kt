package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by insight on 17/07/09.
 */
fun <T: View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}