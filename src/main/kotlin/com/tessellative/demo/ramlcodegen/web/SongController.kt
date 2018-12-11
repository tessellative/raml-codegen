package com.tessellative.demo.ramlcodegen.web

import com.tessellative.demo.ramlcodegen.model.Song
import com.tessellative.demo.ramlcodegen.model.SongsGetOrder
import com.tessellative.demo.ramlcodegen.model.SongsSongIdFileContentPostMultipartFormData
import com.tessellative.demo.ramlcodegen.resources.Songs
import java.io.InputStream

class SongController: Songs {

    override fun getSongs(query: String?, orderBy: String?, order: SongsGetOrder?, offset: Int, limit: Int): Songs.GetSongsResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun postSongs(accessToken: String?, entity: Song?): Songs.PostSongsResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSongsBySongId(songId: String?): Songs.GetSongsBySongIdResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSongsFileContentBySongId(songId: String?): Songs.GetSongsFileContentBySongIdResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun postSongsFileContentBySongId(songId: String?, entity: InputStream?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun postSongsFileContentBySongId(songId: String?, entity: SongsSongIdFileContentPostMultipartFormData?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}