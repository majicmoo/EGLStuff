import comicBooks.*;
import java.util.*;
import java.util.*;
class Images {
public static void main (String[] args) {
//aab<%

/**
 * Copyright (c) 2010 Ed Merks and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Ed Merks - Initial API and implementation
 */

//aab%>
//aab
//aabpackage <%
//aab=genModel.getEditPluginPackageName()
//aab%>;
//aab
//aab<%
genModel.markImportLocation(stringBuffer);
//aab%>
//aab
//aab/**
//aab * <!-- begin-user-doc -->
//aab * <!-- end-user-doc -->
//aab * @generated
//aab */
//aabpublic interface <%
//aab=genModel.getEditPluginClassName()
//aab%>Images extends <%
//aab=genModel.getImportedName("com.google.gwt.resources.client.ClientBundle")
//aab%>
//aab{
//aab<%
for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
//aab%>
//aab  <%
for (GenClass genClass : genPackage.getGenClasses()) {
//aab%>
//aab    <%
if (genClass.isImage()) { String image = genClass.getItemIconFileName(); image = image.substring(image.lastIndexOf("/icons/") + 1); 
//aab%>
//aab/**
//aab* <!-- begin-user-doc -->
//aab* <!-- end-user-doc -->
//aab* @generated
//aab*/
//aab@Source("<%
//aab=image
//aab%>")
//aab<%
//aab=genModel.getImportedName("com.google.gwt.resources.client.ImageResource")
//aab%> <%
//aab=genClass.getItemIconAccessorName()
//aab%>();
//aab
//aab    <%
}
//aab%>
//aab  <%
}
//aab%>
//aab<%
}
//aab%>
//aab}
//aab<%
genModel.emitSortedImports();
//aab%>

}
}