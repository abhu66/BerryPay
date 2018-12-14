package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Forgot_password (
    @SerializedName("forgot_id")      var forgot_id         : Int?       = null,
    @SerializedName("created_at")     var created_at        : String?    = null,
    @SerializedName("updated_at")     var updated_at        : String?    = null,
    @SerializedName("created_by")     var created_by        : String?    = null,
    @SerializedName("updated_by")     var updated_by        : String?    = null,
    @SerializedName("authentication") var authentication    : String?    = null,
    @SerializedName("is_used")        var is_used           : Int?       = null,
    @SerializedName("member_id")      var member_id         : Long?       = null
) : Parcelable