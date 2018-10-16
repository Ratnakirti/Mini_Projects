import random

def disp_intro():
    print("*" * 24)
    print("\tMathematics Quiz")
    print("*" * 24)

def disp_menu():
    m_list = ["1. Addition", "2. Subtraction", "3. Multiplication", "4. Integer Division", "5. Exit"]
    print(m_list[0])
    print(m_list[1])
    print(m_list[2])
    print(m_list[3])
    print(m_list[4])

def disp_separator():
    print("-" * 24)

def get_user_input():
    user_input = int(input("Enter your choice: "))
    while user_input > 5 or user_input <= 0:
        print("Invalid menu option.")
        user_input = int(input("Please try again: "))
    else:
        return user_input

def get_user_sol(prob):
    print("Enter your answer")
    print(prob, end="")
    result = int(input(" = "))
    return result

def check_sol(user_sol, sol, ctr):
    if user_sol == sol:
        ctr = ctr + 1
        print("Correct.")
        return ctr
    else:
        print("Incorrect.")
        return ctr

def menu_option(pos, ctr):
    first_num = random.randrange(1, 11)
    second_num = random.randrange(1, 11)
    if pos is 1:
        prob = str(first_num) + " + " + str(second_num)
        sol = first_num + second_num
        user_sol = get_user_sol(prob)
        ctr = check_sol(user_sol, sol, ctr)
        return ctr
    elif pos is 2:
        prob = str(first_num) + " - " + str(second_num)
        sol = first_num - second_num
        user_sol = get_user_sol(prob)
        ctr = check_sol(user_sol, sol, ctr)
        return ctr
    elif pos is 3:
        prob = str(first_num) + " * " + str(second_num)
        sol = first_num * second_num
        user_sol = get_user_sol(prob)
        ctr = check_sol(user_sol, sol, ctr)
        return ctr
    else:
        prob = str(first_num) + " / " + str(second_num)
        sol = first_num // second_num
        user_sol = get_user_sol(prob)
        ctr = check_sol(user_sol, sol, ctr)
        return ctr

def disp_result(tot, correct):
    if tot > 0:
        result = correct / tot
        percent = round((result * 100), 2)
    if tot == 0:
        percent = 0
    print("You answered", tot, "questions with", correct, "correct.")
    print("Your score is ", percent, "%. Thank you.")

def main():
    disp_intro()
    disp_menu()
    disp_separator()
    option = get_user_input()
    tot = 0
    correct = 0
    while option != 5:
        tot = tot + 1
        correct = menu_option(option, correct)
        option = get_user_input()
    print("Exit the quiz.")
    disp_separator()
    disp_result(tot, correct)
main()