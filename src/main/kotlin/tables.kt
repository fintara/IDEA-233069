package fintara

import org.jetbrains.exposed.dao.id.IntIdTable

/**
 * Created by Tsvetan Ovedenski on 17/02/20.
 */
object Cars : IntIdTable("cars") {
    val make = varchar("make", 10)
    val model = varchar("model", 15)
}

data class Car (
    val id: Int,
    val make: String,
    val model: String
)