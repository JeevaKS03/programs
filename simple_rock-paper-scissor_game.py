import random

def main_game(comp_points,user_points):
    while True:
       choices=["rock","paper","sccisors"]
       user=input("User:")
       if user in choices:
          comp=random.choice(choices)
          print("Computer:",comp)
          if user==comp:
            print("Draw")
          elif user=="rock" and comp=="sccisors":
            print("User wins!")
            user_points+=1
          elif user=="sccisors" and comp=="paper":
            print("User wins")
            user_points+=1
          elif user=="paper" and comp=="rock":
            print("User wins")
            user_points+=1
          else:
            print("Computer wins!")    
            comp_points+=1
          print("User points:",user_points)
          print("Computer points:",comp_points)             
       else:
           print("Invalid choice")    
       con=input("Do you want to continue?[Y/N]")
       con=con.upper()
       if con=='Y':
         pass
       else:
         break  

def main():
   comp_points=0
   user_points=0
   main_game(comp_points,user_points)
   
main()
