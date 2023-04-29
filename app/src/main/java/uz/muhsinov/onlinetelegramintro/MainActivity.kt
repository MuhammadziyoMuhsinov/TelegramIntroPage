package uz.muhsinov.onlinetelegramintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import uz.muhsinov.onlinetelegramintro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val data = listOf<ModelData>(
            ModelData(R.drawable.logo, "Telegram", "The world's fastest messaging app.\nIt is free and secure."),
            ModelData(R.drawable.fast, "Fast", "Telegram delivers messages\nfaster than any other application."),
            ModelData(R.drawable.gift, "Free", "Telegram is free forever. No ads.\nNo subscription feels."),
            ModelData(R.drawable.powerful, "Powerful", "Telegram has no limits on\nthe size of your chats and media."),
            ModelData(R.drawable.cloud, "Cloud-based", "Telegram lets you access your\nmessages from multiple devices.")


        )
        val customPagerAdapter = CustomPagerAdapter(this, data)
        binding.viewpager.adapter = customPagerAdapter

        TabLayoutMediator(binding.tablayout, binding.viewpager) { tab, position->

        }.attach()

    }
}