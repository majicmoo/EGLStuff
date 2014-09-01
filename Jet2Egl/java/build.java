class build {
public static void main (String[] args) {
//&&&staticSymbol&&&<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//&&&staticSymbol&&&<%import java.util.*;%>
//&&&staticSymbol&&&<%include("../Header.propertiesjetinc");%>
//&&&staticSymbol&&&<%

/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 */

//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
GenModel genModel = (GenModel)argument;
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
String pluginClassesLocation = genModel.isRuntimeJar() ? genModel.getModelPluginID()+".jar" : ".";
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
List<String> sourceFolders = genModel.getModelSourceFolders();
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&
//&&&staticSymbol&&&bin.includes = <%
//&&&staticSymbol&&&=pluginClassesLocation
//&&&staticSymbol&&&%>,\
//&&&staticSymbol&&&               model/,\
//&&&staticSymbol&&&<%
if (genModel.sameModelEditProject() || genModel.sameModelEditorProject()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&               icons/,\
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.isBundleManifest()) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&               META-INF/,\
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
if (genModel.getRuntimePlatform() != GenRuntimePlatform.GWT) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&               plugin.xml,\
//&&&staticSymbol&&&<%
}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&               plugin.properties
//&&&staticSymbol&&&jars.compile.order = <%
//&&&staticSymbol&&&=pluginClassesLocation
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&<%
 boolean first=true; for (Iterator<String> i = sourceFolders.iterator(); i.hasNext();) { String sourceFolder = i.next(); if (i.hasNext()){sourceFolder +=",\\";} if (first) {
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&source.<%
//&&&staticSymbol&&&=pluginClassesLocation
//&&&staticSymbol&&&%> = <%
//&&&staticSymbol&&&=sourceFolder
//&&&staticSymbol&&&%><%
first=false;} else {
//&&&staticSymbol&&&%><%
//&&&staticSymbol&&&=sourceFolder
//&&&staticSymbol&&&%><%
}}
//&&&staticSymbol&&&%>
//&&&staticSymbol&&&output.<%
//&&&staticSymbol&&&=pluginClassesLocation
//&&&staticSymbol&&&%> = bin/

}
}