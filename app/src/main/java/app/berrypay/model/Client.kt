package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Client (
    @SerializedName("client_id")      var client_id     : Int?       = null,
    @SerializedName("created_at")     var created_at    : String?    = null,
    @SerializedName("updated_at")     var updated_at    : String?    = null,
    @SerializedName("created_by")     var created_by    : String?    = null,
    @SerializedName("client_name")    var client_name   : Int?       = null
) : Parcelable