package be.jcrafters.thiboya.prognostician;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/prognostics")
public class PrognosticsController {

	@Post(consumes = MediaType.TEXT_PLAIN, produces = MediaType.TEXT_PLAIN)
	public String parseAll(String data) {
		return "Hello world!";
	}

	@Get(produces = MediaType.TEXT_PLAIN)
	public String getAll() {
		return "Not implemented yet.";
	}

}
