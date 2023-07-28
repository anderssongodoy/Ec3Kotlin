package pe.idat.ec3.data.retrofit

import pe.idat.ec3.data.response.MapsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ValorantInterface {
    @GET("maps")
    fun getAllMaps(): MapsResponse
}