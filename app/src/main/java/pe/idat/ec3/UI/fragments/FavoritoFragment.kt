package pe.idat.ec3.UI.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.idat.ec3.R
import pe.idat.ec3.databinding.FragmentFavoritoBinding

class FavoritoFragment : Fragment() {

    private lateinit var binding: FragmentFavoritoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoritoBinding.inflate(inflater, container, false)
        return binding.root
    }

}