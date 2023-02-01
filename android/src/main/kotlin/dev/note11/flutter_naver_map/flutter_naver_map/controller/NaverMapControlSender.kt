package dev.note11.flutter_naver_map.flutter_naver_map.controller

import com.naver.maps.geometry.LatLng
import com.naver.maps.map.Symbol
import com.naver.maps.map.indoor.IndoorSelection
import dev.note11.flutter_naver_map.flutter_naver_map.model.NPoint

internal interface NaverMapControlSender {
    fun onMapReady()

    fun onMapTapped(nPoint: NPoint, latLng: LatLng)

    fun onSymbolTapped(symbol: Symbol): Boolean?

    fun onCameraChange(cameraUpdateReason: Int, animated: Boolean)

    fun onCameraIdle()

    fun onSelectedIndoorChanged(selectedIndoor: IndoorSelection?)
}