from tkinter import *
from tkinter import filedialog 
def savefile():
    file=filedialog.asksaveasfile(defaultextension=".txt",filetypes=[("Text file",".txt"),("HTML file",".html"),("ALL files",".*")])
    filetxt=str(text.get(1.0,END))
    try:
      file.write(filetxt)
      file.close()
    except AttributeError:
       pass
         
window =Tk()
window.config(bg="black")
window.title("Notepad")
icon=PhotoImage(file="mylogo.png")
window.iconphoto(True,icon)
button=Button(text="SAVE",command=savefile,bg="grey",font=("Arial",10,"bold"),relief=RAISED,bd=5)
button.pack(side="bottom")
text=Text(window,fg="#00FF00",bg="black",font=("Arial",15,"bold"),insertbackground='grey')
text.pack()
   

window.mainloop()
