package tomasz.kopycinski.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import tomasz.kopycinski.data.dao.CharacterSheetDao
import tomasz.kopycinski.data.database.AppDatabase
import tomasz.kopycinski.data.repository.CharacterSheetRepositoryImpl
import tomasz.kopycinski.domain.repository.CharacterSheetRepository

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "app-database").build()

    @Provides
    fun provideCharacterSheetRepository(characterSheetDao: CharacterSheetDao): CharacterSheetRepository =
        CharacterSheetRepositoryImpl(characterSheetDao)

    @Provides
    fun provideCharacterSheetDao(appDatabase: AppDatabase): CharacterSheetDao =
        appDatabase.characterSheetDao()
}
