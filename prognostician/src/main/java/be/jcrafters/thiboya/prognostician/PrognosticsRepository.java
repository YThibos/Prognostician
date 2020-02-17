package be.jcrafters.thiboya.prognostician;

import java.util.List;
import java.util.Map;

public interface PrognosticsRepository {
	Map<Long, List<String>> getAll();

	void add(List<String> results);
}
