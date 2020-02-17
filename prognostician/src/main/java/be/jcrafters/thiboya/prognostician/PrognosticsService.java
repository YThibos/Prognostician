package be.jcrafters.thiboya.prognostician;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import io.micronaut.core.util.StringUtils;

class PrognosticsService {

	private PrognosticsRepository prognosticsRepository = new InMemoryPrognosticsRepository();

	String parse(String rawData) {
		List<String> results = Stream.of(rawData.split("\n"))
				.filter(StringUtils::isNotEmpty)
				.filter(line -> line.contains("-"))
				.collect(toList());

		prognosticsRepository.add(results);

		return String.join("\n", results);
	}

	Map<Long, List<String>> getAll() {
		return prognosticsRepository.getAll();
	}

}
