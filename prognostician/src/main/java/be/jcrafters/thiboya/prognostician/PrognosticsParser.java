package be.jcrafters.thiboya.prognostician;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;

import io.micronaut.core.util.StringUtils;

class PrognosticsParser {

	String toResults(String rawData) {
		List<String> results = Stream.of(rawData.split("\n"))
				.filter(StringUtils::isNotEmpty)
				.filter(line -> line.contains("-"))
				.collect(toList());

		return String.join("\n", results);
	}

}
