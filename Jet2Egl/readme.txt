README

To run:

run: sh test.sh

What this does:

1. Runs jettojavaalmost.py

JET -> Java
This looks through the jet template and takes the includes and imports to the top of the file. It comments out the static parts of jet that don't need transforming. It takes out parts of the transformation that need transforming but don't fit the java syntax and puts them into a new file called filenametemp.java. An example of something that this happens to would be this:

<%=genClass.isModelRoot() ? genModel.getImportedName("junit.framework.TestCase") : genClass.getClassExtendsGenClass().getImportedTestCaseClassName()%>

It then wraps the file in a class so TXL will parse it as java code.


2. Runs transform.py

Java -> EOL
This runs TXL to convert everything in ./java to eol code. It puts the finished transformations in ./eol.


3. Runs ./eoltoeglalmost.py

EOL -> EGL
This uncomments all the static parts of the transformation and slots the parts of the transformation back into the file


4. Runs formatter.py

This formats the EGL code, removing unneeded whitespace and cleans up the code in general.






commands for me

compile JetTest: javac -cp packages/*:src:. JetTest.java
run JetTest: java -cp packages/*:src:. JetTest






java -cp 

epsilon-1.1_SR1-ant-emf.jar:
org.eclipse.emf.ecore_2.9.0.v20130528-0742.jar:
org.eclipse.emf.common_2.9.0.v20130528-0742.jar:
org.eclipse.emf.ecore.xmi_2.9.0.v20130528-0742.jar:
. Testing


