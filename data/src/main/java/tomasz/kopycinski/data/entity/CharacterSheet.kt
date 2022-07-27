package tomasz.kopycinski.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class CharacterSheet(
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
    var notes: String,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)
