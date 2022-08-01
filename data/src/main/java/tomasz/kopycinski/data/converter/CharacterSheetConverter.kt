package tomasz.kopycinski.data.converter

import tomasz.kopycinski.data.entity.CharacterSheet as EntityCharacterSheet
import tomasz.kopycinski.domain.model.CharacterSheet as DomainCharacterSheet

fun EntityCharacterSheet.toDomain(): DomainCharacterSheet {
    return DomainCharacterSheet(
        id,
        name,
        surname,
        age,
        gender,
        dateOfBirth,
        destinyPoints,
        luckPoints,
        accountMoney,
        jewelryMoney,
        barterMoney,
        notes
    )
}

fun DomainCharacterSheet.toEntity(): EntityCharacterSheet {
    return EntityCharacterSheet(
        name,
        surname,
        age,
        gender,
        dateOfBirth,
        experience,
        luckPoints,
        accountMoney,
        jewelryMoney,
        barterMoney,
        notes,
        id
    )
}
