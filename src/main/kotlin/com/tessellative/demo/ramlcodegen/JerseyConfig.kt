package com.tessellative.demo.ramlcodegen

import com.tessellative.demo.ramlcodegen.web.AlbumController
import com.tessellative.demo.ramlcodegen.web.ArtistController
import com.tessellative.demo.ramlcodegen.web.SongController
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component


@Component
class JerseyConfig : ResourceConfig() {

    init {
        register(SongController::class.java)
        register(ArtistController::class.java)
        register(AlbumController::class.java)
    }

}