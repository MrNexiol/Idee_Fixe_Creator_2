package tomasz.kopycinski.domain.model

import java.util.Date

data class CharacterSheet(
    val id: Int,
    val name: String,
    val surname: String,
    val age: Int,
    val gender: String,
    val dateOfBirth: Date,
    var destinyPoints: Int,
    var luckPoints: Int,
    var accountMoney: Double,
    var jewelryMoney: Double,
    var barterMoney: Double,
    var notes: String
)
