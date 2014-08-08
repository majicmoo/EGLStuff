import glob
import os

def main(fname):
    file_origin = open(fname, "r")
    file_edit = open("temp.txt", "w")
    
    path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/egl"
    
    file_destination = open(os.path.join(path, cleanFileName(fname)+".egl"), "w")
    
    
    
    ## remove comments
    for line in file_origin:
        if "//aab" in line:
           writeToFile(file_edit, line.replace("//aab", ""))
        else:
            writeToFile(file_edit, line)            
    file_edit.close()
    file_edit = open("temp.txt", "r")
    
    ## change brackets
    for line in file_edit:
        if line != "\n" :
            temp = line.replace("%>", "%]")
            writeToFile(file_destination, temp.replace("<%", "[%"))
      
        
    file_origin.close()
    file_edit.close()
    file_destination.close()  
           

def writeToFile(filename, string):
    filename.write(string)
    
def cleanFileName(fname):
    temp = fname.split("/")
    temp = temp[-1]
    temp = temp.split(".")
    return temp[0]


path = "/usr/userfs/m/mep513/Documents/EGLStuff/Jet2Egl/eol/*"
files = glob.glob(path)
print files
for fname in files:
    main(fname) 
