package pe.idat.ec3.data.response

import pe.idat.ec3.model.Map

data class MapsResponse(
    val status: Int,
    val data: List<Map>
)
