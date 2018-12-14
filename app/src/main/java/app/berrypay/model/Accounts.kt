package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Accounts (
    @SerializedName("account_id")                   var account_id       : Int?    = null,
    @SerializedName("created_at")                   var created_at       : String?    = null,
    @SerializedName("updated_at")                   var updated_at       : String?    = null,
    @SerializedName("updated_by")                   var updated_by       : String?    = null,
    @SerializedName("account_balance")              var account_balance  : Int?    = null,
    @SerializedName("account_poin")                 var account_poin     : Int?    = null,
    @SerializedName("account_type")                 var account_type     : String?    = null,
    @SerializedName("account_va")                   var account_va       : String?    = null
    ) : Parcelable