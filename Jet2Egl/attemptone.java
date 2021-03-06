import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.models.IModel;
import java.io.File;
import java.io.PrintWriter;
import org.*;

public class JetTest{
	public static void main(String[] args) throws Exception {
		Images imagestemp = new Images();
		Testcase testcasetemp = new Testcase();
		Images imagestemp = new Images();
		Testcase testcasetemp = new Testcase();
		Itemprovider itemprovidertemp = new Itemprovider();
		Testeverything testeverythingtemp = new Testeverything();
		Itemprovideradapterfactory itemprovideradapterfactorytemp = new Itemprovideradapterfactory();
		Plugin plugintemp = new Plugin();
		Properties propertiestemp = new Properties();
		Buildproperties buildpropertiestemp = new Buildproperties();
		Manifestmf manifestmftemp = new Manifestmf();
		Pluginproperties pluginpropertiestemp = new Pluginproperties();
		Pluginxml pluginxmltemp = new Pluginxml();
		Actionbarcontributor actionbarcontributortemp = new Actionbarcontributor();
		Advisor advisortemp = new Advisor();
		Editor editortemp = new Editor();
		Entrypoint entrypointtemp = new Entrypoint();
		Modelwizard modelwizardtemp = new Modelwizard();
		Appenginewebxml appenginewebxmltemp = new Appenginewebxml();
		Homehtml homehtmltemp = new Homehtml();
		Webxml webxmltemp = new Webxml();
		Modeltestsuite modeltestsuitetemp = new Modeltestsuite();
		Packageexample packageexampletemp = new Packageexample();
		Packagetestsuite packagetestsuitetemp = new Packagetestsuite();
		Adapterfactoryclass adapterfactoryclasstemp = new Adapterfactoryclass();
		Class classtemp = new Class();
		Enumclass enumclasstemp = new Enumclass();
		Factoryclass factoryclasstemp = new Factoryclass();
		Packageclass packageclasstemp = new Packageclass();
		Resourceclass resourceclasstemp = new Resourceclass();
		Resourcefactoryclass resourcefactoryclasstemp = new Resourcefactoryclass();
		Switchclass switchclasstemp = new Switchclass();
		Validatorclass validatorclasstemp = new Validatorclass();
		Xmlprocessorclass xmlprocessorclasstemp = new Xmlprocessorclass();
		File modelFile = new File("./tmp/comicBooks.model");
		IModel model = EmfModelFactory.getInstance().loadEmfModel("OurModel", modelFile, ComicBooksPackage.eINSTANCE);

		PrintWriter writerEnumClass = new PrintWriter("./compare/jetEnumClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerEnumClass.println(enumclasstemp.generate(component));
		}
		writerEnumClass.close();

		PrintWriter writerBuildProperties = new PrintWriter("./compare/jetBuildProperties.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerBuildProperties.println(buildpropertiestemp.generate(component));
		}
		writerBuildProperties.close();

		PrintWriter writerWebXML = new PrintWriter("./compare/jetWebXML.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerWebXML.println(webxmltemp.generate(component));
		}
		writerWebXML.close();

		PrintWriter writerPluginXML = new PrintWriter("./compare/jetPluginXML.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerPluginXML.println(pluginxmltemp.generate(component));
		}
		writerPluginXML.close();

		PrintWriter writerResourceFactoryClass = new PrintWriter("./compare/jetResourceFactoryClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerResourceFactoryClass.println(resourcefactoryclasstemp.generate(component));
		}
		writerResourceFactoryClass.close();

		PrintWriter writerPackageExample = new PrintWriter("./compare/jetPackageExample.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerPackageExample.println(packageexampletemp.generate(component));
		}
		writerPackageExample.close();

		PrintWriter writerEditor = new PrintWriter("./compare/jetEditor.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerEditor.println(editortemp.generate(component));
		}
		writerEditor.close();

		PrintWriter writerItemProvider = new PrintWriter("./compare/jetItemProvider.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerItemProvider.println(itemprovidertemp.generate(component));
		}
		writerItemProvider.close();

		PrintWriter writerResourceClass = new PrintWriter("./compare/jetResourceClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerResourceClass.println(resourceclasstemp.generate(component));
		}
		writerResourceClass.close();

		PrintWriter writerAdapterFactoryClass = new PrintWriter("./compare/jetAdapterFactoryClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerAdapterFactoryClass.println(adapterfactoryclasstemp.generate(component));
		}
		writerAdapterFactoryClass.close();

		PrintWriter writerItemProviderAdapterFactory = new PrintWriter("./compare/jetItemProviderAdapterFactory.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerItemProviderAdapterFactory.println(itemprovideradapterfactorytemp.generate(component));
		}
		writerItemProviderAdapterFactory.close();

		PrintWriter writerAppEngineWebXML = new PrintWriter("./compare/jetAppEngineWebXML.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerAppEngineWebXML.println(appenginewebxmltemp.generate(component));
		}
		writerAppEngineWebXML.close();

		PrintWriter writerValidatorClass = new PrintWriter("./compare/jetValidatorClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerValidatorClass.println(validatorclasstemp.generate(component));
		}
		writerValidatorClass.close();

		PrintWriter writerTestCase = new PrintWriter("./compare/jetTestCase.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerTestCase.println(testcasetemp.generate(component));
		}
		writerTestCase.close();

		PrintWriter writerAdvisor = new PrintWriter("./compare/jetAdvisor.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerAdvisor.println(advisortemp.generate(component));
		}
		writerAdvisor.close();

		PrintWriter writerPackageClass = new PrintWriter("./compare/jetPackageClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerPackageClass.println(packageclasstemp.generate(component));
		}
		writerPackageClass.close();

		PrintWriter writerProperties = new PrintWriter("./compare/jetProperties.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerProperties.println(propertiestemp.generate(component));
		}
		writerProperties.close();

		PrintWriter writerClass = new PrintWriter("./compare/jetClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerClass.println(classtemp.generate(component));
		}
		writerClass.close();

		PrintWriter writerManifestMF = new PrintWriter("./compare/jetManifestMF.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerManifestMF.println(manifestmftemp.generate(component));
		}
		writerManifestMF.close();

		PrintWriter writerPlugin = new PrintWriter("./compare/jetPlugin.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerPlugin.println(plugintemp.generate(component));
		}
		writerPlugin.close();

		PrintWriter writerXMLProcessorClass = new PrintWriter("./compare/jetXMLProcessorClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerXMLProcessorClass.println(xmlprocessorclasstemp.generate(component));
		}
		writerXMLProcessorClass.close();

		PrintWriter writerImages = new PrintWriter("./compare/jetImages.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerImages.println(imagestemp.generate(component));
		}
		writerImages.close();

		PrintWriter writerActionBarContributor = new PrintWriter("./compare/jetActionBarContributor.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerActionBarContributor.println(actionbarcontributortemp.generate(component));
		}
		writerActionBarContributor.close();

		PrintWriter writerModelTestSuite = new PrintWriter("./compare/jetModelTestSuite.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerModelTestSuite.println(modeltestsuitetemp.generate(component));
		}
		writerModelTestSuite.close();

		PrintWriter writerHomeHTML = new PrintWriter("./compare/jetHomeHTML.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerHomeHTML.println(homehtmltemp.generate(component));
		}
		writerHomeHTML.close();

		PrintWriter writerPluginProperties = new PrintWriter("./compare/jetPluginProperties.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerPluginProperties.println(pluginpropertiestemp.generate(component));
		}
		writerPluginProperties.close();

		PrintWriter writerModelWizard = new PrintWriter("./compare/jetModelWizard.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerModelWizard.println(modelwizardtemp.generate(component));
		}
		writerModelWizard.close();

		PrintWriter writerEntryPoint = new PrintWriter("./compare/jetEntryPoint.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerEntryPoint.println(entrypointtemp.generate(component));
		}
		writerEntryPoint.close();

		PrintWriter writerFactoryClass = new PrintWriter("./compare/jetFactoryClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerFactoryClass.println(factoryclasstemp.generate(component));
		}
		writerFactoryClass.close();

		PrintWriter writerSwitchClass = new PrintWriter("./compare/jetSwitchClass.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerSwitchClass.println(switchclasstemp.generate(component));
		}
		writerSwitchClass.close();

		PrintWriter writerPackageTestSuite = new PrintWriter("./compare/jetPackageTestSuite.txt", "UTF-8");
		for (Object component : model.allContents()){
			writerPackageTestSuite.println(packagetestsuitetemp.generate(component));
		}
		writerPackageTestSuite.close();

		PrintWriter writertestEverything = new PrintWriter("./compare/jettestEverything.txt", "UTF-8");
		for (Object component : model.allContents()){
			writertestEverything.println(testeverythingtemp.generate(component));
		}
		writertestEverything.close();

	}
}