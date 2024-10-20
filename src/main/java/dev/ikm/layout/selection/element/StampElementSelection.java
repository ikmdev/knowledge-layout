package dev.ikm.layout.selection.element;

import dev.ikm.layout.selection.SelectableElement;
import dev.ikm.layout.selection.VersionSelection;
import dev.ikm.tinkar.terms.ConceptFacade;

public record StampElementSelection(VersionSelection.StampElement stampElement) implements SelectableElement {

    @Override
    public ConceptFacade conceptForEnum() {
        return stampElement.conceptForEnum();
    }
}
