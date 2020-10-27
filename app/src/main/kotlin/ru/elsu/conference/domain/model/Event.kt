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
    )

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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Event

        if (id != other.id) return false
        if (title != other.title) return false
        if (icon != other.icon) return false
        if (status != other.status) return false
        if (time != other.time) return false
        if (date != other.date) return false
        if (platform != other.platform) return false
        if (!members.contentEquals(other.members)) return false
        if (institute != other.institute) return false
        if (description != other.description) return false
        if (!lifecycle.contentEquals(other.lifecycle)) return false
        if (duration != other.duration) return false
        if (stars != other.stars) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + icon.hashCode()
        result = 31 * result + status
        result = 31 * result + time.hashCode()
        result = 31 * result + date.hashCode()
        result = 31 * result + platform.hashCode()
        result = 31 * result + members.contentHashCode()
        result = 31 * result + institute.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + lifecycle.contentHashCode()
        result = 31 * result + duration.hashCode()
        result = 31 * result + stars
        return result
    }

    companion object CREATOR : Parcelable.Creator<Event> {

        override fun createFromParcel(parcel: Parcel): Event = Event(parcel)

        override fun newArray(size: Int): Array<Event?> = arrayOfNulls(size)

    }
}