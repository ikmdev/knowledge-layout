package dev.ikm.layout.selection;

import dev.ikm.layout.selection.element.FieldDefinitionSelection;
import dev.ikm.layout.selection.element.FieldValueSelection;

public sealed interface SelectableIndexedElement extends SelectableElement
    permits FieldDefinitionSelection, FieldValueSelection {
    int index();
}
