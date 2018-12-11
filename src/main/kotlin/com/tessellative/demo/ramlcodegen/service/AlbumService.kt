package com.tessellative.demo.ramlcodegen.service

import com.tessellative.demo.ramlcodegen.model.Album
import org.springframework.stereotype.Service
import java.util.*

@Service
class AlbumService {

    fun random(): Album {
        val album = Album()
        album.albumId = UUID.randomUUID().toString()
        album.albumName = UUID.randomUUID().toString()
        album.artistId = UUID.randomUUID().toString()
        album.iamgeURL = UUID.randomUUID().toString()
        album.year = "2018"
        album.genreCode = UUID.randomUUID().toString().split("-")[0]
        return album
    }

}
