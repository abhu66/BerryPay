package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Members (
    @SerializedName("member_id")      var user_id       : Int?       = null,
    @SerializedName("created_at")     var created_at    : String?    = null,
    @SerializedName("created_by")     var created_by    : String?    = null,
    @SerializedName("updated_by")     var updated_by    : String?    = null,
    @SerializedName("address")        var address       : String?    = null,
    @SerializedName("date_of_birth")  var date_of_birth : String?    = null,
    @SerializedName("member_email")   var member_email  : String?    = null,
    @SerializedName("member_name")    var member_name   : String?    = null,
    @SerializedName("gender")         var gender        : String?    = null,
    @SerializedName("member_phone")   var member_phone  : String?    = null,
    @SerializedName("parent_member")  var parent_member : String?    = null,
    @SerializedName("place_of_birth") var place_of_birth  : String?  = null
) : Parcelable