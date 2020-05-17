package com.app1.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav = findViewById<BottomNavigationView>(R.id.nav)
        val frame = findViewById<FrameLayout>(R.id.frame_layout)

        val game = posts_fragment()
        val web = user_fragment()
        val android = setting_fragments()

        val fragmentChanger = supportFragmentManager.beginTransaction()
        fragmentChanger.replace(R.id.frame_layout, game)
        fragmentChanger.commit()



        nav.setOnNavigationItemReselectedListener { item->

            when(item.itemId){
                R.id.game_icon ->{

                    val fragmentChanger = supportFragmentManager.beginTransaction()
                    fragmentChanger.replace(R.id.frame_layout, game)
                    fragmentChanger.commit()

                    true
                }
                R.id.web_icon ->{

                    val fragmentChanger = supportFragmentManager.beginTransaction()
                    fragmentChanger.replace(R.id.frame_layout, web)
                    fragmentChanger.commit()

                    true
                }
                R.id.android_icon ->{

                    val fragmentChanger = supportFragmentManager.beginTransaction()
                    fragmentChanger.replace(R.id.frame_layout, android)
                    fragmentChanger.commit()

                    true
                }

                else -> false

            }


        }
    }
}
