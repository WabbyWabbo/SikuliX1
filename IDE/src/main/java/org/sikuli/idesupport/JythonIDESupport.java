/*
 * Copyright (c) 2010-2018, sikuli.org, sikulix.com - MIT license
 */
package org.sikuli.idesupport;

import org.sikuli.script.runners.JythonRunner;
import org.sikuli.script.runners.PythonRunner;
import org.sikuli.script.support.generators.ICodeGenerator;
import org.sikuli.script.support.generators.JythonCodeGenerator;

/**
 * all methods from/for IDE, that are Python specific
 */
public class JythonIDESupport implements IIDESupport {

	@Override
	public String[] getTypes() {
		return new String[]{JythonRunner.TYPE, PythonRunner.TYPE};
	}

	@Override
	public IIndentationLogic getIndentationLogic() {
		return new PythonIndentation();
	}

	@Override
  public ICodeGenerator getCodeGenerator() {
    return new JythonCodeGenerator();
  }
}
