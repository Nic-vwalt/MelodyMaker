##genre array with temp values 
arrGenres = ["Jazz","Blues","Classic","Rock","Metal"]



##mood array with temp values
arrMoods = ["Happy","Sad","Excited","Aggressive","Humorous","None"]


  


##Class to get genres
def Genres():
    tempGenre = input("Please Select a Genre: ")
    checkGen = False
    if tempGenre.isdigit():
        for i, x in enumerate(arrGenres):
            if int(tempGenre) == i+1:
                varGenre = x
                checkGen = True             
    else:
         for i, x in enumerate(arrGenres):
             if tempGenre.lower() in [x.lower() for x in arrGenres]:
                 checkGen = True
                 varGenre = x
    if checkGen == False:
        print("Please Select a genre: ")
        varGenre = Genres()
    else:
        return varGenre
import datetime

def Moods():
    tempMood = input("Please Select a mood: ")
    checkMood = False
    if tempMood.isdigit():
        for i, x in enumerate(arrMoods):
            if int(tempMood) == i+1:
                varMood = x
                checkMood = True             
    else:
        for i, x in enumerate(arrMoods):
            if tempGenre.lower() in [x.lower() for x in arrMoods]:
                checkMood = True
                varMood = x

    if checkMood == False:
	    print("Please select a mood: ")
	    varMood = Moods()
    else:
        return varMood

##Get Genre
for i, x in enumerate(arrGenres):
            print(i+1,x)
            
varGenre = Genres()

##Get Mood
for i, x in enumerate(arrMoods):
            print(i+1,x)
            
varMood = Moods()

varDate = datetime.datetime.now()

##Print Genre and mood for testing 
print(varGenre)
print(varMood)
print(varDate)

##Keep console open
input()


