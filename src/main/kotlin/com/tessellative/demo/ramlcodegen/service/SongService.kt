package com.tessellative.demo.ramlcodegen.service

import com.tessellative.demo.ramlcodegen.model.Song
import org.springframework.stereotype.Service
import java.util.*

@Service
class SongService {
    fun random(): Song {
        val song = Song()
        song.albumId = UUID.randomUUID().toString()
        song.songId = UUID.randomUUID().toString()
        song.songTitle = UUID.randomUUID().toString().split("-")[0]
        return song
    }

}