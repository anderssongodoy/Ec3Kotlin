package pe.idat.ec3.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.setupWithNavController
import pe.idat.ec3.R
import pe.idat.ec3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentView = supportFragmentManager.findFragmentById(R.id.fcv_fragment) as androidx.navigation.fragment.NavHostFragment
        val navController = fragmentView.navController
        binding.bnvValorant.setupWithNavController(navController)
    }
}