package pe.idat.ec3.data

import pe.idat.ec3.data.response.MapsResponse
import java.lang.Exception

sealed class MapResult<T>(data: T? = null, error: Exception? = null) {
    data class Success<T>(val data: T): MapResult<T>(data, null)
    data class Error<T>(val data: Exception): MapResult<T>(null, data)
}