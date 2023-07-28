package pe.idat.ec3.UI.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pe.idat.ec3.data.MapResult
import pe.idat.ec3.data.repository.MapsRepository
import pe.idat.ec3.model.Map

class ListViewModel: ViewModel() {
    val maps: MutableLiveData<List<Map>> = MutableLiveData<List<Map>>()
    val repository: MapsRepository()


    fun getMapFromService(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getMaps()
            when(response){
                is MapResult.Success -> {
                    maps.postValue(response.data.data)
                }
            }
            maps.postValue(response)
        }
    }
}