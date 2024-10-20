package dev.ikm.layout.orchestration.process;

import dev.ikm.layout.event.KlPerformanceEvent;
import dev.ikm.layout.event.KlRequestEvent;
import dev.ikm.layout.orchestration.KlEventOrchestrator;
import org.eclipse.collections.api.list.ImmutableList;

public class MultiComponentSelect implements KlEventOrchestrator {
    @Override
    public ImmutableList<KlRequestEvent> orchestrate(KlPerformanceEvent klPerformanceEvent) {
        return null;
    }
}
