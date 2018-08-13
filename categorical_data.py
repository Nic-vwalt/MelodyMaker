
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

dataset = pd.read_csv('CSV Kom hier')
X = dataset.iloc[:, :-1].values
y = dataset.iloc[:, 3].values


#Hierdie is om die nan na 0 toe te convert
from sklearn.preprocessing import Imputer
imputer = Imputer(missing_values = 'NaN', strategy = 'mean', axis = 0)
imputer = imputer.fit(X[:, 1:3])
X[:, 1:3] = imputer.transform(X[:, 1:3])

#Hierdie is om die strings in die X of onafhangklike veranderlike array na nommers toe te vat
from sklearn.preprocessing import LabelEncoder, OneHotEncoder
labelencodeerderX = LabelEncoder()
X[:, 0] = labelencodeerderX.fit_transform(X[:, 0])
onehotencoder = OneHotEncoder(categorical_features = [0])
X = onehotencoder.fit_transform(X).toarray()

#Hierdie is om die strings in die Y of afhangklike veranderlike array na nommers toe te vat
labelencodeerderY = LabelEncoder()
y = labelencodeerderY.fit_transform(y)