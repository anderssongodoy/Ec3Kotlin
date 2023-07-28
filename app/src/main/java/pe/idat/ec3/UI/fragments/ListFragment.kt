package pe.idat.ec3.UI.fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.idat.ec3.R
import pe.idat.ec3.databinding.FragmentInformacionBinding
import pe.idat.ec3.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var viewModel: ListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVMapAdapter(listOf())
        binding.rvMaps.adapter = adapter
        binding.rvMaps.layoutManager = GridLayoutManager(requireContext(), 1, RecyclerView.VERTICAL, false)
        viewModel.maps.observe(requireActivity()){ maps ->
            adapter.maps = maps
            adapter.notifyDataSetChanged()
        }
        viewModel.getMapFromService()
    }

}