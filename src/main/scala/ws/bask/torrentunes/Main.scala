package ws.bask.torrentunes

import scalaj.http.Http

object Main extends App {
	val req = Http("https://itunes.apple.com/search").param("term","nastya").asString
	println(req)
}