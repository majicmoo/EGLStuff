## Write Tests
## To run make sure src file is in src
import os
import glob

def writeTests(name, src, directory_of_files_translating, model):

    imports = set()
    classList = set()
    test_file= open(name+".java", "w")
    # This is added onto each var name incase they are a keyword (eg. class)
    addition = "temp"
    #Write imports
    test_file.write("import org.eclipse.epsilon.emc.emf.EmfModelFactory;\nimport org.eclipse.epsilon.eol.models.IModel;\nimport java.io.File;\nimport java.io.PrintWriter;\n")
    
 
    ## Write all imports on src file
    for directory in os.walk(src):
        imports = addImport(directory[0], imports, src)
    
    for i in imports:
        test_file.write("import "+ i + ".*;\n")
       
    imports = set()
    # import all classes
    fmatches = []
    for root, dirnames, files in os.walk(src):
        for fname in files:
            if fname.endswith(".java"):
                imports = addImportClass(os.path.join(root, fname), imports, src)
            
    for i in imports:
        test_file.write("import "+ i + ";\n")

       
    #test_file.write("import emf.*;")
    #Write main class
    test_file.write("\npublic class " +name+"{\n\tpublic static void main(String[] args) throws Exception {\n")
    
    #Write each class
    files = glob.glob(directory_of_files_translating)
    for fname in files:
        temp = open(fname, "r")
        className = findClass(temp.readlines()[0])
        classList.add(className)
        test_file.write("\t\t"+className.capitalize() + " " + className.lower()+addition + " = new " + className.capitalize() + "();\n")
        
    #Load Model
    test_file.write("\t\tFile modelFile = new File(\"" + model +"\");\n\t\tIModel model = EmfModelFactory.getInstance().loadEmfModel(\"OurModel\", modelFile, ComicBooksPackage.eINSTANCE);\n\n")
    
    for i in classList:
        test_file.write("\t\tPrintWriter writer"+i+" = new PrintWriter(\"./compare/jet"+i+".txt\", \"UTF-8\");\n\t\tfor (Object component : model.allContents()){\n")
        test_file.write("\t\t\twriter"+i+".println(" + i.lower()+addition +".generate(component));\n\t\t}")
        test_file.write("\n\t\twriter"+i+".close();\n\n")
    test_file.write("\t}\n}")
     
def addImport(directory, imports, src):
    if directory != src:
        imports.add(directory.split("/")[1])
        return imports
    else:
        return imports
        
def addImportClass(name, imports, src):
    for i in imports:
        if name.split(".")[0].split("/")[-1] in i:
            return imports
    if name != src:
        temp = src+"."
        imports.add(name.split(".")[0].replace("/",".").replace(temp, ""))
        return imports
    else:
        return imports
        
def findClass(line):
    for i in line.split():
        if "class=" in i:
            return i.replace("%>", "").replace("\"", "").replace("class=", "").strip()






## To run swap "./tmp/comicBooks.model" with your model     
writeTests("TempJetTest", "src",  "jet/*", "./tmp/comicBooks.model" )
