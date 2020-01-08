secret_word = "Suraj"
guessed_word = ""
guessing_limit = 1

while secret_word!=guessed_word and guessing_limit<=3:
    if guessed_word == secret_word:
        print("You Won!!!")

    elif guessing_limit>3 and secret_word!=guessed_word:
        print("You lose")

    else:
        guessed_word = input("Enter a Guess : ")
        guessing_limit += 1

if secret_word!=guessed_word:
    print("You Lose")

if secret_word==guessed_word:
    print("You Won")