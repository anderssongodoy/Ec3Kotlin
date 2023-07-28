package pe.idat.ec3.UI.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.idat.ec3.databinding.ItemMapBinding
import pe.idat.ec3.model.Map

class RVMapAdapter(private val maps: List<Map>): RecyclerView.Adapter<MapVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MapVH {
        val binding = ItemMapBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MapVH(binding)
    }

    override fun getItemCount(): Int = maps.size

    override fun onBindViewHolder(holder: MapVH, position: Int) {
        holder.bind(maps[position])
    }
}

class MapVH(private val binding: ItemMapBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(map: Map) {

        binding.name.text = map.displayName
        binding.coords.text = map.coordinates
    }

}