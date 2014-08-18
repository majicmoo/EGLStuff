class TestCase {
public static void main (String[] args) {
//aab<%import java.util.*;%>
//aab<%import org.eclipse.emf.codegen.ecore.genmodel.*;%>
//aab<% include("../Header.javajetinc");%>
//aab<% include("TestCase/unsetGenFeature.TODO.override.javajetinc");%>
//aab<% include("TestCase/implementedGenFeature.insert.javajetinc");%>
//aab<% include("TestCase/unsetGenFeature.override.javajetinc");%>
//aab<% include("TestCase/getGenFeature.TODO.override.javajetinc");%>
//aab<% include("TestCase/implementedGenFeature.override.javajetinc");%>
//aab<% include("TestCase/genOperation.annotations.insert.javajetinc");%>
//aab<% include("TestCase/isSetGenFeature.TODO.override.javajetinc");%>
//aab<% include("TestCase/isSetGenFeature.annotations.insert.javajetinc");%>
//aab<% include("TestCase/implementedGenOperation.override.javajetinc");%>
//aab<% include("TestCase/setGenFeature.annotations.insert.javajetinc");%>
//aab<% include("TestCase/getGenFeature.override.javajetinc");%>
//aab<% include("TestCase/implementedGenOperation.insert.javajetinc");%>
//aab<% include("TestCase/insert.javajetinc");%>
//aab<% include("TestCase/implementedGenOperation.TODO.override.javajetinc");%>
//aab<% include("TestCase/setGenFeature.TODO.override.javajetinc");%>
//aab<% include("TestCase/isSetGenFeature.override.javajetinc");%>
//aab<% include("TestCase/getGenFeature.annotations.insert.javajetinc");%>
//aab<% include("TestCase/setGenFeature.override.javajetinc");%>
//aab<% include("TestCase/unsetGenFeature.annotations.insert.javajetinc");%>
//aab<%

/**
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

//aab%>
//aabpackage <%
//aab=genPackage.getTestsPackageName()
//aab%>;
//aab
//aab<%
genModel.markImportLocation(stringBuffer);
//aab%>
//aab
//aab/**
//aab * <!-- begin-user-doc -->
//aab * A test case for the model object '<em><b><%
//aab=genClass.getFormattedName()
//aab%></b></em>'.
//aab * <!-- end-user-doc -->
//aab<%
if (!genClass.getImplementedGenFeatures().isEmpty()) { boolean first = true;
//aab%>
//aab  <%
for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
//aab%>
//aab    <%
if (genFeature.isTested() && !genFeature.isSuppressedGetVisibility()) {
//aab%>
//aab      <%
if (first) { first = false;
//aab%>
//aab * <p>
//aab * The following features are tested:
//aab * <ul>
//aab      <%
}
//aab%>
//aab *   <li>{@link <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#<%
//aab=genFeature.getGetAccessor()
//aab%>() <em><%
//aab=genFeature.getFormattedName()
//aab%></em>}</li>
//aab    <%
}
//aab%>
//aab  <%
}
//aab%>
//aab  <%
 if (!first) {
//aab%>
//aab * </ul>
//aab * </p>
//aab  <%
}
//aab%>
//aab<%
}
//aab%>
//aab<%
if (!genClass.getImplementedGenOperations().isEmpty()) { boolean first = true;
//aab%>
//aab  <%
for (GenOperation genOperation : genClass.getImplementedGenOperations()) {
//aab%>
//aab    <%
if (first) { first = false;
//aab%>
//aab * <p>
//aab * The following operations are tested:
//aab * <ul>
//aab    <%
}
//aab%>
//aab *   <li>{@link <%
//aab=genOperation.getGenClass().getQualifiedInterfaceName()
//aab%>#<%
//aab=genOperation.getName()
//aab%>(<%
//aab=genOperation.getParameterTypes(", ")
//aab%>) <em><%
//aab=genOperation.getFormattedName()
//aab%></em>}</li>
//aab  <%
}
//aab%>
//aab  <%
 if (!first) {
//aab%>
//aab * </ul>
//aab * </p>
//aab  <%
}
//aab%>
//aab<%
}
//aab%>
//aab * @generated
//aab */
//aabpublic<%
if (genClass.isAbstract()) {
//aab%> abstract<%
}
//aab%> class <%
//aab=genClass.getTestCaseClassName()
//aab%> extends <%
//aab*%%storeSymbol%%*1//aab%>
//aab{
//aab<%
if (genModel.hasCopyrightField()) {
//aab%>
//aab
//aab	/**
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @generated
//aab	 */
//aab	public static final <%
//aab=genModel.getImportedName("java.lang.String")
//aab%> copyright = <%
//aab=genModel.getCopyrightFieldLiteral()
//aab%>;<%
//aab=genModel.getNonNLS()
//aab%>
//aab<%
}
//aab%>
//aab<%
if (genModel.getDriverNumber() != null) {
//aab%>
//aab
//aab	/**
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @generated
//aab	 */
//aab	public static final <%
//aab=genModel.getImportedName("java.lang.String")
//aab%> mofDriverNumber = "<%
//aab=genModel.getDriverNumber()
//aab%>";<%
//aab=genModel.getNonNLS()
//aab%>
//aab<%
}
//aab%>
//aab<%
if (genClass.isModelRoot()) {
//aab%>
//aab
//aab	/**
//aab	 * The fixture for this <%
//aab=genClass.getFormattedName()
//aab%> test case.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @generated
//aab	 */
//aab	protected <%
//aab=genClass.getImportedInterfaceName()
//aab%><%
//aab=genClass.getInterfaceWildTypeArguments()
//aab%> fixture = null;
//aab<%
}
//aab%>
//aab<%
if (!genClass.isAbstract()) {
//aab%>
//aab
//aab	/**
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @generated
//aab	 */
//aab	public static void main(String[] args)
//aab	{
//aab		<%
//aab=genModel.getImportedName("junit.textui.TestRunner")
//aab%>.run(<%
//aab=genClass.getTestCaseClassName()
//aab%>.class);
//aab	}
//aab<%
}
//aab%>
//aab
//aab	/**
//aab	 * Constructs a new <%
//aab=genClass.getFormattedName()
//aab%> test case with the given name.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @generated
//aab	 */
//aab	public <%
//aab=genClass.getTestCaseClassName()
//aab%>(String name)
//aab	{
//aab		super(name);
//aab	}
//aab<%
if (genClass.isModelRoot()) {
//aab%>
//aab
//aab	/**
//aab	 * Sets the fixture for this <%
//aab=genClass.getFormattedName()
//aab%> test case.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @generated
//aab	 */
//aab	protected void setFixture(<%
//aab=genClass.getImportedInterfaceName()
//aab%><%
//aab=genClass.getInterfaceWildTypeArguments()
//aab%> fixture)
//aab	{
//aab		this.fixture = fixture;
//aab	}
//aab<%
}
//aab%>
//aab
//aab	/**
//aab	 * Returns the fixture for this <%
//aab=genClass.getFormattedName()
//aab%> test case.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @generated
//aab	 */
//aab<%
if (!genClass.isModelRoot() && genModel.useClassOverrideAnnotation()) {
//aab%>
//aab	@Override
//aab<%
}
//aab%>
//aab	<%
if (genModel.useGenerics()) {
//aab%>protected<%
} else {
//aab%>private<%
}
//aab%> <%
//aab=genClass.getImportedInterfaceName()
//aab%><%
//aab=genClass.getInterfaceWildTypeArguments()
//aab%> getFixture()
//aab	{
//aab<%
if (genClass.isModelRoot()) {
//aab%>
//aab		return fixture;
//aab<%
} else {
//aab%>
//aab		return (<%
//aab=genClass.getImportedInterfaceName()
//aab%><%
//aab=genClass.getInterfaceWildTypeArguments()
//aab%>)fixture;
//aab<%
}
//aab%>
//aab	}
//aab<%
if (!genClass.isAbstract()) {
//aab%>
//aab
//aab	/**
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @see junit.framework.TestCase#setUp()
//aab	 * @generated
//aab	 */
//aab<%
if (genModel.useClassOverrideAnnotation()) {
//aab%>
//aab	@Override
//aab<%
}
//aab%>
//aab<%
if (genModel.useGenerics() && genClass.isMapEntry()) {
//aab%>
//aab	@SuppressWarnings("unchecked")
//aab<%
}
//aab%>
//aab	protected void setUp() throws Exception
//aab	{
//aab  <%
if (genClass.isMapEntry()) {
//aab%>
//aab		setFixture((<%
//aab=genClass.getImportedInterfaceName()
//aab%><%
//aab=genClass.getInterfaceWildTypeArguments()
//aab%>)<%
//aab=genPackage.getQualifiedEFactoryInternalInstanceAccessor()
//aab%>.create(<%
//aab=genClass.getQualifiedClassifierAccessor()
//aab%>));
//aab  <%
} else {
//aab%>
//aab		setFixture(<%
//aab=genPackage.getQualifiedEFactoryInternalInstanceAccessor()
//aab%>.create<%
//aab=genClass.getName()
//aab%>());
//aab  <%
}
//aab%>
//aab	}
//aab
//aab	/**
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @see junit.framework.TestCase#tearDown()
//aab	 * @generated
//aab	 */
//aab<%
if (genModel.useClassOverrideAnnotation()) {
//aab%>
//aab	@Override
//aab<%
}
//aab%>
//aab	protected void tearDown() throws Exception
//aab	{
//aab		setFixture(null);
//aab	}
//aab<%
}
//aab%>
//aab<%
for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
//aab%>
//aab<%
//aab@ start 
//aab%>
//aab  <%
if (genFeature.isTested()) {
//aab%>
//aab    <%
if (genFeature.isGet() && !genFeature.isSuppressedGetVisibility()) {
//aab%>
//aab<%
//aab@ start 
//aab%>
//aab
//aab	/**
//aab	 * Tests the '{@link <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#<%
//aab=genFeature.getGetAccessor()
//aab%>() <em><%
//aab=genFeature.getFormattedName()
//aab%></em>}' feature getter.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @see <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#<%
//aab=genFeature.getGetAccessor()
//aab%>()
//aab	 * @generated
//aab	 */
//aab      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/getGenFeature.annotations.insert.javajetinc
//aab%>
//aab      <%
}
//aab%>
//aab	public void test<%
//aab=genModel.capName(genFeature.getGetAccessor())
//aab%>()
//aab	{
//aab<%
//aab@ start 
//aab%>
//aab		// TODO: implement this feature getter test method
//aab		// Ensure that you remove @generated or mark it @generated NOT
//aab		fail();
//aab<%
//aab@ end 
//aab%><%
//TestCase/getGenFeature.todo.override.javajetinc
//aab%>
//aab	}
//aab<%
//aab@ end 
//aab%><%
//TestCase/getGenFeature.override.javajetinc
//aab%>
//aab    <%
}
//aab%>
//aab    <%
if (genFeature.isSet() && !genFeature.isSuppressedSetVisibility()) {
//aab%>
//aab<%
//aab@ start 
//aab%>
//aab
//aab	/**
//aab	 * Tests the '{@link <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#set<%
//aab=genFeature.getAccessorName()
//aab%>(<%
//aab=genFeature.getRawBoundType()
//aab%>) <em><%
//aab=genFeature.getFormattedName()
//aab%></em>}' feature setter.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @see <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#set<%
//aab=genFeature.getAccessorName()
//aab%>(<%
//aab=genFeature.getRawBoundType()
//aab%>)
//aab	 * @generated
//aab	 */
//aab      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/setGenFeature.annotations.insert.javajetinc
//aab%>
//aab      <%
}
//aab%>
//aab	public void testSet<%
//aab=genFeature.getAccessorName()
//aab%>()
//aab	{
//aab<%
//aab@ start 
//aab%>
//aab		// TODO: implement this feature setter test method
//aab		// Ensure that you remove @generated or mark it @generated NOT
//aab		fail();
//aab<%
//aab@ end 
//aab%><%
//TestCase/setGenFeature.todo.override.javajetinc
//aab%>
//aab	}
//aab<%
//aab@ end 
//aab%><%
//TestCase/setGenFeature.override.javajetinc
//aab%>
//aab    <%
}
//aab%>
//aab    <%
if (genFeature.isUnset() && !genFeature.isSuppressedUnsetVisibility()) {
//aab%>
//aab<%
//aab@ start 
//aab%>
//aab
//aab	/**
//aab	 * Tests the '{@link <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#unset<%
//aab=genFeature.getAccessorName()
//aab%>() <em>unset<%
//aab=genFeature.getAccessorName()
//aab%>()</em>}' method.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @see <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#unset<%
//aab=genFeature.getAccessorName()
//aab%>()
//aab	 * @generated
//aab	 */
//aab      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/unsetGenFeature.annotations.insert.javajetinc
//aab%>
//aab      <%
}
//aab%>
//aab	public void testUnset<%
//aab=genFeature.getAccessorName()
//aab%>()
//aab	{
//aab<%
//aab@ start 
//aab%>
//aab		// TODO: implement this test method
//aab		// Ensure that you remove @generated or mark it @generated NOT
//aab		fail();
//aab<%
//aab@ end 
//aab%><%
//TestCase/unsetGenFeature.todo.override.javajetinc
//aab%>
//aab	}
//aab<%
//aab@ end 
//aab%><%
//TestCase/unsetGenFeature.override.javajetinc
//aab%>
//aab    <%
}
//aab%>
//aab    <%
if (genFeature.isIsSet() && !genFeature.isSuppressedIsSetVisibility()) {
//aab%>
//aab<%
//aab@ start 
//aab%>
//aab
//aab	/**
//aab	 * Tests the '{@link <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#isSet<%
//aab=genFeature.getAccessorName()
//aab%>() <em>isSet<%
//aab=genFeature.getAccessorName()
//aab%>()</em>}' method.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @see <%
//aab=genFeature.getGenClass().getQualifiedInterfaceName()
//aab%>#isSet<%
//aab=genFeature.getAccessorName()
//aab%>()
//aab	 * @generated
//aab	 */
//aab      <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/isSetGenFeature.annotations.insert.javajetinc
//aab%>
//aab      <%
}
//aab%>
//aab	public void testIsSet<%
//aab=genFeature.getAccessorName()
//aab%>()
//aab	{
//aab<%
//aab@ start 
//aab%>
//aab		// TODO: implement this test method
//aab		// Ensure that you remove @generated or mark it @generated NOT
//aab		fail();
//aab<%
//aab@ end 
//aab%><%
//TestCase/isSetGenFeature.todo.override.javajetinc
//aab%>
//aab	}
//aab<%
//aab@ end 
//aab%><%
//TestCase/isSetGenFeature.override.javajetinc
//aab%>
//aab    <%
}
//aab%>
//aab  <%
}
//aab%>
//aab<%
//aab@ end 
//aab%><%
//TestCase/implementedGenFeature.override.javajetinc
//aab%>
//aab<%
}
//aab%>
//aab<%
for (GenOperation genOperation : genClass.getImplementedGenOperations()) {
//aab%>
//aab<%
//aab@ start 
//aab%>
//aab
//aab	/**
//aab	 * Tests the '{@link <%
//aab=genOperation.getGenClass().getQualifiedInterfaceName()
//aab%>#<%
//aab=genOperation.getName()
//aab%>(<%
//aab=genOperation.getParameterTypes(", ")
//aab%>) <em><%
//aab=genOperation.getFormattedName()
//aab%></em>}' operation.
//aab	 * <!-- begin-user-doc -->
//aab	 * <!-- end-user-doc -->
//aab	 * @see <%
//aab=genOperation.getGenClass().getQualifiedInterfaceName()
//aab%>#<%
//aab=genOperation.getName()
//aab%>(<%
//aab=genOperation.getParameterTypes(", ")
//aab%>)
//aab	 * @generated
//aab	 */
//aab  <%
if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) { //TestCase/genOperation.annotations.insert.javajetinc
//aab%>
//aab  <%
}
//aab%>
//aab	public void test<%
//aab=genClass.getUniqueName(genOperation)
//aab%>()
//aab	{
//aab<%
//aab@ start 
//aab%>
//aab		// TODO: implement this operation test method
//aab		// Ensure that you remove @generated or mark it @generated NOT
//aab		fail();
//aab<%
//aab@ end 
//aab%><%
//TestCase/implementedGenOperation.todo.override.javajetinc
//aab%>
//aab	}
//aab<%
//aab@ end 
//aab%><%
//TestCase/implementedGenOperation.override.javajetinc
//aab%>
//aab<%
}
//aab%>
//aab
//aab} //<%
//aab=genClass.getTestCaseClassName()
//aab%>
//aab<%
genModel.emitSortedImports();
//aab%>

}
}