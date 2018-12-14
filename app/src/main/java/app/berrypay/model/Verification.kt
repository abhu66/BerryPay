package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Verification (
    @SerializedName("created_at")     var created_at    : String?    = null,
    @SerializedName("created_by")     var created_by    : String?    = null,
    @SerializedName("updated_by")     var updated_by    : String?    = null,
    @SerializedName("verified_at")    var verified_at   : String?    = null,
    @SerializedName("verified_by")    var verified_by   : String?    = null,
    @SerializedName("verification_data")   var verification_data    : String?    = null,
    @SerializedName("verification_image")  var verification_image   : String?    = null,
    @SerializedName("status")              var status               : Int?       = null,
    @SerializedName("verification_type")   var verification_type    : String?    = null,
    @SerializedName("client_id")           var client_id            : Long?      = null,
    @SerializedName("member_id")           var member_id            : Long?      = null
) : Parcelable