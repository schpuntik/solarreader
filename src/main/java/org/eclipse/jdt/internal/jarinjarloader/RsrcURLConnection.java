/*******************************************************************************
 * Copyright (c) 2008, 2009 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Ferenc Hechler - initial API and implementation
 *     Ferenc Hechler, ferenc_hechler@users.sourceforge.net - 219530 [jar application] add Jar-in-Jar ClassLoader option
 *     Ferenc Hechler, ferenc_hechler@users.sourceforge.net - 262746 [jar exporter] Create a builder for jar-in-jar-loader.zip
 *     Ferenc Hechler, ferenc_hechler@users.sourceforge.net - 262748 [jar exporter] extract constants for string literals in JarRsrcLoader et al.
 *******************************************************************************/
package org.eclipse.jdt.internal.jarinjarloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

/**
 * This class will be compiled into the binary jar-in-jar-loader.zip. This ZIP is used for the
 * "Runnable JAR File Exporter"
 *
 * @since 3.5
 */
public class RsrcURLConnection extends URLConnection
{

  private final ClassLoader classLoader;

  public RsrcURLConnection(URL url, ClassLoader classLoader)
  {
    super(url);
    this.classLoader = classLoader;
  }

  @Override public void connect() throws IOException
  {
  }

  @Override public InputStream getInputStream() throws IOException
  {
    String file = URLDecoder.decode(url.getFile(), JIJConstants.UTF8_ENCODING);
    InputStream result = classLoader.getResourceAsStream(file);
    if (result == null)
    {
      throw new MalformedURLException("Could not open InputStream for URL '" + url + "'"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    return result;
  }

}
