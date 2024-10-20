package dev.ikm.layout.selection;

import dev.ikm.layout.selection.element.PatternAttributeSelection;
import dev.ikm.layout.selection.element.StampElementSelection;
import dev.ikm.tinkar.common.id.PublicIdStringKey;
import dev.ikm.tinkar.terms.ConceptFacade;
import dev.ikm.tinkar.terms.EntityFacade;
import org.eclipse.collections.api.list.ImmutableList;

import java.util.Optional;
import java.util.UUID;

public sealed interface SelectableElement
    permits SelectableIndexedElement, PatternAttributeSelection, StampElementSelection {

    ConceptFacade conceptForEnum();

}
