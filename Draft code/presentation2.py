##genre array with temp values 
arrGenres = ["Jazz","Blues","Classic","Rock","Metal"]

##mood array with temp values
arrMoods = ["Happy","Sad","Excited","Aggressive","Humorous","None"]

            
##Class to get genres
def Genres():
	tempGenre = input("Select Genre <>")
	checkGen = False

	for i, x in enumerate(arrGenres):
		##if int(tempGenre) == i+1:
			##varGenre = x
			##checkGen = True
			##return varGenre
		if tempGenre.lower() in [x.lower() for x in arrGenres]:
			checkGen = True
			return tempGenre

	if checkGen == False:
		print("Please select a genre")
		varGenre = Genres()

		







##Class to get moods
def Moods():
	tempMood = input("Select a mood <>")
	checkMood = False

	for i, x in enumerate(arrMoods):
		##if tempMood == i+1:
			##varMood = x
			##checkMood = True
			##return varGenre
		if tempMood.lower() in [x.lower() for x in arrMoods]:
			checkMood = True
			return tempMood

	if checkMood == False:
		print("Please select a genre")
		varGenre = Moods()

##Get Genre
for i, x in enumerate(arrGenres):
            print(i+1,x)
varGenre = Genres()

##Get Mood
for i, x in enumerate(arrMoods):
            print(i+1,x)
varMood = Moods()

##Print Genre and mood for testing 
print(varGenre)
print(varMood)

##Keep console open
input()


