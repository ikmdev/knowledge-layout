package dev.ikm.layout.selection.element;

import dev.ikm.layout.selection.PatternVersionSelection;
import dev.ikm.layout.selection.SelectableElement;
import dev.ikm.tinkar.terms.ConceptFacade;

public record PatternAttributeSelection(PatternVersionSelection.PatternAttribute patternAttribute) implements SelectableElement {
    @Override
    public ConceptFacade conceptForEnum() {
        return patternAttribute.conceptForEnum();
    }
}
