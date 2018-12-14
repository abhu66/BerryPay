package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Transaction_history (
    @SerializedName("thistory_id") var thistory_id   : Int?       = null,
    @SerializedName("created_at")  var created_at    : String?    = null,
    @SerializedName("created_by")  var created_by    : String?    = null,
    @SerializedName("updated_by")  var updated_by    : String?    = null,
    @SerializedName("note")        var note          : String?    = null,
    @SerializedName("account_id")  var account_id    : Int?    = null,
    @SerializedName("member_id")   var member_id    : Int?     = null,
    @SerializedName("transaction_id") var transaction_id   : Int?    = null
) : Parcelable