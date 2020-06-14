"""import pyPdf2

pdf = pyPdf.PdfFileReader(open('/home/kathi/Downloads/Data Science from Scratch First Principles with Python.pdf', "rb"))
for page in pdf.pages:
    print (page.extractText())
"""
"""import os
import subprocess

for top, dirs, files in os.walk('/home/kathi/Downloads'):
    for filename in files:
        if filename.endswith('.pdf'):
            abspath = os.path.join(top, filename)
            subprocess.call('lowriter --invisible --convert-to doc "{}"'
                            .format(abspath), shell=True)
                            """
import textract

f = open("res.txt","w+")
line=textract.process("/home/kathi/Downloads/Cracking the Coding Interview.pdf")
f.write(line.decode("utf-8"))
f.close()    
