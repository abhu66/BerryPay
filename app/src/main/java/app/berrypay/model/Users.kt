package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Users (
    @SerializedName("user_id")        var user_id       : Int?       = null,
    @SerializedName("created_at")     var created_at    : String?    = null,
    @SerializedName("updated_at")     var updated_at    : String?    = null,
    @SerializedName("password")       var password      : String?    = null,
    @SerializedName("username")       var username      : Int?       = null,
    @SerializedName("member_id")      var member_id     : Int?       = null
) : Parcelable