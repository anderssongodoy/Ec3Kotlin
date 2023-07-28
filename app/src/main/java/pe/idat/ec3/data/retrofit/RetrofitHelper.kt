package pe.idat.ec3.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofitInstance: Retrofit = Retrofit.Builder()
        .baseUrl("https://valorant-api.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var valorantInstance = retrofitInstance.create(ValorantInterface::class.java)
}