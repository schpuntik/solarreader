/*******************************************************************************
 * Copyright (c) 2007, 2017 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Ferenc Hechler, ferenc_hechler@users.sourceforge.net - 262748 [jar exporter] extract constants for string literals in JarRsrcLoader et al.
 *******************************************************************************/
package org.eclipse.jdt.internal.jarinjarloader;

/**
 * Constants used in the Jar-in-Jar loader.
 * <p>
 * Some of these are duplicated in JIJConstants in the source for the Runnable Jar File Export Wizard:
 *
 * @since 3.6
 */
final class JIJConstants
{

  static final String REDIRECTED_CLASS_PATH_MANIFEST_NAME = "Class-Path";  //$NON-NLS-1$
  static final String REDIRECTED_MAIN_CLASS_MANIFEST_NAME = "Rsrc-Main-Class";  //$NON-NLS-1$
  static final String DEFAULT_REDIRECTED_CLASSPATH = "";  //$NON-NLS-1$
  static final String MAIN_METHOD_NAME = "main";  //$NON-NLS-1$
  static final String JAR_INTERNAL_URL_PROTOCOL_WITH_COLON = "jar:rsrc:";  //$NON-NLS-1$
  static final String JAR_INTERNAL_SEPARATOR = "!/";  //$NON-NLS-1$
  static final String INTERNAL_URL_PROTOCOL_WITH_COLON = "rsrc:";  //$NON-NLS-1$
  static final String INTERNAL_URL_PROTOCOL = "rsrc";  //$NON-NLS-1$
  static final String PATH_SEPARATOR = "/";  //$NON-NLS-1$
  static final String CURRENT_DIR = "./";  //$NON-NLS-1$
  static final String UTF8_ENCODING = "UTF-8";  //$NON-NLS-1$
  static final String RUNTIME = "#runtime";  //$NON-NLS-1$

  private JIJConstants()
  {
  }

}
