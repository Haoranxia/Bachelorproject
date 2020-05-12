import math

def LVQ(prototypes, data):

    training_steps = 1000
    for i in range(0, training_steps):

        for prototype in prototypes:
            min_distance = math.inf
            closest_datapoint = None

            for datapoint in data:
                distance = datapoint - prototype 
            
                if distance < min_distance:
                    min_distance = distance
                    closest_datapoint = datapoint
            
            move_prototype(closest_datapoint, min_distance, prototype)
                

def move_prototype(datapoint, distance, prototype):
    factor = 0.1

    if datapoint.malicious == prototype.malicious:
        


[a,b,c,d,e,f,g] 
[1,2,3,4,5,6,7]
[a-1, b-2, c-3,...]

p[1] = p[1] + d[1],

for coord1 in prototype:
    for coord2 in data:


        



