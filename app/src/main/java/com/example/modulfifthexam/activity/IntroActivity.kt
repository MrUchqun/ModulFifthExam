package com.example.modulfifthexam.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.modulfifthexam.R
import com.example.modulfifthexam.adapter.IntroPagerAdapter
import com.example.modulfifthexam.fragment.IntroFragment
import com.example.modulfifthexam.managers.SharedPrefs
import com.example.modulfifthexam.model.AboutApp
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class IntroActivity : AppCompatActivity() {

    private lateinit var vpIntro: ViewPager
    private lateinit var ivIntro: ImageView
    private lateinit var tvDone: TextView
    private lateinit var tvSkip: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        initViews()
    }

    private fun initViews() {
        vpIntro = findViewById(R.id.vp_intro)
        ivIntro = findViewById(R.id.iv_intro)

        tvDone = findViewById(R.id.tv_done)
        tvSkip = findViewById(R.id.tv_skip)

        tvDone.setOnClickListener {
            callMainActivity()
        }
        tvSkip.setOnClickListener {
            callMainActivity()
        }

        setAdapter(getAdapter())
        changeImage()
    }

    private fun callMainActivity() {
        SharedPrefs(this).isSaved = true
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    private fun getAdapter(): IntroPagerAdapter {
        val adapter = IntroPagerAdapter(supportFragmentManager)
        adapter.addFragment(
            IntroFragment(
                AboutApp(
                    getString(R.string.title_saved),
                    getString(R.string.description_saved)
                )
            )
        )
        adapter.addFragment(
            IntroFragment(
                AboutApp(
                    getString(R.string.title_add),
                    getString(R.string.description_saved)
                )
            )
        )
        adapter.addFragment(
            IntroFragment(
                AboutApp(
                    getString(R.string.title_chat),
                    getString(R.string.description_saved)
                )
            )
        )
        adapter.addFragment(
            IntroFragment(
                AboutApp(
                    getString(R.string.title_notification),
                    getString(R.string.description_saved)
                )
            )
        )
        return adapter
    }

    private fun setAdapter(adapter: IntroPagerAdapter) {
        val dotsIndicator: WormDotsIndicator = findViewById(R.id.dots_indicator)
        vpIntro.adapter = adapter
        dotsIndicator.setViewPager(vpIntro)
    }

    private fun changeImage() {
        vpIntro.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                ivIntro.setImageResource(
                    when (position) {
                        0 -> R.drawable.ic_baseline_favorite_border_24
                        1 -> R.drawable.ic_outline_camera_alt_24
                        2 -> R.drawable.ic_outline_mode_comment_24
                        else -> R.drawable.ic_outline_notifications_24
                    }
                )

                if (position == 3) {
                    tvSkip.visibility = View.INVISIBLE
                } else {
                    tvSkip.visibility = View.VISIBLE
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }
}