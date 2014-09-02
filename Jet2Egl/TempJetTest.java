import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.models.IModel;
import java.io.File;
import java.io.PrintWriter;
import org.*;
import org.eclipse.emf.codegen.ecore.templates.model.EnumClass;
import org.eclipse.emf.codegen.ecore.templates.editor.ActionBarContributor;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelPackageImpl;
import org.eclipse.emf.codegen.ecore.templates.editor.Advisor;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimePlatform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.templates.editor.ModelWizard;
import org.eclipse.emf.codegen.ecore.genmodel.GenDelegationKind;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral;
import org.eclipse.emf.codegen.ecore.templates.editor.AppEngineWebXML;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.codegen.ecore.genmodel.GenParameter;
import org.eclipse.emf.codegen.ecore.templates.model.ModuleGWTXML;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelImpl;
import org.eclipse.emf.codegen.ecore.templates.model.tests.TestCase;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenTypeParameterImpl;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenEnumImpl;
import org.eclipse.emf.codegen.ecore.genmodel.GenPropertyKind;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenEnumGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.templates.model.PluginProperties;
import org.eclipse.emf.codegen.ecore.gwt.GWTBuilder;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.templates.editor.Editor;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelValidator;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassImpl;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenBaseImpl;
import org.eclipse.emf.codegen.ecore.templates.model.BuildProperties;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenProviderKind;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenParameterImpl;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelFactoryImpl;
import org.eclipse.emf.codegen.ecore.templates.editor.HomeHTML;
import org.eclipse.emf.codegen.ecore.templates.model.PluginXML;
import org.eclipse.emf.codegen.ecore.templates.model.tests.ModelTestSuite;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;
import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelSwitch;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenDataTypeImpl;
import org.eclipse.emf.codegen.ecore.templates.editor.EntryPoint;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenOperationImpl;
import org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter;
import org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenFeatureImpl;
import org.eclipse.emf.codegen.ecore.templates.model.ValidatorClass;
import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.templates.model.AdapterFactoryClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenDecoration;
import org.eclipse.emf.codegen.ecore.templates.model.ManifestMF;
import org.eclipse.emf.codegen.ecore.templates.edit.ItemProviderAdapterFactory;
import org.eclipse.emf.codegen.ecore.templates.model.XMLProcessorClass;
import org.eclipse.emf.codegen.ecore.templates.model.SwitchClass;
import org.eclipse.emf.codegen.ecore.templates.model.tests.PackageTestSuite;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenTypedElementImpl;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.templates.edit.ItemProvider;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenClassGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.templates.model.tests.PackageExample;
import org.eclipse.emf.codegen.ecore.genmodel.impl.Literals;
import org.eclipse.emf.codegen.ecore.templates.model.PackageClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.templates.edit.Images;
import org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.GenRuntimeVersion;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenClassifierImpl;
import org.eclipse.emf.codegen.ecore.templates.model.ResourceClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenAnnotationImpl;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.templates.model.ResourceFactoryClass;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenEnumLiteralImpl;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenPackageGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;

public class TempJetTest{
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