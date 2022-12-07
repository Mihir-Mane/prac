#supervised learning
import numpy as np
#import time
np.set_printoptions(precision=2)
x=np.zeros((3,))
weights=np.zeros((3,))
desired=np.zeros((3,))
actual=np.zeros((3,))

for i in range(0,3):
    x[i]=float(input("Initial Inputs: "))
for i in range(0,3):
    weights[i]=float(input("Initial Weights: "))
for i in range(0,3):
    desired[i]=float(input("Desired Output: "))

a=float(input("Enter learning rate: "))
actual=x*weights
print("Actual: ",actual)
print("Desired: ",desired)

while True:
    if np.array_equal(desired,actual):
        break                                                #nochange
    else:
        for i in range(0,3):
            weights[i]=weights[i]+a*(desired[i]-actual[i])
    actual=x*weights
    print("Weights: ",weights)
    print("Actual: ",actual)
    print("Desired: ",desired)
print("*"*40)
print("Final Output")
print("Corrected Weights", weights)
print("Actual: ",actual)
print("Desired: ",desired)
