package com.dawar.sparknetwork.models

data class Location(val lat: Double?, val lng: Double?) {
    constructor() : this(null, null)
}