package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Transactions (
    @SerializedName("transaction_id")       var transaction_id  : Long?       = null,
    @SerializedName("created_at")           var created_at      : String?    = null,
    @SerializedName("created_by")           var created_by      : String?    = null,
    @SerializedName("updated_by")           var updated_by      : String?    = null,
    @SerializedName("additional_fee")       var additional_fee  : String?    = null,
    @SerializedName("amount")               var amount          : String?    = null,
    @SerializedName("receiver")             var receiver        : String?    = null,
    @SerializedName("sender")               var sender          : String?    = null,
    @SerializedName("transaction_method")   var transaction_method  : String?    = null,
    @SerializedName("transaction_status")   var transaction_status  : String?    = null,
    @SerializedName("transaction_time")     var transaction_time    : String?    = null
) : Parcelable