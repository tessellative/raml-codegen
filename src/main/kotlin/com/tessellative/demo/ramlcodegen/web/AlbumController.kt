package com.tessellative.demo.ramlcodegen.web

import com.fasterxml.jackson.databind.ObjectMapper
import com.tessellative.demo.ramlcodegen.logger
import com.tessellative.demo.ramlcodegen.model.Album
import com.tessellative.demo.ramlcodegen.model.AlbumsAlbumIdSongsGetOrder
import com.tessellative.demo.ramlcodegen.model.AlbumsGetOrder
import com.tessellative.demo.ramlcodegen.model.Song
import com.tessellative.demo.ramlcodegen.resources.Albums
import com.tessellative.demo.ramlcodegen.service.AlbumService
import com.tessellative.demo.ramlcodegen.service.SongService
import org.springframework.stereotype.Component

@Component
class AlbumController(val songService: SongService, val albumService: AlbumService) : Albums {

    companion object {
        private val log = logger(AlbumController::class.java)
    }

    override fun getAlbums(query: String?, orderBy: String?, order: AlbumsGetOrder?, offset: Int, limit: Int): Albums.GetAlbumsResponse {
        val albumResult = mutableListOf<Album>()
        (1..limit).forEach {
            albumResult.add(albumService.random())
        }
        return Albums.GetAlbumsResponse.respond200WithApplicationJson(albumResult)
    }

    override fun postAlbums(accessToken: String?, entity: Album?): Albums.PostAlbumsResponse {
        log.info(ObjectMapper().writeValueAsString(entity))
        return Albums.PostAlbumsResponse.respond200WithApplicationJson("ok")
    }

    override fun getAlbumsByAlbumId(albumId: String?): Albums.GetAlbumsByAlbumIdResponse {
        val album = albumService.random()
        album.albumId = albumId
        return Albums.GetAlbumsByAlbumIdResponse.respond200WithApplicationJson(album)
    }

    override fun getAlbumsSongsByAlbumId(albumId: String?, orderBy: String?, order: AlbumsAlbumIdSongsGetOrder?): Albums.GetAlbumsSongsByAlbumIdResponse {
        val songsResult = mutableListOf<Song>()
        (1..8).forEach {
            val randomSong = songService.random()
            randomSong.albumId = albumId
            songsResult += randomSong
        }
        return Albums.GetAlbumsSongsByAlbumIdResponse.respond200WithApplicationJson(songsResult)
    }

}