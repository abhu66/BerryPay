package app.berrypay.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Client_config (
    @SerializedName("config_id")     var config_id   : Int?       = null,
    @SerializedName("created_at")    var created_at  : String?    = null,
    @SerializedName("updated_at")    var updated_at  : String?    = null,
    @SerializedName("created_by")    var created_by  : String?    = null,
    @SerializedName("updated_by")    var updated_by  : String?    = null,
    @SerializedName("config_name")   var config_name : String?    = null,
    @SerializedName("config_seq")    var config_seq  : Int?       = null,
    @SerializedName("config_type")   var config_type : String?    = null
    ) : Parcelable