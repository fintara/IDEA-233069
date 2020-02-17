package fintara

import org.jetbrains.exposed.sql.*
import kotlin.sequences.Sequence

/**
 * Created by Tsvetan Ovedenski on 17/02/20.
 */
object Repository {
    fun findAll(): Sequence<Car> = Cars
        .selectAll()
        .asSequence()
        .map(::mapper)

    fun findById(id: Int): Car? = Cars
        .select { Cars.id eq id }
        .firstOrNull()
        ?.let(::mapper)

    fun insert(car: Car) = Cars.insertAndGetId {
        it[make] = car.make
        it[model] = car.model
    }

    fun deleteAll() = Cars
        .deleteAll()
}

fun mapper(row: ResultRow) = Car(
    id = row[Cars.id].value,
    make = row[Cars.make],
    model = row[Cars.model]
)