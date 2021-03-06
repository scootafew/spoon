package spoon.test.prettyprinter.testclasses;

/**
 * Copyright (C) 2006-2019 INRIA and contributors
 *
 * Spoon is available either under the terms of the MIT License (see LICENSE-MIT.txt) of the Cecill-C License (see LICENSE-CECILL-C.txt). You as the user are entitled to choose the terms under which to adopt Spoon.
 */
import spoon.reflect.cu.SourcePositionHolder;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.EarlyTerminatingScanner;

public class ElementScan {

	public void isElementExists(SourcePositionHolder element) {
		EarlyTerminatingScanner<Boolean> scanner = new EarlyTerminatingScanner<Boolean>() {
			@Override
			protected void enter(CtElement e) {
				if (element == e) {
				}
			}
		};
	}
}