package com.nikorych.cryptoapp.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class CoinPriceInfo(
    @SerializedName("TYPE")
    @Expose
    val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    val market: String? = null,

    @SerializedName("FROMSYMBOL")
    @Expose
    val frosymbol: String? = null,

    @SerializedName("TOSYMBOL")
    @Expose
    val tosymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    val fLAGS: String? = null,

    @SerializedName("PRICE")
    @Expose
    val pRICE: Double? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    val lASTUPDATE: Double? = null,

    @SerializedName("MEDIAN")
    @Expose
    val mEDIAN: Double? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    val lASTVOLUME: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lASTVOLUMETO: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    val lASTTRADEID: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    val vOLUMEDAY: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val vOLUMEDAYTO: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val vOLUME24HOUR: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val vOLUME24HOURTO: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    val oPENDAY: Double? = null,

    @SerializedName("HIGHDAY")
    @Expose
    val hIGHDAY: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    val lOWDAY: Double? = null,

    @SerializedName("OPEN24HOUR")
    @Expose
    val oPEN24HOUR: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    val hIGH24HOUR: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    val lOW24HOUR: Double? = null,

    @SerializedName("LASTMARKET")
    @Expose
    val lASTMARKET: String? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val vOLUMEHOUR: Double? = null,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val vOLUMEHOURTO: Double? = null,

    @SerializedName("OPENHOUR")
    @Expose
    val oPENHOUR: Double? = null,

    @SerializedName("HIGHHOUR")
    @Expose
    val hIGHHOUR: Double? = null,

    @SerializedName("LOWHOUR")
    @Expose
    val lOWHOUR: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val tOPTIERVOLUME24HOUR: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val tOPTIERVOLUME24HOURTO: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val cHANGE24HOUR: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val cHANGEPCT24HOUR: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    val cHANGEDAY: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val cHANGEPCTDAY: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    val cHANGEHOUR: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val cHANGEPCTHOUR: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val cONVERSIONTYPE: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val cONVERSIONSYMBOL: String? = null,

    @SerializedName("SUPPLY")
    @Expose
    val sUPPLY: Int? = null,

    @SerializedName("MKTCAP")
    @Expose
    val mKTCAP: Double? = null,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val tOTALVOLUME24H: Double? = null,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val tOTALVOLUME24HTO: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val tOTALTOPTIERVOLUME24H: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val tOTALTOPTIERVOLUME24HTO: Double? = null,

    @SerializedName("IMAGEURL")
    @Expose
    val iMAGEURL: String? = null
)