package com.github.nikokann.json_gson_change

import java.net.URI

data class VoiceRecognitions(

    var dateStart:String,
    var dataEnd:String,
    var title:String,
    var soundURI: URI,
    var id:String,
 //   var voices:MutableList<Voices>(),
)


data class Voices(
    var id:String,
    var time:String,
    var text:String
)
