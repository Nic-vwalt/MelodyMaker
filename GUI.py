
##genre array with temp values 
arrGenres = ["jazz","blues","classic","rock","metal"]

##mood array with temp values
arrMoods = ["Happy","Sad","Excited","Aggressive","humorous"]

temp = ["Help"]

##function that handles genre input
def Genres():
    ##Prompts users for Genre input
    tempGenre = input("Provide a genre <Type ""Help"" for the list of genres>")
##If user requires help
    if tempGenre.lower() == "help":
        for x in arrGenres:
            print(x)
            
        tempGenre = Genres()
    elif tempGenre.lower() in [x.lower() for x in arrGenres]:
        return tempGenre
    else:
        print("The genre is not contained in the genre list")
        tempGenre = Genres()

def Moods():
    
    ##Prompts users for Genre input
    tempMood = input("Provide a mood <Type ""Help"" for the list of moods>")
##If user requires help
    if tempMood.lower() == "help":
        for x in temp:
            print(x)
            
        tempMood = Moods()
    elif tempMood.lower() in [x.lower() for x in arrMoods] :
        return tempMood
    else:
        print("The genre is not contained in the genre list")
        tempMood = Moods()

varGenre = Genres()
varMood = Moods()
print(varGenre)
print(varMood)
input()

