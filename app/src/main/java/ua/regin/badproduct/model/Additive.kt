package ua.regin.badproduct.model

import java.io.Serializable

data class Additive(val id: Long = 0,
                    val similar: String = "",
                    val  name: String = "",
                    val description: String = "",
                    val danger: Int = 0,
                    val image: String? = null,
                    val naturality: Naturality = Additive.Naturality.Natural,
                    val synonym: String = "") : Serializable {


    enum class Naturality {
        Natural, Synthetic, Unknown
    }
}
