package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Client_member (
    @SerializedName("created_at")    var created_at     : String?    = null,
    @SerializedName("updated_at")    var updated_at     : String?    = null,
    @SerializedName("created_by")    var created_by     : String?    = null,
    @SerializedName("updated_by")    var updated_by     : String?    = null,
    @SerializedName("account_type")  var account_type   : String?    = null,
    @SerializedName("member_status") var member_status  : String?    = null,
    @SerializedName("client_id")     var client_id      : Int?       = null,
    @SerializedName("member_id")     var member_id      : Int?       = null,
    @SerializedName("account_id")    var account_id     : Int?       = null,
    @SerializedName("role_id")       var role_id        : Int?       = null
    ) : Parcelable