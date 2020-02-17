package be.jcrafters.thiboya.prognostician;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryPrognosticsRepository implements PrognosticsRepository {

	private static final AtomicLong count = new AtomicLong();
	private Map<Long, List<String>> prognostics = new HashMap<>();

	void add(String matchName, List<String> data) {
		prognostics.put(count.getAndIncrement(), data);
	}

	@Override
	public Map<Long, List<String>> getAll() {
		return Collections.unmodifiableMap(prognostics);
	}

	@Override
	public void add(List<String> results) {
		prognostics.put(count.getAndIncrement(), results);
	}
}
