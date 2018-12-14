package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Roles (
    @SerializedName("role_id")  var role_id : Int?      = null,
    @SerializedName("name")     var name    : String?    = null
) : Parcelable