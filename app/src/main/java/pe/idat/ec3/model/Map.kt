package pe.idat.ec3.model

data class Map(
    val uuid: String,
    val displayName: String,
    val coordinates: String,
    val displayIcon: String,
    val listViewIcon: String,
    val splash: String,
    val assetPath: String,
    val mapUrl: String,
    val xMultiplier: Double,
    val yMultiplier: Double,
    val xScalarToAdd: Double,
    val yScalarToAdd: Double,
    val callouts: List<Callout>
)