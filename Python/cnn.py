# -*- coding: utf-8 -*-
"""
Created on Tue May 15 11:01:53 2018

@author: Kathi
"""

from keras.models import Sequential 
from keras.layers import SeparableConv2D,AveragePooling2D,Flatten,Dense
from keras.losses import categorical_hinge
from keras.optimizers import SGD

model = Sequential()
model.add(SeparableConv2D(32,5,5,input_shape=(64,64,3),activation='relu',))
model.add(AveragePooling2D(pool_size = (3,3)))
model.add(SeparableConv2D(32,5,5,activation='relu'))
model.add(AveragePooling2D(pool_size = (3,3)))
model.compile(loss='categorical_hinge',optimizer='SGD')

import keras.preprocessing.image as img_processor

