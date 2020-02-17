package be.jcrafters.thiboya.prognostician;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/prognostics")
public class PrognosticsController {

	private PrognosticsService prognosticsService = new PrognosticsService();

	@Post(consumes = MediaType.TEXT_PLAIN, produces = MediaType.TEXT_PLAIN)
	public String parseAll(String data) {
		Logger.getLogger(this.getClass().getSimpleName()).log(Level.INFO, "Request received. Payload: \n" + data);
		return prognosticsService.toResults(data);
	}

	@Get(produces = MediaType.TEXT_PLAIN)
	public String getAll() {
		return "Not implemented yet. Using dummy values: \n" +
		       "Joske 1-1 \n" +
		       "Jefke 2-1 \n" +
		       "Sjarel 5-0 \n";
	}

}
