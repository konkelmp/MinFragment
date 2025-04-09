/**
 * @author Preston Konkel
 * CS3013 Mobile App Development
 * Professor Elliot Evans
 */

package edu.msudenver.cs3013.minfragment

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun startFragment(v: View) {
        findViewById<FragmentContainerView>(
            R.id.blue_fragment)?.let {
                framelayout ->
                val blueFragment = BlueFragment.newInstance("FIRST")
            supportFragmentManager.beginTransaction().replace(framelayout.id, blueFragment).addToBackStack(null).commit()
        }
    }
}