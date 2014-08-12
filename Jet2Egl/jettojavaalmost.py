import os
import glob


def main(fname):
    imports = []
    includes = set() 
    inDynamic = False
    startStatic = 0
    file_origin = open(fname, "r")
    file_edit = open("temp.txt", "w")
    path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/java"
    file_destination = open(os.path.join(path, cleanFileName(fname)+".java"), "w")
    
    ## loop through jet file
    ##  1. Look for imports and store in a list
    ##  2. Look for includes and store in a list
    ##  3. Comment out static parts of Jet with symbol "//aab" and save changes to temporary file
    for line in file_origin:
        imports = findImports(line, imports)
        includes = findIncludes(line, includes)
        inDynamic = commentStatic(line, file_edit, inDynamic)
          
    ##write main class to allow java transformation to work
    writeToFile(file_destination, "class "+cleanFileName(fname)+ " {\n")
    writeToFile(file_destination, "public static void main (String[] args) {\n")
    
    # write imports to destination
    for i in imports:
        writeToFile(file_destination, "//aab<%import " + i + ";%>\n")
    
    #write includes to destination
    for i in includes:
        print i
        writeToFile(file_destination, "//aab<% include(\""+i+"\");%>\n")
    
    file_edit.close()
    file_edit = open("temp.txt", "r")
    

    ##write dynamic code
    for line in file_edit:
        if "=" in line:
            if line.index('=') == 0:
                writeToFile( file_destination, "//aab"+line)
            else:
                writeToFile( file_destination, line)
        else:
            writeToFile( file_destination, line)
    
    #close main funciton
    writeToFile(file_destination, "\n}\n}")
    file_origin.close()
    file_edit.close()
    file_destination.close()  
    
        
def commentStatic(line, filename, inDynamic):
    count = 0
    ##returns if an import statement
    if "import" in line:
        return inDynamic
    
    ##returns if an import statement   
    if "@ include" in line:
        return inDynamic

    temp = False
    for char in line:
        if inDynamic == False:
            if count == 0:
                writeToFile(filename, "//aab")
            if temp == True:
                temp = False
                if (char == "%"):
                    inDynamic = True
                    writeToFile(filename, char)
                    writeToFile(filename, "\n")
                    ##print "Entering Dynamic\n"
                    ##print char
                else:
                    writeToFile(filename, char)
                    ##print char
            else:
                if char == "<":
                    temp = True
                writeToFile(filename, char)
                ##print char
                
                    
        else:
            if temp == True:
                temp = False
                if (char == ">"):
                    inDynamic = False
                    writeToFile(filename, "\n" +"//aab%>")
                    ##print "Exiting Dynamic\n"
                   ## print char
                else:
                    writeToFile(filename, char)
                    ##print char
            else:
                if char == "%":
                    temp = True
                    ##print char
                else:
                    writeToFile(filename, char)
                    ##print char
        count += 1
    return inDynamic
        

def findImports(line, imports):
    if "imports" in line:
        a = line.split("\"")
        temp = a[a.index(" imports=")+1].split()
        for i in temp:
            imports.append(clean(i))
    return imports
            


def findIncludes(line, includes):
    if "@ include" in line:
        temp = line.split()
        for i in temp:
            if "file" in i:
                a = i.split("=")
                includes.add(clean(a[1]))
    return includes

   
def clean(string):
    temp = ""
    for i in string:
        if ((i != "\"") and (i != "%") and ( i != "<") and (i != ">")):
            temp += i
    return temp

def writeToFile(file_to, string):
    file_to.write(string)

def cleanFileName(fname):
    temp = fname.split("/")
    temp = temp[-1]
    temp = temp.split(".")
    return temp[0]

path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/jet/*"
files = glob.glob(path)
print "************************"
print "Transforming Jet to Java"
for fname in files:
    print fname
    main(fname)   
print "************************"
