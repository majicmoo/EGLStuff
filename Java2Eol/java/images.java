
GenModel genModel = (GenModel)argument; /* Trick to import java.util.* without warnings */Iterator.class.getName();
include file="../Header.javajetinc"
package =genModel.getEditPluginPackageName();

genModel.markImportLocation(stringBuffer);

public interface =genModel.getEditPluginClassName() Images extends=genModel.getImportedName("com.google.gwt.resources.client.ClientBundle")
{
for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
  for (GenClass genClass : genPackage.getGenClasses()) {
    if (genClass.isImage()) { String image = genClass.getItemIconFileName(); image = image.substring(image.lastIndexOf("/icons/") + 1);
genModel.getImportedName("com.google.gwt.resources.client.ImageResource") =genClass.getItemIconAccessorName()();

    }
  }
}
}
