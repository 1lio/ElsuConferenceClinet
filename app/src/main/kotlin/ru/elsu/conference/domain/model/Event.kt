package ru.elsu.conference.domain.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Event(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id") var id: String,
    @SerializedName("title") var title: String,
    @SerializedName("icon") var icon: String,
    @SerializedName("status") var status: Int = 0,
    @SerializedName("time") var time: String = "00:00",
    @SerializedName("date") var date: String = "01-10-2020",
    @SerializedName("platform") var platform: String = "skype",
    @SerializedName("members") var members: Array<Member> = arrayOf(),
    @SerializedName("institute") var institute: String = "none",
    @SerializedName("description") var description: String,
    @SerializedName("lifecycle") var lifecycle: Array<Int>,
    @SerializedName("duration") var duration: String = "00:00:00",
    @SerializedName("stars") var stars: Int = 5
) : Parcelable {


    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readArray(ClassLoader.getSystemClassLoader()) as Array<Member>,
        parcel.readString()!!,
        parcel.readString()!!,
        (parcel.readArray(ClassLoader.getSystemClassLoader()) as Array<Int>?)!!,
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(title)
        parcel.writeString(icon)
        parcel.writeInt(status)
        parcel.writeString(time)
        parcel.writeString(date)
        parcel.writeString(platform)
        parcel.writeString(institute)
        parcel.writeString(description)
        parcel.writeString(duration)
        parcel.writeInt(stars)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<Event> {

        override fun createFromParcel(parcel: Parcel): Event {
            return Event(parcel)
        }

        override fun newArray(size: Int): Array<Event?> {
            return arrayOfNulls(size)
        }
    }
}