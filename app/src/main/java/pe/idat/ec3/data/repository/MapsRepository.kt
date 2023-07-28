package pe.idat.ec3.data.repository

import pe.idat.ec3.data.MapResult
import pe.idat.ec3.data.response.MapsResponse
import pe.idat.ec3.data.retrofit.RetrofitHelper
import pe.idat.ec3.model.Map
import java.lang.Exception

class MapsRepository {

    fun getMaps(): MapResult<MapsResponse>{
        return try {
            val response = RetrofitHelper.valorantInstance.getAllMaps()
            MapResult.Success(response)
        } catch (e: Exception){
            MapResult.Error(e)
        }
    }
}