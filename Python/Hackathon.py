# -*- coding: utf-8 -*-
"""
Created on Tue Aug  7 00:32:24 2018

@author: Kathi
"""

#Import Statements
import pandas as pd
from keras.models import Sequential
from keras.layers import Dense,Conv2D,GlobalAveragePooling2D,Flatten
import os
from resizeimage import resizeimage
from PIL import Image
from sklearn.preprocessing import OneH

#Read CSV
csv_filename = os.path.join(os.path.realpath('__file__'), '../meta-data/meta-data/train.csv') 
dataset = pd.read_csv(csv_filename)

#Split into X & Y
X_train = dataset.Image_id
y = dataset.Animal



#NN Model 
model = Sequential()

#CNN Model
model.add(Conv2D(32,[4,4],2,input_dim=(64,64,3),activation='relu'))
model.add(GlobalAveragePooling2D())
model.add(Conv2D(32,[4,4],2,activation='relu'))
model.add(GlobalAveragePooling2D())

#Single row martrix
model.add(Flatten())


#NN Model 
model.add(Dense(output_dim=128,activation='relu'))
model.add(Dense(output_dim=__,metrics=['acuuracy']))

model.compile("")
for x_label,y_label in zip(X_train,Y_train):
    image =  Image.open(os.path.join(os.path.realpath('train/train'),x_label))
    resize_img = resizeimage.resize_cover(image,[64,64])
    
    

