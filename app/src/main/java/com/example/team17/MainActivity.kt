package com.example.team17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.team17.databinding.ActivityMainBinding
import com.example.team17.presentation.base.BaseActivity
import com.example.team17.presentation.view.add.AddFragment
import com.example.team17.presentation.view.award.AwardFragment
import com.example.team17.presentation.view.clipboard.ClipboardFragment
import com.example.team17.presentation.view.home.HomeFragment

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setNavigation()
    }

    private fun setNavigation() {
        changeFragment(HomeFragment())
        binding.bnvMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.homeFragment -> {
                    changeFragment(HomeFragment())
                }
                R.id.clipboardFragment -> {
                    changeFragment(ClipboardFragment())
                }
                R.id.awardFragment -> {
                    changeFragment(AwardFragment())
                }
                else -> {
                    changeFragment(AddFragment())
                }
            }
            true
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fcv_main, fragment).commit()
    }
}