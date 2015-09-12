package gettingStarted

import java.io.File


// TODO: [gettingStarted] Convert the code in FileCoder to Kotlin
class Filecoder {
    fun printDirectory() {
        val files = File("Something")
        val fileList = files.listFiles()

        if (fileList != null) {
            println(fileList.size())
        }
    }
}