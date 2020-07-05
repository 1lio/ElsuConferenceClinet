package ru.elsu.conference.domain.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Member(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id") var id: String,
    @SerializedName("name") var name: String,
    @SerializedName("icon") var icon: String,
    @SerializedName("skype") var skype: String,
    @SerializedName("phone") var phone: String,
    @SerializedName("mail") var mail: String,
    @SerializedName("timeZone") var timeZone: String = "+3",
    @SerializedName("assistant") var assistant: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(name)
        parcel.writeString(icon)
        parcel.writeString(skype)
        parcel.writeString(phone)
        parcel.writeString(mail)
        parcel.writeString(timeZone)
        parcel.writeString(assistant)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<Member> {
        override fun createFromParcel(parcel: Parcel): Member {
            return Member(parcel)
        }

        override fun newArray(size: Int): Array<Member?> {
            return arrayOfNulls(size)
        }
    }
}