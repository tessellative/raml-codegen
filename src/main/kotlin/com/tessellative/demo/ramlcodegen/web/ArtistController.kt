package com.tessellative.demo.ramlcodegen.web

import com.tessellative.demo.ramlcodegen.model.Artist
import com.tessellative.demo.ramlcodegen.model.ArtistsArtistIdAlbumsGetOrder
import com.tessellative.demo.ramlcodegen.model.ArtistsGetOrder
import com.tessellative.demo.ramlcodegen.resources.Artists

class ArtistController: Artists {
    override fun getArtists(query: String?, orderBy: String?, order: ArtistsGetOrder?, offset: Int, limit: Int): Artists.GetArtistsResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun postArtists(accessToken: String?, entity: Artist?): Artists.PostArtistsResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArtistsByArtistId(artistId: String?): Artists.GetArtistsByArtistIdResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArtistsAlbumsByArtistId(artistId: String?, orderBy: String?, order: ArtistsArtistIdAlbumsGetOrder?, offset: Int, limit: Int): Artists.GetArtistsAlbumsByArtistIdResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}