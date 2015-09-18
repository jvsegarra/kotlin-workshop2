package interop

import org.apache.http.HttpResponse
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import traits.CustomerController
import kotlin.platform.platformStatic

// TODO: [interop] Create a smaller wrapper around Apache HttpClient to perform a GET and return a string as result
class SmallWrapper() {
    fun get(): String {
        val url: String = "http://www.google.com/search?q=httpClient"

        val client: HttpClient = HttpClientBuilder.create().build();
        val request: HttpGet = HttpGet(url);

        // add request header
        //request.addHeader("User-Agent", USER_AGENT);
        val response: HttpResponse = client.execute(request);

        var result: String = "Response Code : ${response.getStatusLine().getStatusCode()}";

        return result
    }
}

object Main {
    @platformStatic
    fun main(args: Array<String>) {
        val c = SmallWrapper()
        println(c.get())
    }
}